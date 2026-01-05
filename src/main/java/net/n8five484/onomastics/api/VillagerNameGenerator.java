package net.n8five484.onomastics.api;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.SpawnReason;
import net.minecraft.text.Text;
import net.minecraft.util.Util;
import net.minecraft.util.math.random.Random;

import java.util.*;

public class VillagerNameGenerator {

    public static boolean sameAsLastName(String firstName, String lastName) {
        if (Objects.equals(firstName, "Alan") && Objects.equals(lastName, "Allen")) {
            return true;
        }
        if ((Objects.equals(firstName, "Abbie") || Objects.equals(firstName, "Abby")) && Objects.equals(lastName, "Abbey")) {
            return true;
        }
        if (Objects.equals(firstName, "Arnold") && Objects.equals(lastName, "Arnould")) {
            return true;
        }
        if (Objects.equals(firstName, "Ashley") && lastName.startsWith("Ash")) {
            return true;
        }
        if (Objects.equals(firstName, "Augustus") && Objects.equals(lastName, "Augustine")) {
            return true;
        }
        if (Objects.equals(firstName, "Augustus") && Objects.equals(lastName, "Austin")) {
            return true;
        }
        if (Objects.equals(firstName, "Augustine") && Objects.equals(lastName, "Austin")) {
            return true;
        }
        if ((Objects.equals(firstName, "Bernard") && Objects.equals(lastName, "Barnard"))) {
            return true;
        }
        if ((Objects.equals(firstName, "Bernie") && Objects.equals(lastName, "Barnard"))) {
            return true;
        }
        if ((Objects.equals(firstName, "Bernie") && Objects.equals(lastName, "Bernard"))) {
            return true;
        }
        if ((Objects.equals(firstName, "Benedict") && Objects.equals(lastName, "Bennett")) || Objects.equals(firstName, "Bennett") && Objects.equals(lastName, "Benedict")) {
            return true;
        }
        if (Objects.equals(firstName, "Bella") && Objects.equals(lastName, "Bell")) {
            return true;
        }
        if (Objects.equals(firstName, "Belle") && Objects.equals(lastName, "Bell")) {
            return true;
        }
        if (Objects.equals(firstName, "Brad") && lastName.startsWith("Brad")) {
            return true;
        }
        if (Objects.equals(firstName, "Brice") && Objects.equals(lastName, "Bryce")) {
            return true;
        }
        if ((Objects.equals(firstName, "Chappell")) && (Objects.equals(lastName, "Chaple") || Objects.equals(lastName, "Chapple"))) {
            return true;
        }
        if ((Objects.equals(firstName, "Clark")) && (Objects.equals(lastName, "Clerk"))) {
            return true;
        }
        if ((Objects.equals(firstName, "Colin")) && (Objects.equals(lastName, "Collins"))) {
            return true;
        }
        if ((Objects.equals(firstName, "Colin")) && (Objects.equals(lastName, "Collinson"))) {
            return true;
        }
        if ((Objects.equals(firstName, "Curt")) && (Objects.equals(lastName, "Curtis"))) {
            return true;
        }
        if (Objects.equals(firstName, "Dave") && Objects.equals(lastName, "Davey")) {
            return true;
        }
        if (Objects.equals(firstName, "Davy") && Objects.equals(lastName, "Davey")) {
            return true;
        }
        if (Objects.equals(firstName, "Dob") && Objects.equals(lastName, "Dobbs")) {
            return true;
        }
        if (Objects.equals(firstName, "Earl") && Objects.equals(lastName, "Earle")) {
            return true;
        }
        if (Objects.equals(firstName, "Emery") && Objects.equals(lastName, "Emory")) {
            return true;
        }
        if (Objects.equals(firstName, "Eustace") && Objects.equals(lastName, "Eustis")) {
            return true;
        }
        if (Objects.equals(firstName, "Geoffrey") && Objects.equals(lastName, "Goff")) {
            return true;
        }
        if (Objects.equals(firstName, "Geoff") && Objects.equals(lastName, "Goff")) {
            return true;
        }
        if (Objects.equals(firstName, "Gerard") && Objects.equals(lastName, "Garrard")) {
            return true;
        }
        if (Objects.equals(firstName, "Gervase") && Objects.equals(lastName, "Jarvis")) {
            return true;
        }
        if (Objects.equals(firstName, "Gervase") && Objects.equals(lastName, "Jervis")) {
            return true;
        }
        if (Objects.equals(firstName, "Godwin") && Objects.equals(lastName, "Goodwin")) {
            return true;
        }
        if (Objects.equals(firstName, "Greg") && Objects.equals(lastName, "Gregg")) {
            return true;
        }
        if (Objects.equals(firstName, "Greg") && Objects.equals(lastName, "Gregory")) {
            return true;
        }
        if (Objects.equals(firstName, "Hobb") && Objects.equals(lastName, "Hobbes")) {
            return true;
        }
        if (Objects.equals(firstName, "Hobbe") && Objects.equals(lastName, "Hobbes")) {
            return true;
        }
        if (Objects.equals(firstName, "Isabel") && Objects.equals(lastName, "Bell")) {
            return true;
        }
        if (Objects.equals(firstName, "Isabella") && Objects.equals(lastName, "Bell")) {
            return true;
        }
        if (Objects.equals(firstName, "Isabelle") && Objects.equals(lastName, "Bell")) {
            return true;
        }
        if (Objects.equals(firstName, "Izzy") && Objects.equals(lastName, "Bell")) {
            return true;
        }
        if (Objects.equals(firstName, "Jeff") && Objects.equals(lastName, "Goff")) {
            return true;
        }
        if (Objects.equals(firstName, "Jeffrey") && Objects.equals(lastName, "Goff")) {
            return true;
        }
        if (Objects.equals(firstName, "Konrad") && Objects.equals(lastName, "Conrad")) {
            return true;
        }
        if ((Objects.equals(firstName, "Kurt")) && (Objects.equals(lastName, "Kurt"))) {
            return true;
        }
        if (Objects.equals(firstName, "Laurence") && Objects.equals(lastName, "Lawrence")) {
            return true;
        }
        if (Objects.equals(firstName, "Louis") && Objects.equals(lastName, "Lewis")) {
            return true;
        }
        if (Objects.equals(firstName, "Luke") && Objects.equals(lastName, "Lucas")) {
            return true;
        }
        if (Objects.equals(firstName, "Marc") && Objects.equals(lastName, "Marcus")) {
            return true;
        }
        if (Objects.equals(firstName, "Mark") && Objects.equals(lastName, "Marcus")) {
            return true;
        }
        if (Objects.equals(firstName, "Marian") && Objects.equals(lastName, "Maryon")) {
            return true;
        }
        if (Objects.equals(firstName, "Marianne") && Objects.equals(lastName, "Maryon")) {
            return true;
        }
        if (Objects.equals(firstName, "Marion") && Objects.equals(lastName, "Maryon")) {
            return true;
        }
        if (Objects.equals(firstName, "Mariot") && Objects.equals(lastName, "Marriott")) {
            return true;
        }
        if (Objects.equals(firstName, "Mary Ann") && Objects.equals(lastName, "Maryon")) {
            return true;
        }
        if (Objects.equals(firstName, "Mary Anne") && Objects.equals(lastName, "Maryon")) {
            return true;
        }
        if (Objects.equals(firstName, "Osbern") && Objects.equals(lastName, "Osborn")) {
            return true;
        }
        if (Objects.equals(firstName, "Osbern") && Objects.equals(lastName, "Osborne")) {
            return true;
        }
        if (Objects.equals(firstName, "Osbern") && Objects.equals(lastName, "Osbourne")) {
            return true;
        }
        if (Objects.equals(firstName, "Nicholas") && Objects.equals(lastName, "Nicols")) {
            return true;
        }
        if (Objects.equals(firstName, "Nicholas") && Objects.equals(lastName, "Nicolls")) {
            return true;
        }
        if (Objects.equals(firstName, "Nick") && Objects.equals(lastName, "Nicols")) {
            return true;
        }
        if (Objects.equals(firstName, "Nick") && Objects.equals(lastName, "Nicolls")) {
            return true;
        }
        if (Objects.equals(firstName, "Payn") && Objects.equals(lastName, "Paine")) {
            return true;
        }
        if (Objects.equals(firstName, "Payn") && Objects.equals(lastName, "Payne")) {
            return true;
        }
        if (Objects.equals(firstName, "Percy") && Objects.equals(lastName, "Percival")) {
            return true;
        }
        if (Objects.equals(firstName, "Philip") && Objects.equals(lastName, "Phillips")) {
            return true;
        }
        if (Objects.equals(firstName, "Rand") && Objects.equals(lastName, "Randolph")) {
            return true;
        }
        if (Objects.equals(firstName, "Randal") && Objects.equals(lastName, "Randolph")) {
            return true;
        }
        if (Objects.equals(firstName, "Randall") && Objects.equals(lastName, "Randolph")) {
            return true;
        }
        if (Objects.equals(firstName, "Ranulf") && Objects.equals(lastName, "Randolph")) {
            return true;
        }
        if (Objects.equals(firstName, "Roger") && Objects.equals(lastName, "Rodger")) {
            return true;
        }
        if (Objects.equals(firstName, "Robin") && Objects.equals(lastName, "Robbins")) {
            return true;
        }
        if (Objects.equals(firstName, "Sylvester") && lastName.startsWith("Silvester")) {
            return true;
        }
        if (Objects.equals(firstName, "Stanley") && lastName.startsWith("Stan")) {
            return true;
        }
        if (Objects.equals(firstName, "Stephen") && Objects.equals(lastName, "Stevens")) {
            return true;
        }
        if (Objects.equals(firstName, "Warin") && Objects.equals(lastName, "Warren")) {
            return true;
        }
        if ((firstName + "s").equals(lastName) || (firstName + "es").equals(lastName)) {
            return true;
        }
        return Objects.equals(firstName, lastName);
    }
    private static String[] getArrayFromTranslation(Text translatable) {
        String translatedText = translatable.getString();

        return translatedText.split(", ");
    }

