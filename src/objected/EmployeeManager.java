package objected;

import java.util.*;

import static objected.EmployeeType.*;

public class EmployeeManager {

    private static Scanner scanner = new Scanner(System.in);
    private static final List<EmployeeType> EMPLOYEE_TYPES = Arrays.asList(
            PRACOWNIK,
            BRYGADZISTA,
            KIEROWNIK,
            DYREKTOR);

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        do {
            showEmployeesTypes();
            EmployeeType empType = chooseEmployeeType();
            Employee employee = createEmployee(empType);
            employees.add(employee);
            System.out.println("Czy dodać kolejnego pracownika? (t/n)");
        } while (doesUserWantToContinue());

        showEmployees(employees);
        showNumberOfEmployees(employees);
    }

    private static boolean doesUserWantToContinue() {
        return "t".equals(scanner.next());
    }

    private static void showEmployeesTypes() {
        for (int i = 0; i < EMPLOYEE_TYPES.size(); i++) {
            System.out.println(i + 1 + ". " + EMPLOYEE_TYPES.get(i));
        }
    }

    private static EmployeeType chooseEmployeeType() {
        System.out.println("Podaj numer pracownika, który chcesz utworzyć:");
        int choose = scanner.nextInt();
        return EMPLOYEE_TYPES.get(choose - 1);
    }

    private static Employee createEmployee(EmployeeType empType) {
        switch (empType) {
            case PRACOWNIK: {
                System.out.println("Dodajesz pracownika");
                EmployeeBasicData employeeBasicData = prepareEmployeeBasicData();
                return new Employee(
                        PRACOWNIK,
                        employeeBasicData.getName(),
                        employeeBasicData.getSurname(),
                        employeeBasicData.getSalary());
            }
            case BRYGADZISTA: {
                System.out.println("Dodajesz brygadzistę");
                EmployeeBasicData employeeBasicData = prepareEmployeeBasicData();
                List<String> tools = createTools();
                return new Foreman(
                        BRYGADZISTA,
                        employeeBasicData.getName(),
                        employeeBasicData.getSurname(),
                        employeeBasicData.getSalary(),
                        tools);
            }
            case KIEROWNIK: {
                System.out.println("Dodajesz kierownika");
                EmployeeBasicData employeeBasicData = prepareEmployeeBasicData();
                double bonus = createBonus();
                return new Supervisor(
                        KIEROWNIK,
                        employeeBasicData.getName(),
                        employeeBasicData.getSurname(),
                        employeeBasicData.getSalary(),
                        bonus);
            }
            case DYREKTOR: {
                System.out.println("Dodajesz dyrektora");
                EmployeeBasicData employeeBasicData = prepareEmployeeBasicData();
                double bonus = createBonus();
                String carId = createCarId();
                return new Director(
                        DYREKTOR,
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

    private static void showNumberOfEmployees(List<Employee> employees) {
        Map<EmployeeType, Integer> employeeTypesMap = countEmployeeTypes(employees);
        for (Map.Entry<EmployeeType, Integer> entry : employeeTypesMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Liczba pracowników to: " + employees.size());

        /*int numberOfEmployees = 0;
        int numberOfForemans = 0;
        int numberOfSupervisors = 0;
        int numberOfDirectors = 0;
        for (int i = 0; i < employees.size(); i++) {
            switch (empType.get(i)) {
                case empType.get(0): {
                    numberOfEmployees++;
                }
                break;
                case empType.get(1): {
                    numberOfForemans++;
                }
                break;
                case empType.get(2): {
                    numberOfSupervisors++;
                }
                break;
                case empType.get(3): {
                    numberOfDirectors++;
                }
                default:
                    System.out.println("Brak pracowników");
            }
        }
        int sumOfEmployees = numberOfEmployees + numberOfForemans + numberOfSupervisors + numberOfDirectors;
        System.out.println("Liczba pracowników");
        System.out.println("Łącznie: " + sumOfEmployees + ", a w tym:");
        System.out.println(PRACOWNIK.toString() + ": " + numberOfEmployees);
        System.out.println(BRYGADZISTA.toString() + ": " + numberOfForemans);
        System.out.println(KIEROWNIK.toString() + ": " + numberOfSupervisors);
        System.out.println(DYREKTOR.toString() + ": " + numberOfDirectors);*/
    }

    private static Map<EmployeeType, Integer> countEmployeeTypes(List<Employee> employees) {
        Map<EmployeeType, Integer> numberOfEmployees = new TreeMap<>();
        for (EmployeeType empType : EMPLOYEE_TYPES) {
            int counter = 0;
            for (Employee employee : employees) {
                if (employee.getEmployeeType() == empType) {
                    counter++;
                }
            }
            numberOfEmployees.put(empType, counter);
        }
        return numberOfEmployees;
    }
}