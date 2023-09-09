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