    private static ArrayList<String> getArrayListFromTranslation(Text translatable) {
        String translatedText = translatable.getString();
        List<String> nameList = List.of(translatedText.split(", "));
        return new ArrayList<>(nameList);
    }

    public static String createFirstName(Random random) {
        String[] sexesArray = {"female", "male"};
        ArrayList<String> firstNamesArray = getArrayListFromTranslation(Text.translatable("villager.firstNames." + sexesArray[random.nextInt(sexesArray.length)]));
        List<String> newFirstNamesArrayList = new ArrayList<>();
        for (int i = 0; i < random.nextInt(10) + random.nextInt(10) + 3; i++) {
            Util.shuffle(firstNamesArray, random);
            newFirstNamesArrayList.add(Util.getRandom(firstNamesArray, random));
        }
        //System.out.println("First Names Pre-Shuffle: " + newFirstNamesArrayList);
        Util.shuffle(newFirstNamesArrayList, random);
        //System.out.println("First Names Post-Shuffle: " + newFirstNamesArrayList);
        return Util.getRandom(newFirstNamesArrayList, random);
    }

    public static String createLastName(String firstName, Random random) {
        List<String> lastNamesArray = new ArrayList<>();

        int habitationalInt = random.nextInt(1) + random.nextInt(1);
        int nicknameInt = random.nextInt(3) + random.nextInt(3);
        int occupationalInt = random.nextInt(3) + random.nextInt(3);
        int patronymicInt = random.nextInt(3) + random.nextInt(3);
        int topographicInt = random.nextInt(3) + random.nextInt(3);
        int doubleBarreledInt = random.nextInt(1);

        while (habitationalInt + nicknameInt + occupationalInt + patronymicInt + topographicInt + doubleBarreledInt < 1) {
            habitationalInt = random.nextInt(1) + random.nextInt(1);
            nicknameInt = random.nextInt(3) + random.nextInt(3);
            occupationalInt = random.nextInt(3) + random.nextInt(3);
            patronymicInt = random.nextInt(3) + random.nextInt(3);
            topographicInt = random.nextInt(3) + random.nextInt(3);
            doubleBarreledInt = random.nextInt(1);
        }

        for (int i = 0; i < habitationalInt + 1; i++) {
            lastNamesArray.add(createHabitationalName(random));
        }

        for (int i = 0; i < nicknameInt; i++) {
            lastNamesArray.add(createNicknameLastName(random));
        }

        for (int i = 0; i < occupationalInt + 1; i++) {
            lastNamesArray.add(createOccupational(random));
        }

        for (int i = 0; i < patronymicInt; i++) {
            /*if (random.nextInt(2) == 1) {
                lastNamesArray.add(createPatronymic(random));
            } else {
                lastNamesArray.add(createFitz(random));
            }*/
            lastNamesArray.add(createPatronymic(random));
        }

        for (int i = 0; i < topographicInt; i++) {
            lastNamesArray.add(createTopographic(random));
        }

        for (int i = 0; i < doubleBarreledInt ; i++) {
            lastNamesArray.add(createDoubleBarreledName(firstName, random));
        }
        //System.out.println("Last Names Pre-Shuffle: " + lastNamesArray);
        Util.shuffle(lastNamesArray, random);
        //System.out.println("Last Names Post-Shuffle: " + lastNamesArray);
        return lastNamesArray.get(random.nextInt(lastNamesArray.toArray().length));
    }

