
// Write a Java program that cdivides two numbers. If Num1 or Num2
// were not an integer, the program would throw a Number Format Exception. If Num2
// were Zero, the program would throw an Arithmetic Exception. Display appropriate message
// for each exception.
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter first number");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.println("Enter second number");
            int num2 = Integer.parseInt(sc.nextLine());
            if (num2 == 0) {
                throw new ArithmeticException("Divison by zero is not");
            }
            int result = num1 / num2;
            System.out.println("result : " + result);
        } catch (NumberFormatException e) {
            System.out.println("please enter integer value");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException : " + e.getMessage());
        }
    }

}
