package Objected;

import java.util.Scanner;

public class StudentRegister { //TODO review na razie wprowadz ponizsze uwagi i przeslij ponownie, wtedy zrobie dokladne review

    public static void main(String[] args) {
        //TODO review bardziej poszatkuj na metody prywatne, po kolei idac initStudentsArray, writeStudentsData, showStudentsData
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ilu studentów chcesz utworzyć?"); //TODO review mozesz poczytac o loggerze i zastosowac go zamiast sout
        int numberOfStudents = scanner.nextInt();

        Student[] students = new Student[numberOfStudents];
        int i = 0; //TODO review postaraj sie zrobic refactor aby uzyc jednego licznika, mysle ze mozna to ładnie uproscic (tip: spróbuj petle for)
        int counter = i + 1;

        do { //TODO review sprobuj wszystkie do-while przerobic na pętle for
            System.out.println("Wprowadzasz dane studenta nr " + " " + counter);
            students[i] = studentAdder(counter);
            System.out.println("Wprowadzono studenta nr " + counter + ":");
            students[i].showStudentData(); //TODO review chyba zbedne, dane studentow prezentujesz na koncu dzialania programu
            i++;
            counter++;
        }
        while (i < numberOfStudents);

        System.out.println("Wprowadzono wszystkich studentów");

        //LISTA STUDENTÓW //TODO review komentarz zbedny - kod powinien tlumaczcy co sie tutaj dzieje
        i = 0;
        counter = i + 1;
        System.out.println("Lista studentów:");
        do { //TODO review ten kod rozumiem bedzie relizowany w  viewAllStudents ? sprobuj petle foreach na tablicy studentow
            System.out.println("Student nr " + counter + ":");
            students[i].showStudentData();
            i++;
            counter++;
        }
        while (i < numberOfStudents);
//        viewAllStudents(numberOfStudents); //TODO review aby wystwietlic studentow musisz przekazac ich dane (czyli tablice) w parametrze metody zamiast ich liczby
    }

    private static Student studentAdder(int counter) { //TODO review 1. addStudent - nazwy metod zaczyanja sie od czasownika
        // TODO review 2. przekazanie countera w argumencie jest mylace i chyba zbędne (uzywasz go tylko w g:52 w komunikacie logowania)
        Scanner input = new Scanner(System.in); //TODO review Znowu tworzysz obiekt klasy Scanner - albo utworzyc raz statyczny albo przekaz instancje utworzona w g:9 w parametrze metody
        System.out.println("Podaj imię studenta");
        String newName = input.next();

        System.out.println("Podaj nazwisko studenta");
        String newSurname = input.next();

        System.out.println("Wprowadź 5 ocen studenta " + counter); // TODO wprowadzanie ocen mozna wydzielic do metody prywatnej
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
