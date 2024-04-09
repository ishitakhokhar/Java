
//    /*  4. Design a class named MyPoint to represent a point with x- and y-coordinates. The class
// contains:
// The data fields x and y that represent the coordinates with getter methods.
// 1. A no-arg constructor that creates a point (0, 0).
// 2. A constructor that constructs a point with specified coordinates.
// 3. A method named distance that returns the distance from this point to a specified point of
// the MyPoint type.
// 4. A method named distance that returns the distance from this point to another point with
// specified x- and y-coordinates.
// Create a class named ThreeDPoint to model a point in a three-dimensional space. Let
// ThreeDPoint be derived from MyPoint with following additional features:
// 1. A data fields named z that represents the z-coordinate.
// 2. A no-arg constructor that creates a point (0, 0, 0).
// 3. A constructor that constructs a point with three specified coordinates.
// 4. A get method that returns the z value.
// 5. Override the distance method to return the distance between two points in the threedimensional space.
// Write a program that creates two points (0, 0, 0) and (10, 30, 25.5) and display the distance
// between the two points.*/
import java.lang.Math;

class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint point) {
        double dx = point.getX() - x;
        double dy = point.getY() - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(double x, double y) {
        double dx = x - this.x;
        double dy = y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

class ThreeDPoint extends MyPoint {
    private double z;

    public ThreeDPoint() {
        this(0, 0, 0);
    }

    public ThreeDPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public double distance(MyPoint point) {
        if (point instanceof ThreeDPoint) {
            ThreeDPoint threeDPoint = (ThreeDPoint) point;
            double dx = threeDPoint.getX() - getX();
            double dy = threeDPoint.getY() - getY();
            double dz = threeDPoint.getZ() - getZ();
            return Math.sqrt(dx * dx + dy * dy + dz * dz);
        } else {
            return super.distance(point);
        }
    }
}

public class Coordinates {
    public static void main(String[] args) {
        ThreeDPoint point1 = new ThreeDPoint();
        ThreeDPoint point2 = new ThreeDPoint(10, 30, 25.5);

        double distance = point1.distance(point2);
        System.out.println("Distance between the two points: " + distance);
    }
}
