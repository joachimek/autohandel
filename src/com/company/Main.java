package com.company;
import vehicleGenerators.CarCreator;
import vehicles.*;
import placesWithCarsInThem.*;
import vehicleGenerators.VehicleCreator;

public class Main {

    public static void main(String[] args) {
    	CarCreator carCreator = new CarCreator("0110");
    	Car autotest = (Car) carCreator.Create();
    	System.out.println(autotest.toString());
    	Vehicle[] garageTesting = new Vehicle[10];
    	garageTesting[0] = autotest;
		Garage garage = new Garage(100.0,100.0,garageTesting);
		Market market = new Market();
		market.ShowCars();
    }
}
