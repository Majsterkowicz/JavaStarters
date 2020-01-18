package Objected;

import java.util.Scanner;

public class StringExcercises {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String word = readWord();
        int wordLength = viewWordLength(word);
        String wordUpper = wordToUpper(word);
        int choosenNumber = chooseANumber();
        checkChoosenNumber(choosenNumber, word);

        System.out.println(word + " to " + wordUpper);
        System.out.println("Długość wyrażenia to " + wordLength + " znaków, wliczając spacje.");
    }

    private static String readWord() {
        System.out.println("Podaj wyraz lub wyrażenie");
        return scanner.nextLine();
    }

    private static String wordToUpper(String word) {
        return word.toUpperCase();
    }

    private static int viewWordLength(String word) {
        return word.length();
    }

    private static int chooseANumber() {
        System.out.println("Podaj pozycję znaku wyrażenia");
        return scanner.nextInt();
    }

    private static char findSign(int choosenNumber, String word) {
        return word.charAt(choosenNumber - 1);
    }

    private static void checkChoosenNumber(int choosenNumber, String word) {
        if (choosenNumber <= word.length()) {
            if (choosenNumber <= 0) {
                System.out.println("Wybrano błędną liczbę. Spróbuj ponownie");
                choosenNumber = chooseANumber();
                checkChoosenNumber(choosenNumber, word);
            } else {
                showOneChar(choosenNumber, word);
            }
        } else {
            System.out.println("Wybrano za dużą liczbę. Wyrażenie jest krótsze. Wybierz liczbę ponownie.");
            choosenNumber = chooseANumber();
            checkChoosenNumber(choosenNumber, word);
        }
    }

    private static void showOneChar(int choosenNumber, String word) {
        char oneChar = findSign(choosenNumber, word);
        System.out.println("Znak na pozycji " + choosenNumber + " to: " + "'" + oneChar + "'.");
    }
}
