class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) { super(msg); }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) { super(msg); }
}

class BankAccount {
    double balance = 5000;

    void withdraw(double amount) throws Exception {
        if (amount < 0)
            throw new InvalidAmountException("Invalid amount");
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient balance");

        balance -= amount;
        System.out.println("Remaining balance: " + balance);
    }
}

public class BankATM {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        try {
            acc.withdraw(6000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
