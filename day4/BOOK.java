class Book {
    String getBookType() {
        return "General Book";
    }
}

class TextBook extends Book {
    String getBookType() {
        return "Text Book";
    }
}

class Novel extends Book {
    String getBookType() {
        return "Novel";
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new TextBook();
        Book b2 = new Novel();

        System.out.println(b1.getBookType());
        System.out.println(b2.getBookType());
    }
}
