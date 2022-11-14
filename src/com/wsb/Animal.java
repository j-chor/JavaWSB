package com.wsb;

public class Animal implements Sellable {
    String species;
    String name;
    Double weight;
    Boolean isAlive;

    void checkWeight() {
        if (this.weight <= 0.0) {
            this.isAlive = false;
        }
    }

    Animal(String species) {
        this.isAlive = true;
        this.species = species;
    }

    void feed() {
        checkWeight();
        if (this.isAlive) {
            this.weight += 0.5;
            System.out.println("dzięki za żarcie");
        } else {
            System.out.println("Martwe zwierzę nie chce jeść.");
        }
    }

    void takeForAWalk() {
        checkWeight();
        if (this.isAlive) {
            this.weight -= 0.5;
            System.out.println("dzięki za spacer");
        } else {
            System.out.println("Halo policja?");
        }
    }

    @Override
    public String toString() {
        return "com.wsb.Animal{" +
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
