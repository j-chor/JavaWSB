package devices;

public class Car {
    final String model;
    final String producer;
    String color;
    final Integer year;
    Double value;

    public Double getValue() {
        return value;
    }

    public Car(String producer, String model, Integer year, String color, Double value) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return "devices.Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}
