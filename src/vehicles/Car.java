package vehicles;
import java.io.*;
import java.util.Scanner;

public class Car extends Vehicle implements AssignModel {
    protected boolean airConditioning;
    protected boolean stockRadio;

    public Car(String carID, float value, String brand, String model, int mileage, String color, String segment, boolean airConditioning, boolean stockRadio) {
        super(carID, value, brand, model, mileage, color, segment);
        this.airConditioning = airConditioning;
        this.stockRadio = stockRadio;
    }


    public void assignModel(){
        //TODO zrobić to bo wypierdala exception filenotfound
        /*Scanner reader = new Scanner(new File("carModels"));
        for(int i = 0; i < carID.charAt(0); i++){
            for(int j = 0; j < 5; j++){
                reader.nextLine();
            }
        }
        for(int i = 0; i < carID.charAt(1); i++){
            reader.nextLine();
        }
        String modelData = reader.nextLine();
        System.out.println(modelData);*/
    }

    @Override
    public String toString() {
        String returnString = "DANE AUTA: " + "\n\tcena: " + value + "\n\tmarka: " + brand +
                "\n\tmodel: " + model + "\n\tprzebieg: " + mileage + "\n\tkolor: "  + color +
                "\n\tsegment: " + segment;
        if(airConditioning) returnString += "\n\tz fabrycznym radiem";
        if(stockRadio) returnString += "\n\tz klimatyzacją";
        return returnString;
    }

}
