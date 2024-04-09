import java.util.Scanner;

class InsufficientFundException extends Exception {
    InsufficientFundException(String s) {
        super(s);
    }
}

class Account {
    double balance;

    Account() {
        balance = 1000;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit : " + amount);
        System.out.println("Current balance : " + balance);
    }

    void withdraw(double amount) throws InsufficientFundException {
        if (amount > balance) {
            throw new InsufficientFundException("Sorry, you cannot withdraw more than the current balance");
        }
        balance -= amount;
        System.out.println("Withdraw : " + amount);
        System.out.println("Current balance : " + balance);
    }

    double currentBalance() {
        return balance;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter initial balance");
        // double initialBalance = sc.nextDouble();
        Account account = new Account();

        try {
            System.out.println("Enter withdrawal amount");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);
        } catch (InsufficientFundException e) {
            // System.out.println(e);
            System.out.println("Error : " + e.getMessage());
            System.out.println("Current balance : " + account.currentBalance());
        }

        System.out.println("Deposit some amount");
        double depositBalance = sc.nextDouble();
        account.deposit(depositBalance);

        try {
            System.out.print("Enter withdrawal amount: ");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);
        } catch (InsufficientFundException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Current balance : " + account.currentBalance());
        }
        sc.close();
    }
}
