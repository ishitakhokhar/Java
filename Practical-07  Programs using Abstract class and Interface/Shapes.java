//  Write a Java program to create an interface Shape with the getArea() method. Create three
// classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the
// getArea() method for each of the three classes
interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private double width;
    private double height;

    Rectangle(double width, double height) {

        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return height * width;
    }
}

class Circle implements Shape {
    private double radius;

    Circle(double radius) {

        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {

        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 4);
        Circle c = new Circle(2);
        Triangle t = new Triangle(2, 4);
        System.out.println(r.getArea());
        System.out.println(c.getArea());
        System.out.println(t.getArea());
    }
}
