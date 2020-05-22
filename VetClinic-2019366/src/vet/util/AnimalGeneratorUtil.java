package vet.util;

import vet.animal.Animal;
import vet.enums.AnimalType;

import java.util.ArrayList;
import java.util.List;

public final class AnimalGeneratorUtil {

    private static final int MIN_AGE = 1;
    private static final int MAX_AGE = 15;

    //best practice when creating utils class to set the constructor private
    private AnimalGeneratorUtil() {
    }

    public static List<Animal> generateAnimals(int number) {
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            animals.add(generateAnimal());
        }
        return animals;
    }

    private static Animal generateAnimal() {
        String randomName = RandomUtil.generateRandomAnimalName();
        AnimalType animalType = generateRandomAnimalType();
        int age = RandomUtil.randomInt(MIN_AGE, MAX_AGE);
        String condition = RandomUtil.generateRandomCondition();
        return new Animal(randomName, age, condition, animalType);
    }

    private static AnimalType generateRandomAnimalType() {
        int length = AnimalType.values().length;
        return AnimalType.values()[RandomUtil.randomInt(length)];
    }
}
