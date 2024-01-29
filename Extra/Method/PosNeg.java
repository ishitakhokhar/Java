import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        if (Pos(number))
            System.out.println("Number is positive");
        else
            System.out.println("Number is negative");
        sc.close();
    }

    public static boolean Pos(int number) {
        if (number > 0)
            return true;
        return false;
    }
}
