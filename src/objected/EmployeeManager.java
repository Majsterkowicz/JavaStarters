package objected;

import java.util.Scanner;

public class EmployeeManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj numer pracownika, który chcesz utworzyć:");
        System.out.println("1. Pracownik");
        System.out.println("2. Brygadzista");
        System.out.println("3. Kierownik");
        System.out.println("4. Dyrektor");
        System.out.println("5. Szef");
        int empType = scanner.nextInt();

        //TODO przerobić na instrukcję switch
        Employee employee = null;
        switch (empType) {
            case 1:
                employee = Employee.createEmployee();
                break;
            case 2:
                employee = Foreman.createForeman();
                break;
            default:
                System.out.println("Niepoprawne dane");
                break;
        }
        System.out.println(employee);
    }
}