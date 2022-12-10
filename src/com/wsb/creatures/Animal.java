package com.wsb.creatures;

import com.wsb.Sellable;

abstract public class Animal implements Sellable, Feedable{
    private static final Double DEFAULT_WALK_DISTANCE = 1.0;
    private static final Boolean DEFAULT_RUNNING_BOOL = false;
    public String species;
    public String name;
    public Double weight;
    public Boolean isAlive;

    void checkWeight() {
        if (this.weight <= 0.0) {
            this.isAlive = false;
        }
    }

    Animal(String species) {
        this.isAlive = true;
        this.species = species;
    }

    public void feed() {
        checkWeight();
        if (this.isAlive) {
            this.weight += 0.5;
            System.out.println("dzięki za żarcie");
        } else {
            System.out.println("Martwe zwierzę nie chce jeść.");
        }
    }

    public void takeForAWalk() {
        this.takeForAWalk(DEFAULT_WALK_DISTANCE);
    }
    
    public void takeForAWalk(Double distance) {
        takeForAWalk(distance, DEFAULT_RUNNING_BOOL);
    }

    public void takeForAWalk(Double distance, Boolean isRunning) {
        checkWeight();
        if (this.isAlive) {
            if (isRunning) {
                this.weight -= distance * 1.5;
            }
            else {
                this.weight -= distance * 0.5;
            }
            System.out.println("dzięki za spacer");
        } else {
            System.out.println("Halo policja?");
        }
    }
    
    @Override
    public String toString() {
        return "com.wsb.creatures.Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", isAlive=" + isAlive +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet != null) {
            if (buyer.getCash() >= price) {
                buyer.pet = (seller.pet);
                seller.pet = (null);
                seller.setCash(seller.getCash() + price);
                buyer.setCash(buyer.getCash() - price);
                System.out.println("Kupujący " + buyer + " kupił " + buyer.pet
                        + " od " + seller + " za " + price + " PLN");
            }
        }
    }
}
