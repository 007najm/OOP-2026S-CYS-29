class BankAccount {
    private double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Invalid deposit");
        }
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance, withdraw rejected");
        } else if (amount <= 0) {
            System.out.println("Invalid withdraw");
        } else {
            balance = balance - amount;
        }
    }

    double getBalance() {
        return balance;
    }
}

public class Task13 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.deposit(500);
        System.out.println("Balance: " + acc.getBalance());

        acc.withdraw(200);
        System.out.println("Balance: " + acc.getBalance());

        acc.withdraw(1000);
        System.out.println("Balance: " + acc.getBalance());

        acc.deposit(300);
        System.out.println("Balance: " + acc.getBalance());

        acc.withdraw(100);
        System.out.println("Balance: " + acc.getBalance());
    }
}
