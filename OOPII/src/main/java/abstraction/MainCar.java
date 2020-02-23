package abstraction;

public class MainCar {
    public static void main(String[] args) {
        Car truck = new Truck();
        truck.start();

        if (truck instanceof Truck) {
            ((Truck) truck).displayTruckLength();
        }
    }
}
