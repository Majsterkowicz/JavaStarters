package objected;

import java.util.ArrayList;
import java.util.List;

public class Foreman extends Employee {

    private List<String> tools;

    public Foreman(int employeeTypeId, String name, String surname, double salary, List<String> tools) {
        super(employeeTypeId, name, surname, salary);
        this.tools = tools;
    }

    @Override
    public String showClass() {
        return "Jesteś w klasie Foreman";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getEmployeeTypeId() {
        return super.getEmployeeTypeId();
    }

    @Override
    public String toString() {
        return String.format("ID: %s. pracownik: %s %s, zarabia %s, narzędzia: %s",
                super.getId(), super.getName(), super.getSurname(), super.getSalary(), tools);
    }

    public String showTools() {
        return String.format("Foreman %s posiada: %s", getName(), tools.toString());
    }
}
