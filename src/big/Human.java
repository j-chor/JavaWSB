package big;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Human extends Animal {
    String firstName;
    String lastName;
    Animal pet;
    Integer yearOfBirth;
    private Car car;

    public Human() {
        super("homo sapiens");
        this.salary = 0.0;
    }
    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        if (this.salary >= car.value) {
            System.out.println("Kupiono samochód za gotówkę");
            this.car = car;
        } else if (this.salary >= car.value * (1 / 12)) {
            System.out.println("Kupiono samochód na kredyt (trudno)");
            this.car = car;
        } else System.out.println("Za mało kasy zarabiasz, zmień pracę i weź kredyt");
    }

    private Double salary;

    public Double getSalary() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
        System.out.println("Informacje o wypłacie pobrano o " + dtf.format(LocalDateTime.now()));
        System.out.println("Wartość wypłaty: " + String.valueOf(salary));
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Nie przypisuj ujemnej wypłaty!");
            return;
        }
        System.out.println("Nowa wartość wypłaty została przypisana do systemu księgowego");
        System.out.println("Proszę odebrać aneks od Pani Hani z kadr");
        System.out.println("Wiadomość od ZUS i US: \"OBSERWUJEMY CIĘ\"");
        this.salary = salary;
    }

    @Override
    public void feed(Double foodWeight) {

    }
}
