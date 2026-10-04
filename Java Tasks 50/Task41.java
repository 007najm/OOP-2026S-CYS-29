class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough money in account");
        }
        balance = balance - amount;
    }
}

public class Task41 {
    static int test() {
        try {
            System.out.println("Inside try, returning 1");
            return 1;
        } finally {
            System.out.println("Finally block runs");
        }
    }

    public static void main(String[] args) {
        Account acc = new Account(1000);

        try {
            acc.withdraw(400);
            System.out.println("Withdrew 400, balance: " + acc.balance);
            acc.withdraw(900);
            System.out.println("Withdrew 900, balance: " + acc.balance);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        int result = test();
        System.out.println("test() returned " + result);
    }
}
