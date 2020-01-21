package Objected;

import java.util.Scanner;

public class EmployeeRegister {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfEployees = setNumberOfEmployees();
        Employee[] staff = new Employee[numberOfEployees];
        setEmployeeData(staff);
    }

    private static int setNumberOfEmployees() {
        System.out.println("Podaj ilość pracowników");
        return scanner.nextInt();
    }

    private static void setEmployeeData(Employee[] employees) {
        employees[id].setName();
    }

    private static void getEmployeeData(Employee[] employees, int id) {
        employees[id].getName();
        employees[id].getSurname();
        employees[id].getSalary();
    }

}

class Employee {
    private String name;
    private String surname;
    private double salary;
    private int id;
    private static int nextId = 1;

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        id = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setId(int id) {
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
}
