package vehicles;

public class Truck extends Vehicle{
    protected final int capacity;

    public Truck(String carID, float value, String brand, String model, int mileage, String color, String segment, String yearOfProduction, int capacity) {
        super(carID, value, brand, model, mileage, color, segment, yearOfProduction);
        this.capacity = capacity;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("DANE POJAZDU: " + "\n\tcena: " + value + "\n\tmarka: " + brand +
                "\n\tmodel: " + model + "\n\tprzebieg: " + mileage + "\n\tkolor: "  + color +
                "\n\tsegment: " + segment);
        sb.append("\nMIEJSCE ŁADUNKOWE: " + capacity);
        return String.valueOf(sb);
    }
}
