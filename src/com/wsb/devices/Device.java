package com.wsb.devices;

import com.wsb.Sellable;

abstract public class Device implements Sellable {
    final String model;
    final String producer;
    String color;
    final Integer year;
    Double value;
    public Double getValue() {
        return value;
    }

    public Device(String producer, String model, Integer year, String color, Double value) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.color = color;
        this.value = value;
    }

    abstract void turnOn();

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", value=" + value;
    }
}
