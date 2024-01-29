import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        if (isEven(number))
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
        sc.close();
    }

    public static boolean isEven(int number)

    {
        if (number % 2 == 0)
            return true;
        return false;
    }
}
