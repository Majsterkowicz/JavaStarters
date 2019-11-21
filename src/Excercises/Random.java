package Excercises;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        int choice;
        int counter = 0;
        Scanner input = new Scanner(System.in);

        int a = 1 + (int) (Math.random() * 99);

        System.out.println("Numer is choosen, try to guess");
        System.out.println("Type a number");

        do {
            choice = input.nextInt();
            if (choice > a) {
                System.out.println("Try lower number");
            }
            if (choice < a) {
                System.out.println("Try higher number");
            }
            counter = counter + 1;
        }
        while (choice < a || choice > a);
        System.out.println("You guess the number: " + a + " in " + counter + "tries!");
    }
}