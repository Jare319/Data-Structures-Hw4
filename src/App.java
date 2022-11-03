import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputScnr = new Scanner(System.in);
        Heap heap = new Heap();
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
        File file = new File(".\\inputFile.txt");
        Scanner fileScnr = null;
        try {
            fileScnr = new Scanner(file);
            fileScnr.nextLine(); //Skip first line of file
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
            System.exit(1);
        }
        while (fileScnr.hasNextLine()) {
            String arr[] = fileScnr.nextLine().split(";");
            heap.add(new Node(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9], arr[10], arr[11], arr[12]));
        }
        System.out.println("Input file is read sucessfully");
    }

    private static void peek(Heap heap) {
        Node node = heap.peek();
        System.out.println("The patient detail with the highest priority is as follows:");
        System.out.println("Patient's first name: " + node.getPatient().getFirstName());
        System.out.println("Patient's last name: " + node.getPatient().getLastName());
        System.out.println("Patient's date of birth: " + node.getPatient().getDob());
        System.out.println("Address: " + node.getPatient().getAddress());
        System.out.println("City: " + node.getPatient().getCity());
        System.out.println("County: " + node.getPatient().getCounty());
        System.out.println("State: " + node.getPatient().getState());
        System.out.println("ZIP Code: " + node.getPatient().getZip());
        System.out.println("Phone number (1st preference): " + node.getPatient().getPhone1());
        System.out.println("Phone number (2nd preference): " + node.getPatient().getPhone2());
        System.out.println("Email Address: " + node.getPatient().getEmail());
        System.out.println("UNOS Status: " + node.getPatient().getUnosStatus());
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

