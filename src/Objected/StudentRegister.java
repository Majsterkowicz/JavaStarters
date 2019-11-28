package Objected;

import java.util.Scanner;

public class StudentRegister {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię studenta");
        String name = scanner.next();

        Student karol = new Student(name, "Kasztaniak", new int[]{1, 3, 5, 3, 6});

        karol.showStudentData();
    }
}