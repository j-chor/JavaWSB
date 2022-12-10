package com.wsb.devices;

public class ElectricCar extends Car{
    public ElectricCar(String producer, String model, Integer year, String color, Double value) {
        super(producer, model, year, color, value);
    }

    public void refuel() {
        System.out.println("Naładowano super eko 100% energią elektryczną");
    }
}
