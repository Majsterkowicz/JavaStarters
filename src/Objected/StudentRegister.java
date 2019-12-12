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
            System.out.println("Wprowadzasz dane studenta nr " + counter);

            System.out.println("Podaj imię studenta");
            String name = scanner.next();
            System.out.println("Podaj nazwisko studenta");
            String surname = scanner.next();
//            students[i].setName(name);
//            students[i].setSurname(surname);
//            students[i].setMarks(new int[]{5, 4, 4, 3, 2});

            int[] marks = new int[5];
            System.out.println("Wprowadź 5 ocen");
            for (int j = 0; j < marks.length; j++) {
                int markNumber = j + 1;
                System.out.println("Wprowadź ocenę nr " + markNumber);
                marks[j] = scanner.nextInt();
            }
            students[i] = new Student(name, surname, marks);

            i = i + 1;
            counter = counter + 1;
        }
        while (i < numberOfStudents);


        System.out.println("Podaj dane studenta nr ");
        int k = scanner.nextInt();
        students[k - 1].showStudentData();
    }
    private void studentAdder(){
        System.out.println("correct");
        }
    }