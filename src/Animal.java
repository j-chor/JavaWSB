public class Animal {
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
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", isAlive=" + isAlive +
                '}';
    }
}
