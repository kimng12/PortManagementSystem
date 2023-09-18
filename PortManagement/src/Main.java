// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    // Hardcoded user credentials for simplicity
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";

    private static final String PORTMANAGER_USERNAME = "portmanager";
    private static final String PORTMANAGER_PASSWORD = "port123";
    private static final int PORTMANAGER_PORTID = 1; // Assuming port ID 1 for this manager

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            displayAdminMenu(scanner);
        } else if (username.equals(PORTMANAGER_USERNAME) && password.equals(PORTMANAGER_PASSWORD)) {
            displayPortManagerMenu(scanner, PORTMANAGER_PORTID);
        } else {
            System.out.println("Invalid credentials!");
        }

        scanner.close();
    }
}

    private static void displayAdminMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("Admin Menu");
            System.out.println("1. CRUD operations for vehicles");
            System.out.println("2. CRUD operations for ports");
            // ... other admin-specific operations
            System.out.println("0. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                // Implement the operations
                case 0:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);
    }

    private static void displayPortManagerMenu(Scanner scanner, int portId) {
        int choice;
        do {
            System.out.println("Port Manager Menu for Port " + portId);
            System.out.println("1. CRUD operations for containers in this port");
            // ... other port manager-specific operations
            System.out.println("0. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                // Implement the operations
                case 0:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);
    }
}