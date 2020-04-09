package collections;

import java.util.*;

public class QueueExercises {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Witaj w programie Paragon+");
        Queue<Product> productsQueue = scanProducts();
        printProductsBill(productsQueue);
    }

    private static Queue<Product> scanProducts() {
        System.out.println("Rozpoczynasz od dodania pierwszego produktu.");
        Queue<Product> productsQueue = new LinkedList<>();
        do {
            Product product = createNewProduct();
            productsQueue.add(product);
        } while (isContinueAddingProduct());
        return productsQueue;
    }

    private static Product createNewProduct() {
        System.out.println("Dodajesz produkt");
        scanner.nextLine();
        System.out.println("Proszę podać nazwę produktu.");
        String productName = scanner.nextLine();
        System.out.println("Proszę podać cenę jednostkową.");
        double productPrice = scanner.nextDouble();
        System.out.println("Proszę podać ilość produktu.");
        double productQuantity = scanner.nextDouble();
        return new Product(productName, productPrice, productQuantity);
    }

    private static boolean isContinueAddingProduct() {
        System.out.println("Czy dodajesz kolejny produkt? T/N");
        String choice = scanner.next();
        return "t".equalsIgnoreCase(choice);
    }

    private static void printProductsBill(Queue<Product> productsQueue) {
        double summaryPrice = 0;
        System.out.println("Twoje zakupy:");
        do {
            Product productInBuffer = productsQueue.poll();
            if (productInBuffer == null) {
                break;
            }
            double productFinalPrice = computeFinalPrice(productInBuffer);
            System.out.println(productInBuffer.getName() + " ilość: " +
                    productInBuffer.getQuantity() +
                    " wartość: " + productFinalPrice);
            summaryPrice += productFinalPrice;
        } while (!productsQueue.isEmpty());
        System.out.println("Lącznie do zaplaty: " + summaryPrice);
        System.out.println("Koniec paragonu");
    }

    private static double computeFinalPrice(Product product) {
        return product.getPrice() * product.getQuantity();
    }
}
