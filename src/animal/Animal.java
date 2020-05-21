package animal;

import enums.AnimalType;

public class Animal {

    private String name;
    private int age;
    private String condition;
    private AnimalType animalType;

    public Animal(String name, int age, String condition, AnimalType animalType) {
        this.name = name;
        this.age = age;
        this.condition = condition;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCondition() {
        return condition;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }
}
