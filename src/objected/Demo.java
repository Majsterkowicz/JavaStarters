package objected;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        //TODO review

        Book book1 = new Book("Rowerownia", "Czajkowski");
        showBookData(book1);

        changeBookData(book1);
        showBookData(book1);
    }

    private static void showBookData(Book book) {
        System.out.println(book.getTitle() + "__" + book.getAuthor());
    }

    private static void changeBookData(Book book) {
        Scanner input = new Scanner(System.in);
        System.out.println("Zmień tytuł na:");
        String setTitle = input.next();
        book.setTitle(setTitle);

        System.out.println("Zmień autora na:");
        String setAuthor = input.next();
        book.setAuthor(setAuthor);
    }
}