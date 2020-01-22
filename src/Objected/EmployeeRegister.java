package Objected;

import java.util.Scanner;
//TODO dlaczego dwie klasy w jednym pliku, możesz to rozbic na 2 pliki, kazdy ze swoją klasą
public class EmployeeRegister {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfEployees = setNumberOfEmployees(); //TODO literówka w deklaracji zmiennej
        Employee[] staff = new Employee[numberOfEployees];
        setEmployeeData(staff);
        //TODO dodaj na koncu metodę która wyswietli dane pracowników
    }

    private static int setNumberOfEmployees() {
        System.out.println("Podaj ilość pracowników");
        return scanner.nextInt();
    }

    //TODO metoda ta powinna utworzyć dane pracowników (wywołac tyle razy konstruktor kalsy Employee ile wynosi zmienna numberOfEployees)
    //TODO potem te dane zapisujesz do tablicy staff
    private static void setEmployeeData(Employee[] employees) {
        //tODO to id jest zupełnie zbędne, konstruktor kalsy Employee powinien dbac o nadanie odpowiedniego id (albo setter)
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
        id = 0; //TODO pracownikowi nie ustawiasz id = 0 tylko to którego stan przetrzymujesz w nextId, mozesz spróbować w tym miejscu wywołać metodę setId, wygląda dobrze (ustawia id a potem je ikrementuje)
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
