package Objected;

import java.util.Scanner;

public class StudentRegister {

    public static Scanner scanner = new Scanner(System.in); //TODO wydzieliłeś scanner do

    public static void main(String[] args) {
        int numberOfStudents = createNumberOfStudents(); //TODO review - nazwe metody zmien na readNumberOfStudents
        Student[] students = createStudent(numberOfStudents); // TODO review - nazwe metody zmien na readStudentsData
        viewAllStudents(students); //TODO review - nazwa metody viewStudentsData(students)
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
            students[i] = addStudentData(studentNumber); //TODO review - nazwa metody readStudentData
        }
        System.out.println("Wprowadzono wszystkich studentów");
        return students;
    }

    private static Student addStudentData(int studentNumber) {
        System.out.println("Podaj imię studenta"); //TODO te dwie linii do metody prywatnej String readStudentName();
        String newName = scanner.next(); //TODO nazwa zmiennej studentName albo samo name

        System.out.println("Podaj nazwisko studenta"); //TODO te dwie linii do metody prywantej String readStudentSurname();
        String newSurname = scanner.next(); //TODO nazwa zmiennej studentSurname albo samo surname

        //TODO w liniach g:32 oraz g:35 w komunikacie mozesz wykorzystac przekazany w parametrze studentNumber
        int[] newMarks = createStudentMarks(studentNumber); //TODO int[] studentMarks (albo samo marks) = readStudentMarks(studentNumber);

        System.out.println("Wprowadzono wszystkie dane studenta nr " + studentNumber);
        return new Student(newName, newSurname, newMarks);
    }

    private static int[] createStudentMarks(int studentNumber) {
        System.out.println("Wprowadź 5 ocen studenta " + studentNumber);
        int[] newMarks = new int[5]; //TODO int[] marks (ewetnualnie studentMarks)
        for (int j = 0; j < newMarks.length; j++) { //TODO mozesz zastosowac i zamiast j w liczniku
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
    //TODO pusta linia do usuniecia
}
