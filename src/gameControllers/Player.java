package gameControllers;

import placesWithCarsInThem.Garage;
import vehicles.Vehicle;

public class Player {
    private double money;
    public final String name;
    protected Garage[] ownedGarages;

    public Player(String name, double money){
        this.name = name;
        this.money = money;
        this.ownedGarages = new Garage[5];
        ownedGarages[0] = new Garage(100000, 100, new Vehicle[5]);
    }

    public boolean PurchaseCar(Vehicle car){
        if(car.value < money){
            System.out.println("zakupiono samochod");
            money -= car.value;
            return true;
        }
        System.out.println("nie masz hajsu chłopie");
        return false;
    }

    public boolean PutInGarage(Vehicle car, int n){
        return ownedGarages[n].putInGarage(car);
    }
}
