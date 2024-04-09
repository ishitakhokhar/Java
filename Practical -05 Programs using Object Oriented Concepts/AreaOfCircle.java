//Write a program to create circle class with area function to find area of circle.

import java.util.Scanner;

class Circle {
    double areaOfCircle(int r) {
        return Math.PI * r * r;
    }
}

public class AreaOfCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Raduis : ");
        int raddi = scanner.nextInt();
        double area = circle.areaOfCircle(raddi);
        System.out.println(area);
        scanner.close();
    }

}
