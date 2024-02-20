import java.util.Scanner;

class PalindromeNum {
    int number;

    PalindromeNum(int num) {
        number = num;
    }

    public boolean isPalindrome() {
        int a = number;
        int sum = 0;
        int temp = number;
        while (a != 0) {
            int r = a % 10;
            sum = sum * 10 + r;
            a = a / 10;
        }
        return temp == sum;
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        PalindromeNum num = new PalindromeNum(number);
        if (num.isPalindrome()) {
            System.out.println("it is palindrome number");
        } else {
            System.out.println("It is not palindrome number");
        }
        sc.close();
    }

}
