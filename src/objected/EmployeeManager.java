package objected;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //List<String> employeeTypes = List.of("Pracownik", "Brygadzista", "Kierownik", "Dyrektor");
        List<Employee> employees = prepareEmployeeList(employeeTypes());
        showEmployees(employees);
    }
    public static List<String> employeeTypes(){
        return List.of("Pracownik", "Brygadzista", "Kierownik", "Dyrektor");
    }

    private static void showEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static void showEmployeesTypes(List<String> employeesType) {
        for (int i = 0; i < employeesType.size(); i++) {
            System.out.println(i + 1 + ". " + employeesType.get(i));
        }
    }

    private static List<Employee> prepareEmployeeList(List<String> employeeTypes) {
        List<Employee> employees = new ArrayList<>();
        String choose;
        do {
            int empType = chooseEmployeeType(employeeTypes);
            if (empType < 1 || empType > employeeTypes.size()) {
                System.out.println("Wybrano błędny typ. Wybierz ponownie");
                prepareEmployeeList(employeeTypes);
            }
            Employee employee = createEmployee(empType);
            employees.add(employee);
            System.out.println("Czy dodać następnego pracownika? (t/n)");
            choose = scanner.next();
        }
        while ("t".equals(choose));
        return employees;
    }

    private static int chooseEmployeeType(List<String> employeeTypes) {
        System.out.println("Podaj numer pracownika, który chcesz utworzyć:");
        showEmployeesTypes(employeeTypes);
        return scanner.nextInt();
    }

    private static Employee createEmployee(int empType) {
        switch (empType) {
            case 1: {
                System.out.println("Dodajesz pracownika");
                EmployeeBasicData employeeBasicData = prepareEmployeeBasicData(1);
                return new Employee(
                        employeeBasicData.getEmployeeTypeId(),
                        employeeBasicData.getName(),
                        employeeBasicData.getSurname(),
                        employeeBasicData.getSalary());
            }
            case 2: {
                System.out.println("Dodajesz brygadzistę");
                EmployeeBasicData employeeBasicData = prepareEmployeeBasicData(2);
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
                EmployeeBasicData employeeBasicData = prepareEmployeeBasicData(3);
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
                EmployeeBasicData employeeBasicData = prepareEmployeeBasicData(4);
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