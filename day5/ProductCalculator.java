class InvalidPriceException extends Exception {
    InvalidPriceException(String msg) { super(msg); }
}

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ProductCalculator {
    public static void main(String[] args) {
        Product[] products = {
            new Product("Pen", 10),
            new Product("Book", 50)
        };

        double total = 0;

        try {
            for (Product p : products) {
                if (p.price < 0)
                    throw new InvalidPriceException("Invalid price");
                total += p.price;
            }
            System.out.println("Total price: " + total);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
