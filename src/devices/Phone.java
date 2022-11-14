package devices;

public class Phone extends Device{

    public Phone(String model, String producer, String color, Integer year, Double value) {
        super(producer, model, year, color, value);
    }


    @Override
    void turnOn() {
        System.out.println("Włączam...");
        System.out.println("Witaj");
    }
}