    public static String createFitz(Random random) {
        ArrayList<String> firstNamesforFitz = getArrayListFromTranslation(Text.translatable("villager.firstNames.male"));
        Util.shuffle(firstNamesforFitz, random);
        return String.format("fitz%s", Util.getRandom(firstNamesforFitz, random));
    }

    public static String createNicknameLastName(Random random) {
        ArrayList<String> nicknameLastNames = getArrayListFromTranslation(Text.translatable("villager.lastNames.nickname"));
        Util.shuffle(nicknameLastNames, random);
        return Util.getRandom(nicknameLastNames, random);
    }

    public static String createOccupational(Random random) {
        ArrayList<String> occupationalLastNames = getArrayListFromTranslation(Text.translatable("villager.lastNames.occupational"));
        Util.shuffle(occupationalLastNames, random);
        return Util.getRandom(occupationalLastNames, random);
    }

    public static String createPatronymic(Random random) {
        ArrayList<String> patronymicLastNames = getArrayListFromTranslation(Text.translatable("villager.lastNames.patronymic"));
        Util.shuffle(patronymicLastNames, random);
        return Util.getRandom(patronymicLastNames, random);
    }

    public static String createTopographic(Random random) {
        ArrayList<String> topographicLastNames = getArrayListFromTranslation(Text.translatable("villager.lastNames.topographic"));
        Util.shuffle(topographicLastNames, random);
        return Util.getRandom(topographicLastNames, random);
    }

