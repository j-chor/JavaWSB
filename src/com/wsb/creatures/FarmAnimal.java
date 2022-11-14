package com.wsb.creatures;

public class FarmAnimal extends Animal implements Edible {
    FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        this.isAlive = false;
        System.out.println("mniam mniam");
    }

    @Override
    public void feed(Double foodWeight) {
        this.weight += foodWeight;
    }
}
