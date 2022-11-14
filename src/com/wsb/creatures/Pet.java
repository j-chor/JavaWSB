package com.wsb.creatures;

public class Pet extends Animal{
    public Pet(String species) {
        super(species);
    }

    @Override
    public void feed(Double foodWeight) {
        this.weight += foodWeight;
        System.out.println("dzięki za żarło");
    }
}
