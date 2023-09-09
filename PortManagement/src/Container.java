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
}
