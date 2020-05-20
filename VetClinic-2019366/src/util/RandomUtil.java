package util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {
    final static String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final static Set<Integer> uniqueNumbers = new HashSet<>();
    final static Random rand = new Random();
    final Set<String> identifiers = new HashSet<>();

    public static String randomName(int min, int max) {
        StringBuilder builder = new StringBuilder();
        int length = rand.nextInt(max - min) + min;
        for (int i = 0; i < length; i++) {
            builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
        }
        return builder.toString();
    }

    public static int generateUniqueNumber() {
        int uniqueNumber = rand.nextInt(1000000);
        while (uniqueNumbers.contains(uniqueNumber)) {
            uniqueNumber = rand.nextInt(1000000);
        }
        uniqueNumbers.add(uniqueNumber);
        return uniqueNumber;
    }
}