    public static String createDoubleBarreledName(String firstName, Random random) {
        List<String> lastNamesArray = new ArrayList<>();

        for (int i = 0; i < random.nextInt(5) + 1; i++) {
            lastNamesArray.add(createHabitationalName(random));
        }

        for (int i = 0; i < random.nextInt(5) + 1; i++) {
            lastNamesArray.add(createNicknameLastName(random));
        }

        for (int i = 0; i < random.nextInt(5) + 1; i++) {
            lastNamesArray.add(createOccupational(random));
        }

        for (int i = 0; i < random.nextInt(5) + 1; i++) {
            lastNamesArray.add(createPatronymic(random));
        }

        for (int i = 0; i < random.nextInt(5) + 1; i++) {
            lastNamesArray.add(createTopographic(random));
        }
        Util.shuffle(lastNamesArray, random);
        String firstDoubleName = Util.getRandom(lastNamesArray, random);

        Util.shuffle(lastNamesArray, random);
        String secondDoubleName = Util.getRandom(lastNamesArray, random);

        int noProgressTimer = 0;
        while (Objects.equals(firstDoubleName, secondDoubleName) || (sameAsLastName(firstName, firstDoubleName) || sameAsLastName(firstName, secondDoubleName))) {
            noProgressTimer++;
            if (noProgressTimer >= 3) {
                for (int i = 0; i < random.nextInt(3) + 1; i++) {
                    lastNamesArray.add(createHabitationalName(random));
                    lastNamesArray.add(createNicknameLastName(random));
                    lastNamesArray.add(createOccupational(random));
                    lastNamesArray.add(createPatronymic(random));
                    lastNamesArray.add(createTopographic(random));
                }
            }
            Util.shuffle(lastNamesArray, random);
            if (random.nextInt(2) == 1) {
                firstDoubleName = Util.getRandom(lastNamesArray, random);
            } else {
                secondDoubleName = Util.getRandom(lastNamesArray, random);
            }
        }

        return String.format("%s-%s", firstDoubleName, secondDoubleName);
    }

