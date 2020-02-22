package objected;

public class Supervisor extends Employee {

    private double bonus;

    public Supervisor(String name, String surname, double salary, double bonus) {
        super(name, surname, salary);
        this.bonus = bonus;
    }


    @Override
    public String showClass() {
        return "Jesteś w klasie Supervisor";
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "bonus=" + super.getName() + bonus +
                '}';
    }

}