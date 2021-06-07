package vehicles;

public class Truck extends Vehicle implements AssignModel {
    protected final int capacity;

    public Truck(String carID, float value, String brand, String model, int mileage, String color, String segment, int capacity) {
        super(carID, value, brand, model, mileage, color, segment);
        this.capacity = capacity;
    }
}
