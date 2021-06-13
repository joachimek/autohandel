package com.company;
import gameControllers.CarBuyer;
import gameControllers.Player;
import vehicleGenerators.CarCreator;
import vehicleGenerators.CarIDDistributor;
import vehicles.*;
import placesWithCarsInThem.*;
import vehicleGenerators.VehicleCreator;

public class Main {

    public static void main(String[] args) {
        CarBuyer buyer = new CarBuyer();
		Market market = new Market();
		market.ShowCars();
        Player player = new Player("joachim", 100000.0);
        Car autotest = new Car("0110", 1000, "volkswagen", "polo", 10000, "red",
                "budget", "2010", false, false);
        buyer.buy(player, autotest);
    }
}
