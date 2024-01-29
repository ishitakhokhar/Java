import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int returnValue = Large(a, b, c);
        System.out.println("Largest number is:" + returnValue);
        sc.close();
    }

    public static int Large(int a, int b, int c) {
        return (a > b ? (a > c ? a : c) : (b > c ? b : c));
    }
}
