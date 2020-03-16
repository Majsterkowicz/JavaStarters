package objected;

import java.util.Scanner;
import java.util.logging.Logger;

public class EmployeeRegister {

    private static final Logger LOGGER = Logger.getLogger( EmployeeRegister.class.getName() );


    public static Scanner scanner = new Scanner(System.in);

    private static final Logger logger = Logger.getLogger(EmployeeRegister.class.getName());

    public static void main(String[] args) {
        int numberOfEmployees = setNumberOfEmployees();
        Employee[] staff = createEmployees(numberOfEmployees);
        showEmployeesData(staff);
        showNextId();
    }

    private static int setNumberOfEmployees() {
        System.out.println("Podaj ilość pracowników");
        int numberOfEmloyees = scanner.nextInt();
        logger.info("Podano " + numberOfEmloyees + " pracownikow");
        return numberOfEmloyees;
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

            Employee employee = new Employee("pracownik",  name, surname, salary); ///brak id dodałęm roboczo - do poprawki
            staff[i] = employee;
        }
        System.out.println("Wprowadzono wszystkich pracowników.");
        return staff;
    }

    private static void showEmployeesData(Employee[] staff) {
        for (Employee employee : staff) {
            System.out.println(employee.toString());
        }
    }

    private static void showNextId() {
        System.out.println(String.format("Następny dostępny ID: %s", Employee.getNextId()));
    }
}