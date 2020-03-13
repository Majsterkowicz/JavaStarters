package objected;

public class EmployeeBasicData {

    private int employeeTypeId;
    private String name;
    private String surname;
    private double salary;

    public EmployeeBasicData(int employeeTypeId, String name, String surname, double salary) {
        this.employeeTypeId = employeeTypeId;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getEmployeeTypeId() {
        return employeeTypeId;
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
