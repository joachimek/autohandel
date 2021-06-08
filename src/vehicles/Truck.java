package vehicles;

public class Truck extends Vehicle{
    protected final int capacity;

    public Truck(String carID, float value, String brand, String model, int mileage, String color, String segment, String yearOfProduction, int capacity) {
        super(carID, value, brand, model, mileage, color, segment, yearOfProduction);
        this.capacity = capacity;
    }
}
