// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.gfvbb
import java.util.Scanner;
import java.util.List;
public class Main {
    // Scan type of users by username and password
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";

    private static final String PORTMANAGER_USERNAME = "portmanager";
    private static final String PORTMANAGER_PASSWORD = "port123";
    private static final int PORTMANAGER_PORTID = 1; // Assuming port ID 1 for this manager

    // Main Program
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
    // Admin Menu
    private static void displayAdminMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("Admin Menu");
            System.out.println("1. CRUD operations for vehicles");
            // ... other admin-specific operations
            System.out.println("0. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    vehicleCRUDMenu(scanner);
                    break;
                case 0:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);
    }
    // Vehicles CRUD Menu
    private static void vehicleCRUDMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("Vehicle CRUD Operations");
            System.out.println("1. Add a new vehicle");
            System.out.println("2. Display all vehicles");
            System.out.println("3. Update a vehicle");
            System.out.println("4. Delete a vehicle");
            System.out.println("0. Go back to main menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    /*
                    In this case user need to enter the details respectively as the format listed
                    */
                    System.out.print("Enter vehicle details (format: ID,Name,Type,FuelCapacity,CurrentFuel,CurrentPort,CarryingCapacity): ");
                    String vehicleDetails = scanner.nextLine();
                    VehicleCRUD.createVehicle(vehicleDetails);
                    break;
                case 2: // Show all the vehicles
                    List<String> vehicles = VehicleCRUD.readVehicles();
                    vehicles.forEach(System.out::println);
                    break;
                case 3:
                    /*
                    In this case, user need to enter all the details of that vehicle
                    ID,Name,Type,FuelCapacity,CurrentFuel,CurrentPort,CarryingCapacity. Then they can enter the improvement
                    for this vehicles
                    */
                    System.out.print("Enter existing vehicle details to update: ");
                    String oldVehicleDetails = scanner.nextLine();
                    System.out.print("Enter new vehicle details: ");
                    String newVehicleDetails = scanner.nextLine();
                    VehicleCRUD.updateVehicle(oldVehicleDetails, newVehicleDetails);
                    break;
                case 4:
                    /*
                    In this case, user need to enter all the details of that vehicle
                    ID,Name,Type,FuelCapacity,CurrentFuel,CurrentPort,CarryingCapacity. Then they can delete
                    for this vehicles
                    */
                    System.out.print("Enter vehicle details to delete: ");
                    String vehicleToDelete = scanner.nextLine();
                    VehicleCRUD.deleteVehicle(vehicleToDelete);
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
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