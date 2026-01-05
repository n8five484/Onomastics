package net.n8five484.onomastics.mixin;

import net.n8five484.onomastics.Onomastics;
import net.n8five484.onomastics.accessor.VillagerAccessor;
import net.n8five484.onomastics.api.VillagerNameGenerator;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.village.VillagerData;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Mixin(VillagerEntity.class)
public abstract class VillagerEntityMixin extends MerchantEntity implements VillagerAccessor {
    public String firstName;
    public String lastName;
    public String originalLastName;

    public VillagerEntityMixin(EntityType<? extends MerchantEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Inject(method = "writeCustomDataToNbt", at = @At("TAIL"), cancellable = true)
    public void writeCustomDataToNbt(NbtCompound nbt, CallbackInfo info) {
        if (this.firstName != null) {
            nbt.putString("FirstName", this.firstName);
        }
        if (this.lastName != null) {
            nbt.putString("LastName", this.lastName);
        }
        if (this.originalLastName != null) {
            nbt.putString("OriginalLastName", this.originalLastName);
        }
    }

    @Inject(method = "readCustomDataFromNbt", at = @At("TAIL"), cancellable = true)
    public void readCustomDataFromNbt(NbtCompound nbt, CallbackInfo info) {
        if (!nbt.getString("FirstName").isEmpty()) {
            this.firstName = nbt.getString("FirstName");
        }
        if (!nbt.getString("LastName").isEmpty()) {
            this.lastName = nbt.getString("LastName");
        }
        if (!nbt.getString("OriginalLastName").isEmpty()) {
            this.originalLastName = nbt.getString("OriginalLastName");
        }
    }

    @Inject(method = "onGrowUp", at = @At("TAIL"), cancellable = true)
    protected void onGrowUp(CallbackInfo ci) {
        if (!this.hasCustomName()) {
            if (this.firstName == null) {
                this.firstName = VillagerNameGenerator.createFirstName(this.random);
            }
            if (this.lastName == null) {
                this.lastName = VillagerNameGenerator.createLastName(this.firstName, this.random);
            }

            List<String> fullNameArray = new ArrayList<>();

            while (VillagerNameGenerator.sameAsLastName(this.firstName, this.lastName)) {
                if (this.random.nextInt(2) == 1) {
                    this.firstName = VillagerNameGenerator.createFirstName(this.random);
                } else {
                    this.lastName = VillagerNameGenerator.createLastName(this.firstName, this.random);
                }
            }
            fullNameArray.add(this.firstName);
            fullNameArray.add(this.lastName);

            this.setCustomName(Text.of(String.join(" ", fullNameArray)));
        }
    }

    @Inject(method = "initialize", at = @At("TAIL"), cancellable = true)
    public void initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, CallbackInfoReturnable info) {
        if ((firstName == null || lastName == null) && !this.hasCustomName()) {
            if (this.isBaby()) {
                Onomastics.LOGGER.debug("Child FirstName: " + this.firstName);
                Onomastics.LOGGER.debug("Child LastName: " + this.lastName);
            }
            if (firstName == null) {
                this.firstName = VillagerNameGenerator.createFirstName(this.random);
            }
            if (lastName == null) {
                this.lastName = VillagerNameGenerator.createLastName(this.firstName, this.random);
            }

            List<String> fullNameArray = new ArrayList<>();

            while (VillagerNameGenerator.sameAsLastName(this.firstName, this.lastName)) {
                if (this.random.nextInt(2) == 1 || (spawnReason == SpawnReason.BREEDING || (spawnReason == SpawnReason.SPAWN_EGG && this.isBaby()))) {
                    this.firstName = VillagerNameGenerator.createFirstName(this.random);
                } else {
                    this.lastName = VillagerNameGenerator.createLastName(this.firstName, this.random);
                }
            }
            fullNameArray.add(this.firstName);
            fullNameArray.add(this.lastName);
            if (this.isBaby()) {
                System.out.println("Full Name: " + this.firstName + " " + this.lastName);
            }
            this.setCustomName(Text.of(String.join(" ", fullNameArray)));
        }
    }
    @Inject(method = "createChild", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/passive/VillagerEntity;initialize(Lnet/minecraft/world/ServerWorldAccess;Lnet/minecraft/world/LocalDifficulty;Lnet/minecraft/entity/SpawnReason;Lnet/minecraft/entity/EntityData;)Lnet/minecraft/entity/EntityData;"), cancellable = true)
    public void createChild(ServerWorld serverWorld, PassiveEntity passiveEntity, CallbackInfoReturnable info, @Local VillagerEntity villagerEntity) {
        String[] lastNamesArray = {this.lastName, ((VillagerAccessor)passiveEntity).getLastName()};
        ((VillagerAccessor)villagerEntity).setLastName(lastNamesArray[random.nextInt(lastNamesArray.length)].toString());
    }

    @Inject(method = "setVillagerData", at = @At("TAIL"), cancellable = true)
    public void setVillagerData(VillagerData villagerData, CallbackInfo info) {
        if (!Objects.equals(villagerData.getProfession().toString(), "none")) {
            if (this.firstName == null) {
                this.firstName = VillagerNameGenerator.createFirstName(this.random);
            }
            this.originalLastName = this.lastName;
            this.lastName = VillagerNameGenerator.getProfessionLastName(villagerData.getProfession().toString(), this.firstName, this.lastName, this.random);

            this.setCustomName(Text.of(this.firstName + " " + this.lastName));
        } else {
            if (this.originalLastName != null) {
                this.lastName = this.originalLastName;
                this.setCustomName(Text.of(this.firstName + " " + this.lastName));
            }
        }
    }
}
