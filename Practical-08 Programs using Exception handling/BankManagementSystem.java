import java.util.Scanner;

class InsufficientFundException extends Exception {
    InsufficientFundException(String s) {
        super(s);
    }
}

class BankAccount {
    private double balance;

    BankAccount() {
        balance = 1000; 
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: " + amount + " rupees");
        System.out.println("Current balance: " + balance + " rupees");
    }

    void withdraw(double amount) throws InsufficientFundException {
        if (amount > balance) {
            throw new InsufficientFundException("Sorry, you cannot withdraw more than the current balance");
        }
        balance -= amount;
        System.out.println("Withdrawal: " + amount + " rupees");
        System.out.println("Current balance: " + balance + " rupees");
    }

    double getBalance() {
        return balance;
    }

    void transfer(BankAccount receiver, double amount) throws InsufficientFundException {
        withdraw(amount);
        receiver.deposit(amount);
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[10]; 
        
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankAccount();
        }

        int choice;
        do {
            System.out.println("\nBank Management System");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Account Status");
            System.out.println("4. Transfer Money");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deposit(scanner, accounts);
                    break;
                case 2:
                    withdraw(scanner, accounts);
                    break;
                case 3:
                    checkAccountStatus(scanner, accounts);
                    break;
                case 4:
                    transferMoney(scanner, accounts);
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);
    }

    static void deposit(Scanner scanner, BankAccount[] accounts) {
        System.out.print("Enter account number (1-10): ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        accounts[accountNumber - 1].deposit(amount);
    }

    static void withdraw(Scanner scanner, BankAccount[] accounts) {
        System.out.print("Enter account number (1-10): ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        try {
            accounts[accountNumber - 1].withdraw(amount);
        } catch (InsufficientFundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void checkAccountStatus(Scanner scanner, BankAccount[] accounts) {
        System.out.print("Enter account number (1-10): ");
        int accountNumber = scanner.nextInt();
        double balance = accounts[accountNumber - 1].getBalance();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance + " rupees");
    }

    static void transferMoney(Scanner scanner, BankAccount[] accounts) {
        System.out.print("Enter sender account number (1-10): ");
        int senderAccountNumber = scanner.nextInt();
        System.out.print("Enter receiver account number (1-10): ");
        int receiverAccountNumber = scanner.nextInt();
        System.out.print("Enter transfer amount: ");
        double amount = scanner.nextDouble();

        try {
            accounts[senderAccountNumber - 1].transfer(accounts[receiverAccountNumber - 1], amount);
        } catch (InsufficientFundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
