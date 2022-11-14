package com.wsb.devices;

import com.wsb.creatures.Human;

public class Car extends Device {

    public Car(String producer, String model, Integer year, String color, Double value) {
        super(producer, model, year, color, value);
    }

    @Override
    public void turnOn() {
        System.out.println("Przekręcam kluczyk...");
        System.out.println("i-i-i-i-");
        System.out.println("brum!");
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getCar() != null) {
            if (buyer.getCash() >= price) {
                buyer.setCar(seller.getCar());
                seller.setCar(null);
                seller.setCash(seller.getCash() + price);
                buyer.setCash(buyer.getCash() - price);
                System.out.println("Kupujący " + buyer + " kupił " + buyer.getCar()
                        + " od " + seller + " za " + price + " PLN");
            }
        }
    }
}
