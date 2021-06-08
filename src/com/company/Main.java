package com.company;
import vehicleGenerators.CarCreator;
import vehicles.*;
import vehicleGenerators.VehicleCreator;

public class Main {

    public static void main(String[] args) {
    	CarCreator carCreator = new CarCreator("0110");
    	Vehicle autotest = carCreator.Create();
    	System.out.println(autotest.toString());
    }
}
