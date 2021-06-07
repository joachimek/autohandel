package vehicles;
public class Vehicle implements AssignModel {
    //baza samochodu
    //TODO ważne elementy różnych rzeczy i w ogóle
    final protected String carID;
    public float value;
    final protected String brand;
    final protected String model;
    public int mileage;
    public String color;
    final protected String segment;

    boolean breaksOk;
    boolean suspensionOk;
    boolean engineOk;
    boolean bodyOk;
    boolean transmissionOk;

    public Vehicle(String carID, float value, String brand, String model, int mileage, String color, String segment){
    this.carID = carID;
        this.value = value;
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.color = color;
        this.segment = segment;
    }

    public String toString() {
        return carID;
    }

    public void assignModel(){}
}
