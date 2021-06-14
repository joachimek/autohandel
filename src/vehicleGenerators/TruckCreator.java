package vehicleGenerators;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class TruckCreator extends VehicleCreator{
    private CarIDDistributor distributor = new CarIDDistributor();
    private int capacity;
    Random generator = new Random();

    public void assignModel(){
        try {
            Scanner reader = new Scanner(new File("carModels.txt"));
            int offset = Integer.parseInt(carID.substring(0,1)) + 25;
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

    public void setCapacity(){
        capacity = generator.nextInt(100) + 50;
    }

    public void setTruckParameters(){
        assignModel();
        setYearOfProduction();
        setColor();
        setMileage();
        setValue();
        setCapacity();
        setValue();
    }

    public TruckCreator(){
        carID = distributor.giveID();
        setTruckParameters();
    }
}
