public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", 4, "John");
        System.out.println("Vehicle manufacturer: " + vehicle.getManufacturer());
        System.out.println("Vehicle cylinders: " + vehicle.getNumCylinders());
        System.out.println("Vehicle owner: " + vehicle.getOwner());

        Truck truck = new Truck("Ford", 8, "Mary", 3.5, 4.0);
        System.out.println("Truck manufacturer: " + truck.getManufacturer());
        System.out.println("Truck cylinders: " + truck.getNumCylinders());
        System.out.println("Truck owner: " + truck.getOwner());
        System.out.println("Truck load capacity: " + truck.getLoadCapacity());
        System.out.println("Truck towing capacity: " + truck.getTowingCapacity());
    }
}
