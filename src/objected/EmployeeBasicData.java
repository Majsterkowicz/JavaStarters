package objected;

public class EmployeeBasicData {

    private String name;
    private String surname;
    private double salary;

    public EmployeeBasicData(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }
}
