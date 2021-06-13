package gameControllers;

import placesWithCarsInThem.Garage;
import vehicles.Vehicle;

public class CarBuyer {
    public void buy(Player player, Vehicle car){
        if(player.PurchaseCar(car)) player.PutInGarage(car, 0);
    }
}
