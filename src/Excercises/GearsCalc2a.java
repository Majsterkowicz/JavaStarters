package Excercises;

import java.util.Scanner;

public class GearsCalc2a {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj zebatki przód");
        String trybyPrzod = input.next();

        String[] trybyPrzodString = trybyPrzod.split(",");
        int[] frontGears = new int[trybyPrzodString.length];
        for (int i = 0; i<trybyPrzodString.length; i++){
            frontGears[i] = Integer.parseInt(trybyPrzodString[i]);
        }

        //wyswietl.np 34-12-wynik
        //wyswietl.np 34-14-wyni2
        //itp

        //wrzucic na github dla bartusia

    }
}
