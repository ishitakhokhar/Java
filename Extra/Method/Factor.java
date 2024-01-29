import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        factor(n);
        sc.close();
    }

    public static void factor(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                System.out.println("Number of this factors is" + i);
        }

    }
}
