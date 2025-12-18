import java.util.*;

class Book {
    int isbn;
    String title;
    double price;

    Book(int isbn, String title, double price) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }
}

public class BookInventory {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(101, "Java", 450));

        for (Book b : books)
            System.out.println(b.isbn + " " + b.title + " " + b.price);
    }
}
/*
101 Java 450.0
*/
