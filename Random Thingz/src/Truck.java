public class Truck extends Vehicle {
    private double loadCapacity;
    private double towingCapacity;

    public Truck(String manufacturer, int numCylinders, String owner,
            double loadCapacity, double towingCapacity) {
        super(manufacturer, numCylinders, owner);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}