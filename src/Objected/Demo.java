package Objected;

public class Demo {
    public static void main(String[] args) {
        Book book1 = new Book("Rowerownia", "Czajkowski");
        showBookData(book1);

        book1.setTitle("Trol");
        showBookData(book1);
    }
    private static void showBookData(Book book){
        System.out.println(book.getTitle() + "__" + book.getAuthor());
    }
}
