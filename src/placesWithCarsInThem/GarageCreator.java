package placesWithCarsInThem;

import vehicleGenerators.CarCreator;
import vehicles.Vehicle;

import java.util.Random;

public class GarageCreator {
    protected double price;
    protected double monthlyCost;
    protected Vehicle[] vehiclesInGarage;
    Random generator = new Random();

    private void setVehiclesInGarage(){
        vehiclesInGarage = new Vehicle[5 + generator.nextInt(10)];
        if(generator.nextInt(10) == 0){
            CarCreator creator = new CarCreator("0101");
            vehiclesInGarage[0] = creator.Create();
        }
    }

    private void setPrice(){
        price = 10000 * (generator.nextInt(10) + 1);
        if(vehiclesInGarage[0] != null) price += vehiclesInGarage[0].value;
    }

    private void setMonthlyCost(){
        monthlyCost = price / 24;
    }

    public GarageCreator(){
        setVehiclesInGarage();
        setPrice();
        setMonthlyCost();
    }

    public Garage create(){
        return new Garage(price,monthlyCost,vehiclesInGarage);
    }
}
