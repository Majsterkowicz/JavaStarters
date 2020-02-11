package objected;

import java.util.Scanner;

public class StudentRegister {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfStudents = readNumberOfStudents();
        int numberOfMarks = readNumberOfMarks();
        Student[] students = createArrayOfStudents(numberOfStudents, numberOfMarks);
        viewStudentsData(students);
    }

    private static int readNumberOfStudents() {
        System.out.println("Ilu studentów chcesz utworzyć?");
        return scanner.nextInt();
    }

    private static int readNumberOfMarks() {
        System.out.println("Podaj liczbę ocen");
        return scanner.nextInt();
    }

    private static Student[] createArrayOfStudents(int numberOfStudents, int numberOfMarks) {
        Student[] students = new Student[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            int studentNumber = i + 1;
            System.out.println("Wprowadzasz dane studenta nr " + studentNumber);
            students[i] = readStudentData(studentNumber, numberOfMarks);
        }
        System.out.println("Wprowadzono wszystkich studentów");
        return students;
    }

    private static Student readStudentData(int studentNumber, int numberOfMarks) {
        String studentName = readStudentName();
        String studentSurneme = readStudentSurname();
        int[] newMarks = readStudentsMarks(studentNumber, numberOfMarks);
        System.out.println("Wprowadzono wszystkie dane studenta nr " + studentNumber);
        return new Student(studentName, studentSurneme, newMarks);
    }

    private static String readStudentName() {
        System.out.println("Podaj imię studenta");
        return scanner.next();
    }

    private static String readStudentSurname() {
        System.out.println("Podaj nazwisko studenta");
        return scanner.next();
    }

    private static int[] readStudentsMarks(int studentNumber, int numberOfMarks) {
        System.out.println("Wprowadź " + numberOfMarks + " ocen studenta " + studentNumber);
        int[] marks = new int[numberOfMarks];
        for (int i = 0; i < marks.length; i++) {
            int markNumber = i + 1;
            System.out.println("Wprowadź ocenę nr " + markNumber);
            marks[i] = scanner.nextInt();
        }
        return marks;
    }

    private static void viewStudentsData(Student[] students) {
        System.out.println("Lista studentów: ");
        for (int i = 0; i < students.length; i++) {
            int studentNumber = i + 1;
            System.out.println("Student " + studentNumber + ":");
            students[i].showStudentData();
        }
    }
}