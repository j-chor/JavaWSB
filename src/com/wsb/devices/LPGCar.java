package com.wsb.devices;

public class LPGCar extends Car{
    public LPGCar(String producer, String model, Integer year, String color, Double value) {
        super(producer, model, year, color, value);
    }

    public void refuel() {
        System.out.println("Napełniono butlę z gazem");
    }
}
