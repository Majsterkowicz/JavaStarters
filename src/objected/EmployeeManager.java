package objected;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {

    private static Scanner scanner = new Scanner(System.in);
    private static final List<String> EMPLOYEE_TYPES = List.of("Pracownik", "Brygadzista", "Kierownik", "Dyrektor");


    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        do {
            showEmployeesTypes();
            String empType = chooseEmployeeType();
            Employee employee = createEmployee(empType);
            employees.add(employee);
            System.out.println("Czy dodać kolejnego pracownika? (t/n)");
        } while (doesUserWantToContinue());

        showEmployees(employees);
    }

    private static boolean doesUserWantToContinue() {
        return "t".equals(scanner.next());
    }

    private static void showEmployeesTypes() {
        for (int i = 0; i < EMPLOYEE_TYPES.size(); i++) {
            System.out.println(i + 1 + ". " + EMPLOYEE_TYPES.get(i));
        }
    }

    private static String chooseEmployeeType() {
        System.out.println("Podaj numer pracownika, który chcesz utworzyć:");
        int choose = scanner.nextInt();
        return EMPLOYEE_TYPES.get(choose - 1);
    }

    private static Employee createEmployee(String empType) {
        switch (empType) {
            case "Pracownik": {
                System.out.println("Dodajesz pracownika");
                EmployeeBasicData employeeBasicData = prepareEmployeeBasicData();
                return new Employee(
                        empType,
                        employeeBasicData.getName(),
                        employeeBasicData.getSurname(),
                        employeeBasicData.getSalary());
            }
            case "Brygadzista": {
                System.out.println("Dodajesz brygadzistę");
                EmployeeBasicData employeeBasicData = prepareEmployeeBasicData();
                List<String> tools = createTools();
                return new Foreman(
                        empType,
                        employeeBasicData.getName(),
                        employeeBasicData.getSurname(),
                        employeeBasicData.getSalary(),
                        tools);
            }
            case "Kierownik": {
                System.out.println("Dodajesz kierownika");
                EmployeeBasicData employeeBasicData = prepareEmployeeBasicData();
                double bonus = createBonus();
                return new Supervisor(
                        empType,
                        employeeBasicData.getName(),
                        employeeBasicData.getSurname(),
                        employeeBasicData.getSalary(),
                        bonus);
            }
            case "Dyrektor": {
                System.out.println("Dodajesz dyrektora");
                EmployeeBasicData employeeBasicData = prepareEmployeeBasicData();
                double bonus = createBonus();
                String carId = createCarId();
                return new Director(
                        empType,
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

    private static EmployeeBasicData prepareEmployeeBasicData() {
        System.out.println("Podaj imię");
        String name = scanner.next();
        System.out.println("Podaj nazwisko");
        String surname = scanner.next();
        System.out.println("Podaj pensję");
        double salary = scanner.nextDouble();
        return new EmployeeBasicData(name, surname, salary);
    }

    private static List<String> createTools() {
        List<String> tools = new ArrayList<>();
        do {
            System.out.println("Podaj narzędzie");
            String tool = scanner.next();
            tools.add(tool);
            System.out.println("Dodać kolejne narzędzie?");
        } while (doesUserWantToContinue());
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

    private static void showEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}