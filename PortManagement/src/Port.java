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
