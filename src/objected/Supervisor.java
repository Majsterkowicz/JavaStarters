package objected;

public class Supervisor extends Employee {

    private double bonus;

    public Supervisor(int employeeTypeId, String name, String surname, double salary, double bonus) {
        super(employeeTypeId, name, surname, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String showClass() {
        return "Jesteś w klasie Supervisor";
    }

    @Override
    public String toString() {
        return super.toString() + " + " + bonus + " premii";
    }

}