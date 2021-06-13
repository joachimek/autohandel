package vehicleGenerators;

import java.util.Random;

public class CarIDDistributor {
    private String carID;
    Random generator = new Random();
    public void Generate(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 2; i++) sb.append(generator.nextInt(5));
        for(int i = 2; i < 5; i++) sb.append(generator.nextInt(10));
        carID = String.valueOf(sb);
    }
    public CarIDDistributor(){
        Generate();
    }
    public String giveID(){
        Generate();
        return carID;
    }
}
