package vet.staff;

import vet.AnimalQueue;
import vet.animal.Animal;
import vet.enums.MedicalType;

import java.util.List;

public class MedicalStaff extends Staff {

    private MedicalType medicalType;

    //class used to keep the order of animals the medical staff needs to see
    private AnimalQueue animalQueue = new AnimalQueue();

    public MedicalStaff(String name, String number, int salary, MedicalType medicalType) {
        super(name, number, salary);
        this.medicalType = medicalType;
    }

    @Override
    public String getType() {
        return medicalType.name();
    }

    public void addAnimalInQueue(Animal animal) {
        animalQueue.enqueue(animal);
    }

    public void removeAnimalFromQueue() {
        animalQueue.dequeue();
    }

    public List<Animal> getAllAnimalFromStaff() {
        return animalQueue.getAnimalsOrder();
    }
}
