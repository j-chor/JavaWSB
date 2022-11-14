package com.wsb.devices;

import com.wsb.creatures.Human;

public class Phone extends Device {

    public Phone(String model, String producer, String color, Integer year, Double value) {
        super(producer, model, year, color, value);
    }


    @Override
    void turnOn() {
        System.out.println("Włączam...");
        System.out.println("Witaj");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != null) {
            if (buyer.getCash() >= price) {
                buyer.phone = (seller.phone);
                seller.phone = null;
                seller.setCash(seller.getCash() + price);
                buyer.setCash(buyer.getCash() - price);
                System.out.println("Kupujący " + buyer + " kupił " + buyer.phone
                        + " od " + seller + " za " + price + " PLN");
            }
        }
    }
}
