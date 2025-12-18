class Book {
    int id;
    String title;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
    }
}

class BookNotFoundException extends Exception {
    BookNotFoundException(String msg) { super(msg); }
}

public class LibrarySearch {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Java"),
            new Book(2, "Python")
        };

        String search = "C++";
        boolean found = false;

        try {
            for (Book b : books) {
                if (b.title.equals(search)) {
                    System.out.println(b.id + " " + b.title);
                    found = true;
                }
            }
            if (!found)
                throw new BookNotFoundException("Book not found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
