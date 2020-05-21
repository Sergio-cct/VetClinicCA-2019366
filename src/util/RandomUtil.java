package util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public final class RandomUtil {
    private static final int MAX_UNIQUE_NUMBER = 1000000;
    private static final int MIN_NAME_LENGTH = 3;
    private static final int MAX_NAME_LENGTH = 15;
    private static final String LEXICON = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final Set<Integer> uniqueNumbers = new HashSet<>();
    private static final Random rand = new Random();

    //best practice when creating utils class to set the constructor private
    private RandomUtil() {
    }

    public static String generateRandomStaffName() {
        StringBuilder builder = new StringBuilder();
        int length = rand.nextInt(MAX_NAME_LENGTH - MIN_NAME_LENGTH) + MIN_NAME_LENGTH;
        for (int i = 0; i < length; i++) {
            builder.append(LEXICON.charAt(rand.nextInt(LEXICON.length())));
        }
        builder.append(" ");
        length = rand.nextInt(MAX_NAME_LENGTH - MIN_NAME_LENGTH) + MIN_NAME_LENGTH;
        for (int i = 0; i < length; i++) {
            builder.append(LEXICON.charAt(rand.nextInt(LEXICON.length())));
        }

        return builder.toString();
    }

    public static String generateRandomAnimalName() {
        StringBuilder builder = new StringBuilder();
        int length = rand.nextInt(MAX_NAME_LENGTH - MIN_NAME_LENGTH) + MIN_NAME_LENGTH;
        for (int i = 0; i < length; i++) {
            builder.append(LEXICON.charAt(rand.nextInt(LEXICON.length())));
        }
        return builder.toString();
    }

    public static int generateUniqueNumber() {
        int uniqueNumber = rand.nextInt(MAX_UNIQUE_NUMBER);
        while (uniqueNumbers.contains(uniqueNumber)) {
            uniqueNumber = rand.nextInt(MAX_UNIQUE_NUMBER);
        }
        uniqueNumbers.add(uniqueNumber);
        return uniqueNumber;
    }

    public static int randomInt(int maxValue) {
        return rand.nextInt(maxValue);
    }

    public static int randomInt(int minValue, int maxValue) {
        return rand.nextInt(maxValue);
    }
}
