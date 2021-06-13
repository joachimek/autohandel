package vehicleGenerators;
import vehicles.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class VehicleCreator implements AssignModel{
    protected String carID;
    protected int value;
    protected String brand;
    protected String model;
    protected int mileage;
    protected String color;
    protected String segment;
    protected String yearOfProduction;
    private CarIDDistributor distributor = new CarIDDistributor();

    public void assignModel(){
        try {
            Scanner reader = new Scanner(new File("carModels.txt"));
            int offset = (Integer.parseInt(carID.substring(0,1)) * 5) + Integer.parseInt(carID.substring(1,2));
            for(int i = 0; i < offset; i++) reader.nextLine();
            String[] tempParts = reader.nextLine().split("/", 3);
            brand = tempParts[0];
            model = tempParts[1];
            segment = tempParts[2];
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void setYearOfProduction(){
        Random generator = new Random();
        yearOfProduction = String.valueOf(2010 + generator.nextInt(12));
    }

    public void setMileage(){
        Random generator = new Random();
        mileage = (2021 - Integer.parseInt(yearOfProduction) + 1) * generator.nextInt(10) * 1000;
    }

    public void setColor(){
        Random generator = new Random();
        int temp = generator.nextInt(4);
        switch (temp) {
            case 0 -> color = "black";
            case 1 -> color = "white";
            case 2 -> color = "yellow";
            case 3 -> color = "red";
        }
    }

    public void setValue(){
        switch (carID.substring(0, 1)) {
            case "0" -> value = 10000 / (2022 - Integer.parseInt(yearOfProduction));
            case "1" -> value = 20000 / (2022 - Integer.parseInt(yearOfProduction));
            case "2" -> value = 30000 / (2022 - Integer.parseInt(yearOfProduction));
            case "3" -> value = 12000 / (2022 - Integer.parseInt(yearOfProduction));
            case "4" -> value = 15000 / (2022 - Integer.parseInt(yearOfProduction));
        }
        if(color.equals("red")){
            value *= 1.1;
        }
    }

    public VehicleCreator() {
        this.carID = distributor.giveID();
        assignModel();
        setYearOfProduction();
        setMileage();
        setColor();
        setValue();
    }

    public Vehicle Create(){
        return new Vehicle(carID,value,brand,model,mileage,color,segment,yearOfProduction);
    }
}
