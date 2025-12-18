class Account {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
}

public class BankTest {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();

        sa.deposit(5000);
        sa.withdraw(2000);
        sa.displayBalance();
    }
}
