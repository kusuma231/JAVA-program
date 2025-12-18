class InvalidQuantityException extends Exception {
    InvalidQuantityException(String msg) { super(msg); }
}

class LimitExceededException extends Exception {
    LimitExceededException(String msg) { super(msg); }
}

class Item {
    String name;
    int qty;
    double price;

    Item(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Item[] items = {
            new Item("Laptop", 1, 60000)
        };

        double total = 0;

        try {
            for (Item i : items) {
                if (i.qty <= 0)
                    throw new InvalidQuantityException("Invalid quantity");
                total += i.qty * i.price;
            }

            if (total > 50000)
                throw new LimitExceededException("Limit exceeded");

            System.out.println("Total Bill: " + total);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
