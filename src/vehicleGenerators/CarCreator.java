package vehicleGenerators;

import vehicles.Car;
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
    public void setCarParameters(){
        assignModel();
        setYearOfProduction();
        setMileage();
        setColor();
        setValue();
        setAirConditioning();
        setStockRadio();
    }
    public CarCreator(String carID) {
        super(carID);
        setCarParameters();
    }
    public Vehicle Create(){
        setCarParameters();
        return new Car(carID,value,brand,model,mileage,color,segment,yearOfProduction,airConditioning,stockRadio);
    }
}
