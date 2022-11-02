import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File(".\\inputFile");
        Scanner fileScnr = new Scanner(file);
        Scanner inputScnr = new Scanner(System.in);
        Heap heap = new Heap();
        fileScnr.nextLine(); //Skip first line of file
        displayMenu(inputScnr, heap);
    }

    public static void displayMenu(Scanner inputScnr, Heap heap) {
        String choice;
        System.out.println("\n------------------------------------------------------------");
        System.out.println("WHAT WOULD YOU LIKE TO DO? (input only a single number)");
        System.out.println("1. Import data");
        System.out.println("2. Peek");
        System.out.println("3. Next patient");
        System.out.println("4. Remove patient");
        System.out.println("5. Size");
        System.out.println("6. Update priority");
        System.out.println("7. Exit\n");
        choice = inputScnr.nextLine();

        switch (choice) {
            case "1": //input
                input(heap);
                displayMenu(inputScnr, heap);
                break;
            case "2": //peek
                peek(heap);
                displayMenu(inputScnr, heap);
                break;
            case "3": //nextPatient
                nextPatient(heap);
                displayMenu(inputScnr, heap);
                break;
            case "4": //removePatient
                removePatient(heap);
                displayMenu(inputScnr, heap);
                break;
            case "5": //size
                size(heap);
                displayMenu(inputScnr, heap);
                break;
            case "6": //updatePriority
                updatePriority(heap);
                displayMenu(inputScnr, heap);
                break;
            case "7": //exit
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Please input a valid option");
                displayMenu(inputScnr, heap);
        }
    }

    private static void input(Heap heap) {
        
    }

    private static void peek(Heap heap) {

    }

    private static void nextPatient(Heap heap) {

    }

    private static void removePatient(Heap heap) {

    }

    private static void size(Heap heap) {

    }

    private static void updatePriority(Heap heap) {

    }

    
}

