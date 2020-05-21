
import animal.Animal;
import enums.AdminTask;
import enums.AdminType;
import enums.AnimalType;
import enums.MedicalType;
import staff.AdminStaff;
import staff.Staff;
import util.AnimalGeneratorUtil;
import util.StaffGeneratorUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static final int ADMIN_STAFF_NUMBER = 100;
    private static final int MEDICAL_STAFF_NUMBER = 100;
    private static final int ANIMAL_NUMBER = 1000;

    Scanner op = new Scanner(System.in);
    String action;
    private List<Staff> staffs = new ArrayList<>();
    private List<Animal> animals = new ArrayList<>();

    public void initData() {
        staffs.addAll(StaffGeneratorUtil.generateAdmins(ADMIN_STAFF_NUMBER));
        staffs.addAll(StaffGeneratorUtil.generateMedicals(MEDICAL_STAFF_NUMBER));

        animals.addAll(AnimalGeneratorUtil.generateAnimals(ANIMAL_NUMBER));
    }

    public void menuOptions() {
        // Displaying a welcome message to the user
        System.out.println("Welcome to Vet Clinic System\n ");

        //Starting with the do loop because it has to run independently until the user get out the looping
        do {
            //Menu which is going to be displayed to the user
            System.out.println("Select one of the following options bellow: ");
            System.out.println("[0] - Display all staff");
            System.out.println("[1] - List staff by categories");
            System.out.println("[2] - List all Admin staff performing a certain task");
            System.out.println("[3] - Search for a specific member of staff by name");
            System.out.println("[4] - List all animals");
            System.out.println("[5] - List animals by category");
            System.out.println("[6] - Search animal by name");
            System.out.println("[7] - End");

            //message asking the user a choice
            System.out.println("Type in your option by the numbers: ");

            //scan next action
            action = op.next();

            switch (action) {
                case "0":
                    for (Staff staff : staffs) {
                        printStaff(staff);
                    }
                    break;
                case "1":
                    System.out.println("Chose a category:");
                    List<String> categories = new ArrayList<>();
                    for (AdminType adminType : AdminType.values()) {
                        categories.add(adminType.name());
                    }
                    for (MedicalType medicalType : MedicalType.values()) {
                        categories.add(medicalType.name());
                    }
                    for (int i = 0; i < categories.size(); i++) {
                        System.out.println(i + " " + categories.get(i));
                    }
                    action = op.next();
                    int categoryNumber = Integer.parseInt(action);
                    for (Staff staff : staffs) {
                        if (staff.getType().equals(categories.get(categoryNumber)))
                            printStaff(staff);
                    }
                    break;
                case "2":
                    System.out.println("Chose a task:");
                    List<String> adminTasks = new ArrayList<>();
                    for (AdminTask adminTask : AdminTask.values()) {
                        adminTasks.add(adminTask.name());
                    }
                    for (int i = 0; i < adminTasks.size(); i++) {
                        System.out.println(i + " " + adminTasks.get(i));
                    }
                    action = op.next();
                    int adminTaskNumber = Integer.parseInt(action);
                    for (Staff staff : staffs) {
                        if (staff instanceof AdminStaff) {
                            if (((AdminStaff) staff).getAdminTask().name().equals(adminTasks.get(adminTaskNumber)))
                                printStaff(staff);
                        }

                    }
                    break;
                case "3":
                    System.out.println("Enter a name:");
                    action = op.next();
                    for (Staff staff : staffs) {
                        if (staff.getName().contains(action)) {
                            printStaff(staff);
                        }
                    }
                    break;
                case "4":
                    for (Animal animal : animals) {
                        printAnimal(animal);
                    }
                    break;
                case "5":
                    System.out.println("Chose an animal type:");
                    List<String> animalTypes = new ArrayList<>();
                    for (AnimalType animalType : AnimalType.values()) {
                        animalTypes.add(animalType.name());
                    }
                    for (int i = 0; i < animalTypes.size(); i++) {
                        System.out.println(i + " " + animalTypes.get(i));
                    }
                    action = op.next();
                    int animalTypeNumber = Integer.parseInt(action);
                    for (Animal animal : animals) {
                        if (animal.getAnimalType().name().equals(AnimalType.values()[animalTypeNumber].name())) {
                            printAnimal(animal);
                        }
                    }
                    break;
                case "6":
                    System.out.println("Enter an animal name:");
                    action = op.next();
                    for (Animal animal : animals) {
                        if (animal.getName().contains(action)) {
                            printAnimal(animal);
                        }
                    }
                    break;

            }
        }// end the programm
        while (!"7".equals(action));
    }
    private void printStaff(Staff staff) {
        System.out.println("Name: " + staff.getName());
        System.out.println("Number: " + staff.getNumber());
        System.out.println("Salary: " + staff.getSalary());
        System.out.println("Type: " + staff.getType());
        if (staff instanceof AdminStaff) {
            System.out.println("Task: " + ((AdminStaff) staff).getAdminTask().name());
        }
        System.out.println();
    }

    private void printAnimal(Animal animal) {
        System.out.println("Type of animal: " + animal.getAnimalType().name());
        System.out.println("Name of Animal: " + animal.getName());
        System.out.println("Age: " + animal.getAge());
        System.out.println("Medical Condition: " + animal.getCondition());
        System.out.println();
    }
}
