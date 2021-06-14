package gameControllers;

import vehicles.Vehicle;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Client {
    String name;
    Vehicle[] dreamCars;
    Vehicle tempCar;

    public Client(String name, Vehicle[] dreamCars){
        this.name = name;
        this.dreamCars = dreamCars;
    }

    public void assignTemporaryCar(Vehicle car){
        tempCar = car;
    }

    public void buyCar(Vehicle car){

    }
}
