package Excercises;

import java.util.Scanner;

public class GearsCalc
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Witaj w kalkulatorze rowerowym 1.0");

        System.out.println("Wprowadź liczbę przełożeń z przodu");
        int frontGears;
        frontGears = input.nextInt();
        System.out.println("Wybrano " + frontGears + " przełożenia z przodu");

        System.out.println("Wprowadź liczbę przełożeń z tyłu");
        int rearGears;
        rearGears = input.nextInt();
        System.out.println("Wybrano " + rearGears + " przełożeń z tyłu");

        int numGears;
        numGears = frontGears * rearGears;
        System.out.println("Posiadasz " + numGears + " biegów");




    }
}
