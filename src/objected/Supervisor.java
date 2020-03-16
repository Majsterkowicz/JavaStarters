package objected;

public class Supervisor extends Employee {

    private double bonus;

    public Supervisor(String employeeType, String name, String surname, double salary, double bonus) {
        super(employeeType, name, surname, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " + " + bonus + " premii";
    }

}