    public static String createHabitationalName(Random random) {
        if (Objects.equals(Text.translatable("villager.lastNames.habitational").getString(), "villager.lastNames.habitational")) {
            String[] habitationalPrefixes = getArrayFromTranslation(Text.translatable("villager.lastNames.habitational.prefixes"));
            String[] habitationalSuffixes = getArrayFromTranslation(Text.translatable("villager.lastNames.habitational.suffixes"));

            String habitationalPrefix = Util.getRandom(habitationalPrefixes, random);
            String habitationalSuffix = Util.getRandom(habitationalSuffixes, random);

            while (habitationalPrefix.toLowerCase().equals(habitationalSuffix)) {
                habitationalSuffix = Util.getRandom(habitationalSuffixes, random);
            }

            if (habitationalPrefix.endsWith(habitationalSuffix.substring(0, 1))) {
                habitationalSuffix = habitationalSuffix.substring(1);
            }

            return habitationalPrefix + habitationalSuffix;
        }
        String[] habitationalLastNames = getArrayFromTranslation(Text.translatable("villager.lastNames.habitational"));
        // return habitationalLastNames[random.nextInt(habitationalLastNames.length)];
        return Util.getRandom(habitationalLastNames, random);
    }
    
    public static String getProfessionLastName(String profession, String firstName, String originalLastName, Random random) {
        List<String> professionLastNamesArray = new ArrayList<>();

        if (originalLastName != null) {
            professionLastNamesArray.add(originalLastName);
            professionLastNamesArray.add(originalLastName);
        }

        switch (profession) {
            case ("armorer"):
            case ("toolsmith"):
            case ("weaponsmith"):
                professionLastNamesArray.addAll(List.of(new String[]{"Schmidt", "Smith"}));
                break;
            case ("butcher"):
                professionLastNamesArray.addAll(List.of(new String[]{"Butcher", "Cook", "Koch"}));
                break;
            case ("carpenter"):
                professionLastNamesArray.addAll(List.of(new String[]{"Carpenter", "Wright", "Zimmerman"}));
                break;
            case ("cartographer"):
            case ("librarian"):
                professionLastNamesArray.addAll(List.of(new String[]{"Latimer", "Scriven", "Scrivner"}));
                break;
            case ("cleric"):
                professionLastNamesArray.addAll(List.of(new String[]{"Clark", "Clarke", "Clerk", "Parsons"}));
                break;
            case ("farmer"):
                professionLastNamesArray.add("Tillman");
                break;
            case ("fletcher"):
                professionLastNamesArray.addAll(List.of(new String[]{"Bowyer", "Fletcher"}));
                //professionLastNamesArray.add("Fletcher");
                break;
            case ("fisher"):
                professionLastNamesArray.addAll(List.of(new String[]{"Fischer", "Fisher"}));
                break;
            case ("leatherworker"):
                professionLastNamesArray.addAll(List.of(new String[]{"Fuller", "Tucker", "Walker"}));
                break;
            case ("lumberjack"):
                professionLastNamesArray.add("Sawyer");
                break;
            case ("mason"):
                if (firstName != "Mason") {
                    professionLastNamesArray.add("Mason");
                }
                break;
            case ("shepherd"):
                professionLastNamesArray.addAll(List.of(new String[]{"Schaefer", "Shaffer", "Shepard", "Shepherd", "Sheppard"}));
                break;
            default:
                professionLastNamesArray.add(createLastName(firstName, random));
        }

        return Util.getRandom(professionLastNamesArray, random);
    }

}
