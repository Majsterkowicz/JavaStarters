package excercises;

import java.util.Scanner;

public class WeekDays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj numer dnia tygodnia, od 1 do 7");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                showDay("poniedziałek");
                break;
            case 2:
                showDay("wtorek");
                break;
            case 3:
                showDay("środę");
                break;
            case 4:
                showDay("czwartek");
                break;
            case 5:
                showDay("piątek");
                break;
            case 6:
                showDay("sobota");
                break;
            case 7:
                showDay("niedzielę");
                break;
            default:
                System.out.println("Nieprawidłowe dane, ogarnij się");

        }

    }
        private static void showDay (String day){
        System.out.println("Wybrano " + day);
    }
}
