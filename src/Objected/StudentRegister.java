package Objected;

import java.util.Scanner;

public class StudentRegister {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfStudents = createNumberOfStudents();
        Student[] students = createStudent(numberOfStudents);
        viewAllStudents(students);
    }

    private static int createNumberOfStudents() {
        System.out.println("Ilu studentów chcesz utworzyć?");
        return scanner.nextInt();
    }

    private static Student[] createStudent(int numberOfStudents) {
        Student[] students = new Student[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            int studentNumber = i + 1;
            System.out.println("Wprowadzasz dane studenta nr " + studentNumber);
            students[i] = addStudentData(studentNumber);
        }
        System.out.println("Wprowadzono wszystkich studentów");
        return students;
    }

    private static Student addStudentData(int studentNumber) {
        System.out.println("Podaj imię studenta");
        String newName = scanner.next();

        System.out.println("Podaj nazwisko studenta");
        String newSurname = scanner.next();

        int[] newMarks = createStudentMarks(studentNumber);

        System.out.println("Wprowadzono wszystkie dane studenta nr " + studentNumber);
        return new Student(newName, newSurname, newMarks);
    }

    private static int[] createStudentMarks(int studentNumber) {
        System.out.println("Wprowadź 5 ocen studenta " + studentNumber);
        int[] newMarks = new int[5];
        for (int j = 0; j < newMarks.length; j++) {
            int markNumber = j + 1;
            System.out.println("Wprowadź ocenę nr " + markNumber);
            newMarks[j] = scanner.nextInt();
        }
        return newMarks;
    }

    private static void viewAllStudents(Student[] students) {
        System.out.println("Lista studentów: ");
        for (int i = 0; i < students.length; i++) {
            int studentNumber = i + 1;
            System.out.println("Student " + studentNumber + ":");
            students[i].showStudentData();
        }
    }

}
