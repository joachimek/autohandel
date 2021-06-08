package placesWithCarsInThem;
import vehicles.*;

public class Garage {
    protected final double price;
    protected final double monthlyCost;
    protected Vehicle[] vehiclesInGarage;
    
    public Garage(double price, double monthlyCost, Vehicle[] vehiclesInGarage){
        this.price = price;
        this.monthlyCost = monthlyCost;
        this.vehiclesInGarage = vehiclesInGarage;
    }
    
    public void LookInto(){
        System.out.println("W tym garażu znajdują się:\n");
        for (Vehicle vehicle: vehiclesInGarage) {
            System.out.println(vehicle.toString());
        }
    }
}
