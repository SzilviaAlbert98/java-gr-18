import java.util.Optional;

public class Car {
    private String make;
    private String model;
    private Flue flue;
    private int power;
    private double engineCapacityInLiter;
    private int modelYear;
    private Optional<String> color;

    public Car(String make, String model, Flue flue, int power, double engineInLiter, int modelYear, Optional<String> color) {
        this.make = make;
        this.model = model;
        this.flue = flue;
        this.power = power;
        this.engineCapacityInLiter = engineInLiter;
        this.modelYear = modelYear;
        this.color = color;
    }

    public Optional<String> getColor() {
        return color;
    }

    public void setColor(Optional<String> color) {
        this.color = color;
    }

    public double getEngineCapacityInLiter() {
        return engineCapacityInLiter;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public int getPower() {
        return power;
    }

    public Flue getFlue() {
        return flue;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", flue=" + flue +
                ", power=" + power +
                ", engineCapacityInLiter=" + engineCapacityInLiter +
                ", modelYear=" + modelYear +
                ", color=" + color +
                '}';
    }
}
