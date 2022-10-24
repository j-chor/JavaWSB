public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal dog = new Animal("canis");
        dog.weight = 10.0;
        dog.species = "canis";
        dog.name = "Szarik";

        Animal cat = new Animal("cat");
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

        Car myCar = new Car("Fiat", "Punto");
        myCar.color = "Zielony";
        myCar.year = 1999;

        me.car = myCar;
        System.out.println(me.car.model);

        me.setSalary(200.0);
        me.getSalary();

        //ctrl + alt + l
    }
}