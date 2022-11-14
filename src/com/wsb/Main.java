package com.wsb;

import com.wsb.creatures.Animal;
import com.wsb.creatures.Human;
import com.wsb.creatures.Pet;
import com.wsb.devices.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal dog = new Pet("canis");
        dog.weight = 10.0;
        dog.species = "canis";
        dog.name = "Szarik";

        Animal cat = new Pet("cat");
        cat.name = "kici";
        cat.weight = 2.0;


        cat.feed();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.feed();

        System.out.println(cat.weight);
        System.out.println((cat.isAlive));

        Human me = new Human();
        me.pet = dog;

        Car myCar = new Car("Fiat", "Punto", 1999, "Zielony", 100.0);


        me.setSalary(200.0);
        me.getSalary();

        me.setCar(myCar);
        System.out.println(me.getCar().getValue());
        System.out.println(me.getCar());

        Car newCar = new Car("Mazda", "RX-7", 1990, "White", 300.0);
        System.out.println(newCar);

        myCar.turnOn();


        Human buyer = new Human();
        buyer.setCash(100.0);
        me.setCash(0.0);
//        System.out.println("auto kupca: " + buyer.getCar() + " auto moje: "
//                + me.getCar() + " kasa kupca: " + buyer.getCash()
//                + " moja kasa: " + me.getCash());
        me.getCar().sell(me, buyer, 50.0);
//        System.out.println("auto kupca: " + buyer.getCar() + " auto moje: "
//                + me.getCar() + " kasa kupca: " + buyer.getCash()
//                + " moja kasa: " + me.getCash());
        me.pet.sell(me, buyer, 12.5);

        System.out.println(buyer.pet.weight);
        buyer.pet.feed(10.0);
        System.out.println(buyer.pet.weight);



        //ctrl + alt + l
    }
}