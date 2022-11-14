package devices;

public class Car extends Device{

    public Car(String producer, String model, Integer year, String color, Double value) {
        super(producer, model, year, color, value);
    }

    @Override
    public void turnOn() {
        System.out.println("Przekręcam kluczyk...");
        System.out.println("i-i-i-i-");
        System.out.println("brum!");
    }

}
