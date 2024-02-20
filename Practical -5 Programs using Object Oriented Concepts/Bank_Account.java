import java.util.Scanner;

public class Bank_Account {
    int accountNo;
    String userName;
    String email;
    String accountType;
    double accountBalance;

    Bank_Account(int accountNo, String userName, String email, String accountType, double accountBalance)

    {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public String getAccountDetails() {
        return "Account No: " + accountNo +
                "\nUser Name: " + userName +
                "\nEmail: " + email +
                "\nAccount Type: " + accountType +
                "\nAccount Balance: " + accountBalance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your details");
        System.out.println("Enter your account number");
        int accountNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter user name");
        String userName = sc.nextLine();

        System.out.println("Enter your email");
        String email = sc.nextLine();

        System.out.println("Enter your accountType");
        String accountType = sc.nextLine();

        System.out.println("Enter your accountBalance");
        double accountBalance = sc.nextDouble();
        sc.nextLine();

        Bank_Account account = new Bank_Account(accountNo, userName, email, accountType, accountBalance);

        System.out.println(account.getAccountDetails());
        sc.close();

    }
}
