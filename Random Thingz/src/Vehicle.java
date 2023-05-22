public class Vehicle {
    private String manufacturer;
    private int numCylinders;
    private String owner;

    public Vehicle(String manufacturer, int numCylinders, String owner) {
        this.manufacturer = manufacturer;
        this.numCylinders = numCylinders;
        this.owner = owner;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    public String getOwner() {
        return owner;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setNumCylinders(int numCylinders) {
        this.numCylinders = numCylinders;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
