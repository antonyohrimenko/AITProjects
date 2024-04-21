package lesson18.homework;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class Car {

    private int year;
    private int price;
    private String brand;
    private String model;

    // предположим что у наших машин бак не более 60 литров
    private int tank_fuel = 60;

    public Car(String brand, String model, int year, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void getInfo() {
        System.out.println("Brand: " + brand + " " + model + " " + year + "-y.o" + ". Price $: " + price);
    }

    void checkFuel() {
        System.out.println("Remain: " + tank_fuel + "L. of Fuel");
    }

    void refuel() {
        tank_fuel = 60;
        System.out.println("===============================");
        System.out.println("Thanks, tank is total refilled! ");
        System.out.println("===============================");
    }

    void drive() {
        while (tank_fuel <= 10) {
            System.out.println("WARNING! Low volume of Fuel! Please refuel me!");
            checkFuel();
            System.out.println("Okeee, going to gas station...");
            return;
        }
        Random rnd = new Random();
        tank_fuel -= rnd.nextInt(10) +1;
        System.out.println("Vroom-Vroom-Vroom...!");
        checkFuel();
    }


}
