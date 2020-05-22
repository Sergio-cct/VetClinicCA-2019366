package vet.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public final class RandomUtil {
    private static final int MAX_UNIQUE_NUMBER = 1000000;
    private static final Set<Integer> uniqueNumbers = new HashSet<>();
    private static final Random rand = new Random();

    private static final List<String> staffNames = new ArrayList<>();
    private static final List<String> animalNames = new ArrayList<>();
    private static final List<String> conditions = new ArrayList<>();

    //best practice when creating utils class to set the constructor private
    private RandomUtil() {
    }

    //load names from file
    public static void init(){
        initStaffNames();
        initAnimalNames();
        initConditions();
    }

    private static void initStaffNames(){
        try (BufferedReader br = new BufferedReader(new FileReader("StaffNames.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                staffNames.add(line);
            }
        } catch (Exception e) {
            System.out.println("Problem reading StaffNames.txt file");
        }
    }

    private static void initAnimalNames(){
        try (BufferedReader br = new BufferedReader(new FileReader("AnimalNames.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                animalNames.add(line);
            }
        } catch (Exception e) {
            System.out.println("Problem reading AnimalNames.txt file");
        }
    }

    private static void initConditions(){
        try (BufferedReader br = new BufferedReader(new FileReader("Conditions.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                conditions.add(line);
            }
        } catch (Exception e) {
            System.out.println("Problem reading Conditions.txt file");
        }
    }

    public static String generateRandomStaffName() {
        int i = rand.nextInt(staffNames.size());
        return staffNames.remove(i);
    }

    public static String generateRandomAnimalName() {
        int i = rand.nextInt(animalNames.size());
        return animalNames.remove(i);
    }

    public static String generateRandomCondition() {
        int i = rand.nextInt(conditions.size());
        return conditions.get(i);
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
