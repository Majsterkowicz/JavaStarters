package Excercises;

public class Tablica1 {

    public static void main(String[] args) {
        String[] imiona = new String[]{"Adam", "Bartek", "Stefan", "Jan"};
        for (int i = 0; i < imiona.length; i++) {
            System.out.println(i + 1 + ". " + imiona[i]);
        }

        for (String imie : imiona) {
            if (imie.startsWith("a".toUpperCase())){

                System.out.println(imie);
            }

        }


    }
}