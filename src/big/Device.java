package big;

public abstract class Device {

    protected final String producer;
    public final String model;
    public final Integer yearOfProduction;
    public String color;

    public Device(String producer, String model, Integer yearOfProduction, String color) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
    }

    abstract void turnOn();
}
