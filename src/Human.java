import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Integer yearOfBirth;
    Car car;

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

}
