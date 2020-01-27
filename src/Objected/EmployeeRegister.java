package Objected;

import java.util.Scanner;

public class EmployeeRegister {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfEmployees = setNumberOfEmployees();
        Employee[] staff = createEmployees(numberOfEmployees);
        showEmployeesData(staff);
        showNextId();
    }

    private static int setNumberOfEmployees() {
        System.out.println("Podaj ilość pracowników");
        return scanner.nextInt();
    }

    private static Employee[] createEmployees(int numberOfEmployees) {
        Employee[] staff = new Employee[numberOfEmployees];
        for (int i = 0; i < staff.length; i++) {
            System.out.println(String.format("Podaj dane pracownika %s", i + 1));
            System.out.println("Podaj imię: ");
            String name = scanner.next();
            System.out.println("Podaj nazwisko: ");
            String surname = scanner.next();
            System.out.println("Podaj pensję: ");
            double salary = scanner.nextDouble();

            Employee employee = new Employee(name, surname, salary);
            employee.setId();
            staff[i] = employee;
        }
        System.out.println("Wprowadzono wszystkich pracowników.");
        return staff;
    }

    private static void showEmployeesData(Employee[] staff) {
        for (int i = 0; i < staff.length; i++) {
            String name = staff[i].getName();
            String surname = staff[i].getSurname();
            double salary = staff[i].getSalary();
            int id = staff[i].getId();
            System.out.println(String.format("ID: %s. pracownik: %s %s, zarabia %s", id, name, surname, salary));
        }
    }

    private static void showNextId(){
        System.out.println(String.format("Następny dostępny ID: %s", Employee.getNextId()));
    }
}