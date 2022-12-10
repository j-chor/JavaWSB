package com.wsb.devices;

public class DieselCar extends Car{
    public DieselCar(String producer, String model, Integer year, String color, Double value) {
        super(producer, model, year, color, value);
    }

    public void refuel() {
        System.out.println("Zatankowano dizla pod kurek");
    }
}
