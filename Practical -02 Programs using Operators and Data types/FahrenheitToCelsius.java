
//Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = f-32*5/9 )
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature fahrenheit: ");
        float fahrenheit = sc.nextFloat();
        float celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("celsius is :" + celsius);
        sc.close();
    }
}
