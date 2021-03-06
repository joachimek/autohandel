package placesWithCarsInThem;

import vehicleGenerators.CarCreator;
import vehicleGenerators.CarIDDistributor;
import vehicles.Vehicle;

public class Market{
    private CarIDDistributor distributor = new CarIDDistributor();
    protected Vehicle[] vehiclesInGarage = new Vehicle[15];
    protected CarCreator creator = new CarCreator();

    public void FillMarket(){
        for(int i = 0; i < vehiclesInGarage.length; i++){
            vehiclesInGarage[i] = creator.Create();
        }
    }

    public Market(){
        FillMarket();
    }

    public void ShowCars(){
        System.out.println("samochody do kupienia:\n");
        for (Vehicle vehicle: vehiclesInGarage) {
            System.out.println(vehicle.toString());
        }
    }
}
