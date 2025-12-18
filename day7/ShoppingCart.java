import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();
        cart.add(new Product(1, "Laptop", 50000));
        cart.add(new Product(2, "Mouse", 500));

        double total = 0;
        for (Product p : cart)
            total += p.price;

        System.out.println("Total Bill: " + total);
    }
}
/*
Total Bill: 50500.0
*/
