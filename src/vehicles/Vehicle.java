package vehicles;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Vehicle{
    //baza samochodu
    //TODO ważne elementy różnych rzeczy i w ogóle
    final protected String carID;
    public float value;
    final protected String brand;
    final protected String model;
    public int mileage;
    public String color;
    final protected String segment;
    final protected String yearOfProduction;

    boolean breaksOk;
    boolean suspensionOk;
    boolean engineOk;
    boolean bodyOk;
    boolean transmissionOk;

    public Vehicle(String carID, float value, String brand, String model, int mileage, String color, String segment, String yearOfProduction){
    this.carID = carID;
        this.value = value;
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.color = color;
        this.segment = segment;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return carID;
    }

    public void repair(boolean part){
        part = true;
    }

}
