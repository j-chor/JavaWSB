package devices;

public class Phone {
    final String model;
    final String producer;
    String color;
    final Integer year;
    Double value;
    public Double getValue() {
        return value;
    }

    public Phone(String model, String producer, String color, Integer year, Double value) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.year = year;
        this.value = value;
    }
}
