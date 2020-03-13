package objected;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Employee> employees = prepareEmployeeList();
        showEmployees(employees);
    }

    private static void showEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    List<String> employeesType = new ArrayList<>();

    {
        employeesType.add("Pracownik");
        employeesType.add("Brygadzista");
        employeesType.add("Kierownik");
        employeesType.add("Dyrektor");
        employeesType.add("Szef");
    }

    public static void showEmployeesTypes(List<String> employeesType) {
        for (int i = 0; i < employeesType.size(); i++) {
            System.out.println(i + ". " + employeesType.get(i));
        }
    }

    private static List<Employee> prepareEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        String choose;
        do {
            int empType = chooseEmployeeType();
            Employee employee = createEmployee(empType);
            employees.add(employee);
            System.out.println("Czy dodać następnego pracownika? (t/n)");
            choose = scanner.next();
        }
        while ("t".equals(choose));
        return employees;
    }

    private static int chooseEmployeeType() {
        System.out.println("Podaj numer pracownika, który chcesz utworzyć:");
        showEmployeesTypes();
        return scanner.nextInt();
    }

    private static Employee createEmployee(int empType) {
        switch (empType) {
            case 1: {
                System.out.println("Dodajesz pracownika");
                EmployeeBasicData employeeBasicData = prepareEmployeeBasicData();
                return new Employee(
                        employeeBasicData.getEmployeeTypeId(),
                        employeeBasicData.getName(),
                        employeeBasicData.getSurname(),
                        employeeBasicData.getSalary());
            }
            case 2: {
                System.out.println("Dodajesz brygadzistę");
                EmployeeBasicData employeeBasicData = prepareEmployeeBasicData();
                List<String> tools = createTools();
                return new Foreman(
                        employeeBasicData.getEmployeeTypeId(),
                        employeeBasicData.getName(),
                        employeeBasicData.getSurname(),
                        employeeBasicData.getSalary(),
                        tools);
            }
            case 3: {
                System.out.println("Dodajesz kierownika");
                EmployeeBasicData employeeBasicData = prepareEmployeeBasicData();
                double bonus = createBonus();
                return new Supervisor(
                        employeeBasicData.getEmployeeTypeId(),
                        employeeBasicData.getName(),
                        employeeBasicData.getSurname(),
                        employeeBasicData.getSalary(),
                        bonus);
            }
            case 4: {
                System.out.println("Dodajesz dyrektora");
                EmployeeBasicData employeeBasicData = prepareEmployeeBasicData();
                double bonus = createBonus();
                String carId = createCarId();
                return new Director(
                        employeeBasicData.getEmployeeTypeId(),
                        employeeBasicData.getName(),
                        employeeBasicData.getSurname(),
                        employeeBasicData.getSalary(),
                        bonus,
                        carId);
            }
            default:
                throw new IllegalArgumentException("Niepoprawne dane");
        }
    }

    private static EmployeeBasicData prepareEmployeeBasicData(int employeeTypeId) {
        System.out.println("Podaj imię");
        String name = scanner.next();
        System.out.println("Podaj nazwisko");
        String surname = scanner.next();
        System.out.println("Podaj pensję");
        double salary = scanner.nextDouble();
        return new EmployeeBasicData(employeeTypeId, name, surname, salary);
    }

    private static List<String> createTools() {
        List<String> tools = new ArrayList<>();
        String choice;
        do {
            System.out.println("Podaj narzędzie");
            String tool = scanner.next();
            tools.add(tool);
            System.out.println("Dodać kolejne narzędzie?");
            choice = scanner.next();
        }
        while (choice.equals("t"));
        return tools;
    }

    private static double createBonus() {
        System.out.println("Podaj premie:");
        return scanner.nextDouble();
    }

    private static String createCarId() {
        System.out.println("Podaje numer rejestracyjny:");
        return scanner.next();
    }
}