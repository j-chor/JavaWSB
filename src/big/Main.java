package big;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Pet dog = new Pet("canis");
        dog.weight = 10.0;
        dog.species = "canis";
        dog.name = "Szarik";

        Pet cat = new Pet("cat");
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

        Car myCar = new Car("Fiat", "Punto", 1999, "red");
        myCar.value = 100.0;


        me.setSalary(200.0);
        me.getSalary();

        me.setCar(myCar);
        System.out.println(me.getCar().model);

        System.out.print(myCar);
        //ctrl + alt + l
    }
}