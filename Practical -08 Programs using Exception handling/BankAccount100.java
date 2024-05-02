import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientFundException extends Exception {
    InsufficientFundException(String s) {
        super(s);
    }
}

class MyClass {

    double balance;

    MyClass(double initialBalance) {
        balance = initialBalance;
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

    int askForType() {
        System.out.println(
                "Press 1 for Withdrawing From Your Acconut\nPress 2 for Depositing in Your Account\nPress 3 for Depositing to other accouunt");
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        return type;

    }

    double currentBalance() {
        // if (amount<balance) {
        // System.out.println("you can not withdrow money");
        // }
        return balance;
    }
}

public class BankAccount100 {
    public static void main(String[] args) {
        System.out.println("Enter Number of User : ");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int[] users = new int[user];
        for (int i = 0; i < users.length; i++) {
            users[i] = i + 1;
        }
        System.out.println(Arrays.toString(users));
        MyClass myClass = new MyClass(1000);
        System.out.println("Enter Account Number");
        int first = 0;
        try {
            first = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            scanner.nextInt();
        }
        int type = myClass.askForType();
        for (int i = 0; i < users.length; i++) {
            if (first == users[i]) {
                if (type == 1) {
                    System.out.println(users[i]);
                    System.out.println("Current balance : " + myClass.currentBalance());
                    // System.out.println("your current blance is 1000rs.");
                    try {
                        System.out.println("Enter withdrawal amount : ");
                        // System.out.println("hello");
                        double withdrawAmount = scanner.nextDouble();
                        myClass.withdraw(withdrawAmount);
                    } catch (InsufficientFundException e) {
                        // System.out.println(e);
                        System.out.println("Error : " + e.getMessage());
                    }
                    // System.out.println("not found");
                }

            } else if (type == 2) {
                System.out.println("Deposit some amount");
                double depositBalance = scanner.nextDouble();
                myClass.deposit(depositBalance);

            } else if (type == 3) {

            } else {

            }

        }
        System.out.println("user not found");
    }
}
