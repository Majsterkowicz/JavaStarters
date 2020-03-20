package objected;

import java.util.List;

class Employee {

    private EmployeeType employeeType;
    private String name;
    private String surname;
    private double salary;
    private int id;
    private static int nextId = 1;

    public Employee(EmployeeType employeeTypeId, String name, String surname, double salary) {
        this.employeeType = employeeTypeId;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        setId();
    }

    public void setId() {
        id = nextId;
        nextId++;
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

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    @Override
    public String toString() {
        return String.format("ID %s: %s %s %s, zarabia %s", id, employeeType, name, surname, salary);
    }
}