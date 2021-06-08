package vehicleGenerators;

import vehicles.Vehicle;

import java.util.Random;

public class CarCreator extends VehicleCreator{
    protected boolean airConditioning;
    protected boolean stockRadio;

    public void setAirConditioning(){
        Random generator = new Random();
        airConditioning = generator.nextBoolean();
    }
    public void setStockRadio(){
        Random generator = new Random();
        stockRadio = generator.nextBoolean();
    }
    public CarCreator(String carID) {
        super(carID);
        assignModel();
        setYearOfProduction();
        setMileage();
        setColor();
        setValue();
        setAirConditioning();
        setStockRadio();
    }
    public Vehicle Create(){
        return new Vehicle(carID,value,brand,model,mileage,color,segment,yearOfProduction);
    }
}
