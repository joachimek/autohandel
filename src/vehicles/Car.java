package vehicles;
import java.io.*;
import java.util.Scanner;

public class Car extends Vehicle{
    protected boolean airConditioning;
    protected boolean stockRadio;

    public Car(String carID, float value, String brand, String model, int mileage, String color, String segment,
               String yearOfProduction, boolean airConditioning, boolean stockRadio) {
        super(carID, value, brand, model, mileage, color, segment, yearOfProduction);
        this.airConditioning = airConditioning;
        this.stockRadio = stockRadio;
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
