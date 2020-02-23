package abstraction;

public class Truck extends Car {
    @Override
    public void start() {
        System.out.println("the car starting mowing");
    }

    public void displayTruckLength() {
        System.out.println("truck is huge");
    }

}
