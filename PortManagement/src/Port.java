public class Port {

    private String id;
    private String name;
    private double latitude;
    private double longitude;
    private double storingCapacity;
    private boolean landingAbility;
    private List<Container> containers;
    private List<Vehicle> vehicles;
    private List<Trip> trafficHistory;

    // Constructors,

    public Port(String id, String name, double latitude, double longitude, double storingCapacity, boolean landingAbility, List<Container> containers, List<Vehicle> vehicles, List<Trip> trafficHistory) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.storingCapacity = storingCapacity;
        this.landingAbility = landingAbility;
        this.containers = containers;
        this.vehicles = vehicles;
        this.trafficHistory = trafficHistory;
    }

    // getters,

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getStoringCapacity() {
        return storingCapacity;
    }

    public boolean isLandingAbility() {
        return landingAbility;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<Trip> getTrafficHistory() {
        return trafficHistory;
    }

    // setters,

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setStoringCapacity(double storingCapacity) {
        this.storingCapacity = storingCapacity;
    }

    public void setLandingAbility(boolean landingAbility) {
        this.landingAbility = landingAbility;
    }

    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void setTrafficHistory(List<Trip> trafficHistory) {
        this.trafficHistory = trafficHistory;
    }

    // other methods...
}

/*
import java.util.HashMap;
import java.util.Map;

public class Port {
    private String id;  // Unique ID formatted as p-number
    private String name;
    private double latitude;
    private double longitude;
    private double storingCapacity;
    private boolean landingAbility;
    private Map<String, Integer> containerCounts; // A map to keep track of counts of different types of containers
    private Map<String, Double> containerWeights; // A map to keep track of weights of different types of containers
    private int numberOfVehicles;
    // Add more fields like historical traffic data if needed.

    // Constructor
    public Port(String id, String name, double latitude, double longitude, double storingCapacity, boolean landingAbility) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.storingCapacity = storingCapacity;
        this.landingAbility = landingAbility;
        this.containerCounts = new HashMap<>();
        this.containerWeights = new HashMap<>();
        this.numberOfVehicles = 0;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getStoringCapacity() {
        return storingCapacity;
    }

    public boolean hasLandingAbility() {
        return landingAbility;
    }

    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    // Add a container to the port
    public void addContainer(Container container) {
        String type = container.getType();
        double weight = container.getWeight();

        containerCounts.put(type, containerCounts.getOrDefault(type, 0) + 1);
        containerWeights.put(type, containerWeights.getOrDefault(type, 0.0) + weight);
    }

    // Remove a container from the port
    public void removeContainer(Container container) {
        String type = container.getType();
        double weight = container.getWeight();

        if (containerCounts.getOrDefault(type, 0) > 0) {
            containerCounts.put(type, containerCounts.get(type) - 1);
            containerWeights.put(type, containerWeights.get(type) - weight);
        } else {
            System.out.println("No such container type in the port.");
        }
    }

    // Calculate distance to another port
    public double calculateDistanceTo(Port otherPort) {
        // Simple Euclidean distance for demonstration; in a real application you'd use more accurate distance measures
        return Math.sqrt(Math.pow(this.latitude - otherPort.latitude, 2) + Math.pow(this.longitude - otherPort.longitude, 2));
    }

    // Add more methods based on your requirements like vehicle handling, tracking past and current traffic etc.

}

*/