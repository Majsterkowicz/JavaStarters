package Objected;

import java.util.Scanner;

public class StudentRegister {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ilu studentów chcesz utworzyć?");
        int studentNumber = scanner.nextInt();

        Student[] students = new Student[studentNumber];
        int i = 0;
        int counter = i + 1;

        do {
            System.out.println("Wprowadzasz dane studenta nr " + counter);
            System.out.println("Podaj imię studenta");
            String name = scanner.next();
            System.out.println("Podaj nazwisko studenta");
            String surname = scanner.next();
            students[i].setName("name");
            students[i].setSurname("surname");
            students[i].setMarks(new int[]{5, 4, 4, 3, 2});
            //Student student = new Student(name, surname, new int[]{5, 3, 5, 3, 6});

            i = i + 1;
            counter = counter + 1;
        }
        while (i < studentNumber);


        // Student[] students = new Student[5];
        //Student student = new Student(name, "Kasztaniak", new int[]{5, 3, 5, 3, 6});

//        students[0]= new Student(name, "surname", new int[]{1,2,3,4,5});

        //students[0].calculateAverage();
        System.out.println("Podaj dane studenta nr ");
        int j = scanner.nextInt();
        students[j].showStudentData();
        System.out.println("asdasdas");

    }
}