package Objected;

import java.util.Scanner;

public class StudentRegister {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ilu studentów chcesz utworzyć?");
        int numberOfStudents = scanner.nextInt();

        Student[] students = new Student[numberOfStudents];
        int i = 0;
        int counter = i + 1;

        do {
            System.out.println("Wprowadzasz dane studenta nr " + " " + counter);
            students[i] = studentAdder(counter);
            System.out.println("Wprowadzono studenta nr " + counter + ":");
            students[i].showStudentData();
            i++;
            counter++;
        }
        while (i < numberOfStudents);

        System.out.println("Wprowadzono wszystkich studentów");

        //LISTA STUDENTÓW
        i = 0;
        counter = i + 1;
        System.out.println("Lista studentów:");
        do {
            System.out.println("Student nr " + counter + ":");
            students[i].showStudentData();
            i++;
            counter++;
        }
        while (i < numberOfStudents);
        //viewAllStudents(numberOfStudents);
    }

    private static Student studentAdder(int counter) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imię studenta");
        String newName = input.next();

        System.out.println("Podaj nazwisko studenta");
        String newSurname = input.next();

        System.out.println("Wprowadź 5 ocen studenta " + counter);
        int[] newMarks = new int[5];
        for (int j = 0; j < newMarks.length; j++) {
            int markNumber = j + 1;
            System.out.println("Wprowadź ocenę nr " + markNumber);
            newMarks[j] = input.nextInt();
        }
        System.out.println("Wprowadzono wszystkie dane");
        return new Student(newName, newSurname, newMarks);
    }

    /*private static void viewAllStudents(int numberOfStudents) {
        System.out.println("Lista studentów: ");
        int k = 0;
        int counter = k + 1;
        do {
            System.out.println("Student " + counter + ":");

            k++;
            counter++;
        }
        while (k < numberOfStudents);
    }*/
}
