public abstract class Vehicle {
    private String name;
    private double currentFuel;
    private double carryingCapacity;
    private double fuelCapacity;
    private Port currentPort;
    private List<Container> containers;
    private String id;

    // Constructors, getters, setters, and other methods...

    public abstract boolean canMoveTo(Port port);
    public abstract void refuel();
}

class Ship extends Vehicle {
    // Ship-specific methods and attributes...
}

class Truck extends Vehicle {
    // Truck-specific methods and attributes...
}

/*
public abstract class Vehicle {
    private String id;  // Unique ID for vehicles (sh-number for ships, tr-number for trucks)
    private String name;
    private double currentFuel;
    private double carryingCapacity;
    private double fuelCapacity;
    private Port currentPort; // null if sailaway
    private double totalContainerWeight; // The total weight of all the containers
    private int totalNumberOfContainers; // The total number of containers
    // More fields can be added based on your requirements, such as a map for container types and counts

    // Constructor
    public Vehicle(String id, String name, double carryingCapacity, double fuelCapacity, Port currentPort) {
        this.id = id;
        this.name = name;
        this.carryingCapacity = carryingCapacity;
        this.fuelCapacity = fuelCapacity;
        this.currentFuel = fuelCapacity;  // Assume vehicle is fully fueled initially
        this.currentPort = currentPort;
        this.totalContainerWeight = 0;
        this.totalNumberOfContainers = 0;
    }

    // Abstract method for loading a container
    // Returns true if successful, false otherwise
    public abstract boolean loadContainer(Container container);

    // Abstract method for unloading a container
    // Returns true if successful, false otherwise
    public abstract boolean unloadContainer(Container container);

    // Abstract method to check if the vehicle can move to another port
    public abstract boolean canMoveTo(Port port);

    // Abstract method to move the vehicle to another port
    public abstract boolean moveTo(Port port);

    // Getters and setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public Port getCurrentPort() {
        return currentPort;
    }

    public double getTotalContainerWeight() {
        return totalContainerWeight;
    }

    public int getTotalNumberOfContainers() {
        return totalNumberOfContainers;
    }

    // Method to refuel the vehicle
    public void refuel() {
        this.currentFuel = this.fuelCapacity;
    }

    // ... Previous code

    // Method to check if the vehicle needs refueling
    public boolean needsRefueling() {
        return this.currentFuel <= this.fuelCapacity * 0.2; // Refuel if fuel drops below 20%
    }

    // Method to calculate the remaining distance that the vehicle can cover with the current fuel
    public double remainingDistance(double fuelConsumptionRate) {
        return this.currentFuel / fuelConsumptionRate;
    }

    // Method to update the current port of the vehicle
    public void setCurrentPort(Port port) {
        this.currentPort = port;
    }

    // Method to update the current fuel after a trip
    public boolean updateFuel(double distance, double fuelConsumptionRate) {
        double fuelNeeded = distance * fuelConsumptionRate;
        if (this.currentFuel >= fuelNeeded) {
            this.currentFuel -= fuelNeeded;
            return true;
        }
        return false; // Not enough fuel for the trip
    }

    // ... Previous code

    // Method to check if the vehicle needs refueling
    public boolean needsRefueling() {
        return this.currentFuel <= this.fuelCapacity * 0.2; // Refuel if fuel drops below 20%
    }

    // Method to calculate the remaining distance that the vehicle can cover with the current fuel
    public double remainingDistance(double fuelConsumptionRate) {
        return this.currentFuel / fuelConsumptionRate;
    }

    // Method to update the current port of the vehicle
    public void setCurrentPort(Port port) {
        this.currentPort = port;
    }

    // Method to update the current fuel after a trip
    public boolean updateFuel(double distance, double fuelConsumptionRate) {
        double fuelNeeded = distance * fuelConsumptionRate;
        if (this.currentFuel >= fuelNeeded) {
            this.currentFuel -= fuelNeeded;
            return true;
        }
        return false; // Not enough fuel for the trip
    }

    // Add more methods as required
}

}

}

*/