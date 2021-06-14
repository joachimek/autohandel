package gameControllers;

import vehicles.Vehicle;

import java.util.Random;

public class Mechanic {
    final private int skill;
    final private float priceMultiplier;
    final private boolean isClumsy;

    public Mechanic(int skill, float priceMultiplier, boolean isClumsy){
        this.isClumsy = isClumsy;
        this.priceMultiplier = priceMultiplier;
        this.skill = skill;
    }

    public int evaluateCar(Vehicle car){
        return (int)car.value * skill / 100;
    }

}
