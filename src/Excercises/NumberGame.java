package Excercises;

import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean czyParzysta;
        int choice = 0;
        do {
            try {
                System.out.println("Podaj liczbę");
                choice = input.nextInt();
            } catch (Exception e) {
                System.out.println("wprowadziles z dupy typ");
                return;
            }
            czyParzysta = choice % 2 ==0;
            if(czyParzysta) {
                System.out.println("Good job");
            }

        }
        while (czyParzysta);

        System.out.println("Wrong number");
    }
}
