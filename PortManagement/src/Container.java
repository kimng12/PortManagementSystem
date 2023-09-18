public class Container {
    private String id;
    private double weight;

    public Container(String id, double weight) {
        this.id = id;
        this.weight = weight;
    }

    public abstract double getFuelConsumptionPerKmForShip();
    public abstract double getFuelConsumptionPerKmForTruck();

    // getters, setters, and other methods...
}

class DryStorage extends Container {
    public DryStorage(String id, double weight) {
        super(id, weight);
    }

    @Override
    public double getFuelConsumptionPerKmForShip() {
        return 3.5;
    }

    @Override
    public double getFuelConsumptionPerKmForTruck() {
        return 4.6;
    }
}

/*
public class Container {
    private String id; // Unique ID formatted as c-number
    private double weight; // Weight of the container
    private String type; // Type of the container (dry storage, open top, open side, refrigerated, liquid)

    // Constructors
    public Container(String id, double weight, String type) {
        this.id = id;
        this.weight = weight;
        this.type = type;
    }

    // Getters
    public String getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    // Calculate the fuel consumption for this container based on the vehicle type
    public double calculateFuelConsumption(String vehicleType, double distance) {
        double fuelConsumptionPerUnitWeightPerKm = 0.0;
        if ("Ship".equalsIgnoreCase(vehicleType)) {
            switch (type) {
                case "Dry storage":
                    fuelConsumptionPerUnitWeightPerKm = 3.5;
                    break;
                case "Open top":
                    fuelConsumptionPerUnitWeightPerKm = 2.8;
                    break;
                case "Open side":
                    fuelConsumptionPerUnitWeightPerKm = 2.7;
                    break;
                case "Refrigerated":
                    fuelConsumptionPerUnitWeightPerKm = 4.5;
                    break;
                case "Liquid":
                    fuelConsumptionPerUnitWeightPerKm = 4.8;
                    break;
                default:
                    System.out.println("Invalid container type");
            }
        } else if ("Truck".equalsIgnoreCase(vehicleType)) {
            switch (type) {
                case "Dry storage":
                    fuelConsumptionPerUnitWeightPerKm = 4.6;
                    break;
                case "Open top":
                    fuelConsumptionPerUnitWeightPerKm = 3.2;
                    break;
                case "Open side":
                    fuelConsumptionPerUnitWeightPerKm = 3.2;
                    break;
                case "Refrigerated":
                    fuelConsumptionPerUnitWeightPerKm = 5.4;
                    break;
                case "Liquid":
                    fuelConsumptionPerUnitWeightPerKm = 5.3;
                    break;
                default:
                    System.out.println("Invalid container type");
            }
        } else {
            System.out.println("Invalid vehicle type");
        }

        return fuelConsumptionPerUnitWeightPerKm * weight * distance;
    }
}

*/