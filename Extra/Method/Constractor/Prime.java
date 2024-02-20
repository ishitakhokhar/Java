import java.util.Scanner;

class Number {
    int Number;

    Number(int n) {
        Number = n;
    }

    public boolean isNumber() {
        for (int i = 2; i <= Number / 2; i++) {
            if (Number % i == 0)
                return false;
        }
        return true;
    }
}

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        Number numb = new Number(num);
        {
            if (numb.isNumber()) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not prime");
            }
        }
        sc.close();
    }
}