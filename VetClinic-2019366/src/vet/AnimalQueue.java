package vet;

import vet.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalQueue {

    private final List<Animal> animals = new ArrayList<>();        // array to store queue animals

    // Utility function to remove animal from the queue
    public Animal dequeue() {
        if (!animals.isEmpty()) {
            return animals.remove(0);
        }
        return null;
    }

    // Utility function to add an animal to the queue
    public void enqueue(Animal animal) {
        animals.add(animal);
    }

    // Utility function to return front element in the queue
    public Animal peek() {
        if (!isEmpty()) {
            return animals.get(0);
        }
        return null;
    }

    public List<Animal> getAnimalsOrder(){
        return animals;
    }

    // Utility function to return the size of the queue
    public int size() {
        return animals.size();
    }

    // Utility function to check if the queue is empty or not
    public Boolean isEmpty() {
        return (size() == 0);
    }
}
