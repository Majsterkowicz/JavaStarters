package objected;

import java.util.List;

public class Foreman extends Employee {

    private List<String> tools;

    public Foreman(EmployeeType employeeType, String name, String surname, double salary, List<String> tools) {
        super(employeeType, name, surname, salary);
        this.tools = tools;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public EmployeeType getEmployeeType() {
        return super.getEmployeeType();
    }

    @Override
    public String toString() {
        return String.format("ID: %s %s %s %s, zarabia %s, narzędzia: %s",
                super.getId(), getEmployeeType(), super.getName(), super.getSurname(), super.getSalary(), tools);
    }
}
