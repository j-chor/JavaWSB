package big;

public class Car extends Device {
    Double value;
    public Double engineVolume;
    public String plates;

    public Car(String producer, String model, Integer yearOfProduction, String color) {
        super(producer, model, yearOfProduction, color);
        this.engineVolume = 1.9;
    }

    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }

    void turnOn() {
        System.out.println("włączam...");
        System.out.println("włączone!");
    }
}
