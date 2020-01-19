package Objected;

import java.util.Scanner;

public class StringExcercises {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String line = readLine();
        int lineLength = findLength(line);
        String lineUpper = convertToUpper(line);
        int charPosition = findCorrectCharPosition(line);
        char charAtPosition = findCorrectChar(charPosition, line);
        String splitedLine = splitLineByPrzecinek(line);

        System.out.println(line + " to " + lineUpper);
        System.out.println(String.format("Długość wyrażenia to %s znaków, wliczając spacje.", lineLength));
        System.out.println(String.format("Znak na pozycji %s to: '%s'.", charPosition, charAtPosition));
        System.out.println(splitedLine);
    }

    private static String readLine() {
        System.out.println("Podaj wyraz lub wyrażenie");
        return scanner.nextLine();
    }

    private static String convertToUpper(String word) {
        return word.toUpperCase();
    }

    private static int findLength(String word) {
        return word.length();
    }

    private static int chooseCharPositionInLine() {
        System.out.println("Podaj pozycję znaku wyrażenia");
        return scanner.nextInt();
    }

    private static int findCorrectCharPosition(String line) {
        int lineLength = line.length();
        boolean isInvalid;
        int charPosition;
        do {
            charPosition = chooseCharPositionInLine();
            if (charPosition <= 0 || charPosition > lineLength) {
                System.out.println("Wybrana pozycja jest poza zakresem. Wybierz ponownie.");
                isInvalid = true;
            } else {
                isInvalid = false;
            }
        }
        while (isInvalid);
        return charPosition;
    }

    private static char findCorrectChar(int charPosition, String line) {
        return line.charAt(charPosition - 1);
    }

    private static String splitLineByPrzecinek(String line) {
        String[] splittedLine = line.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < splittedLine.length; i++) {
            builder.append(splittedLine[i]);
            if (i == splittedLine.length - 1) {
                break;
            }
            builder.append(", ");
        }
        return builder.toString();
    }
}