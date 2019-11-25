package Excercises;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = input.next();

        String result = "";
        String[] letters = word.split("");
        for (int i = letters.length - 1; i >= 0; i--) {
            result = result + letters[i];
        }
        boolean compare = word.equals(result);
        System.out.println(compare);
    }
}