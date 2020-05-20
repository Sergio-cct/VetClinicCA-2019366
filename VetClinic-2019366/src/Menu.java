
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    Scanner op = new Scanner(System.in);
    String action;
    int id;

    public void menuOptions() {
        // Displaying a welcome message to the user
        System.out.println("Welcome to Vet Clinic System\n ");

        //Starting with the do loop because it has to run independently until the user get out the looping
        do {
            //Menu which is going to be displayed to the user
            System.out.println("Select one of the following options bellow: ");
            System.out.println("[0] - Display all staff");
            System.out.println("[1] - List staff by categories");
            System.out.println("[2] - Display all staff");
            System.out.println("[3] - Display all staff");
            System.out.println("[7] - End");

            //message asking the user a choice
            System.out.println("Type in your option by the numbers: ");

            //scan next action
            action = op.next();

            // todo create all random entities
            switch (action) {
                case "0":
                    break;
                case "1":
                    System.out.println("2. Select staff category");
                    break;

            }
        }// end the programm
        while (!"7".equals(action));

    }
}
