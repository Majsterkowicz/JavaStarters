package collections;

import java.util.Scanner;

public class Tested {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            String string;
            System.out.println("Podaj wyrażenie: ");
            string = scanner.nextLine();
            System.out.println("Podano: " + string);
        } while (true);
    }
}
