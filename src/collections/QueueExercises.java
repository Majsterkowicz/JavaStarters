package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExercises {

    public static void main(String[] args) {

        Queue<Product> productQueue = new LinkedList<>();

        //TODO dodawanie produktów bezpośrednio do kolejki
        //TODO zapytanie o dodawawanie produktu lub druk paragonu
        //TODO komunikat o wydrukowanym całym paragonie

        System.out.println(productQueue);

        productQueue.poll();

        if (productQueue.poll() == null)

        System.out.println(productQueue);

    }
}
