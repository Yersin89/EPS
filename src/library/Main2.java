package library;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        Book book1 = new Book("Hope", 50, "Adil", "Fantazy" );
        Book book2 = new Book("Good", 200, "Adil", "Blockbaster" );
        Book book3 = new Book("Bad", 150, "Adil", "Horror" );
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        System.out.println("Популярный книга: " + book1.getTitle());
        book1.printBook();
        Author Adil = new Author("Adil", 23, books);
        System.out.println(Adil.getBookNames());
        Adil.printBook();
    }


}
