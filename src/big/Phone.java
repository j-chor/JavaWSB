package big;

public class Phone extends Device {

    public Phone(String producer, String model, Integer yearOfProduction, String color) {
        super(producer, model, yearOfProduction, color);
    }
    @Override // Co to???
    void turnOn() {
        System.out.println("włączam...");
        System.out.println("włączone!");
    }
}
