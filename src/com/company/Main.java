package com.company;
import vehicles.Car;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Car autotest = new Car("0100", 0000, "volkswagen", "golf", 400000, "czerwony",
            "ekonomiczny", true, false);
	System.out.println(autotest.toString());
    }
}
