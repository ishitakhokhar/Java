import java.util.Scanner;

class AOC {
    double raddi, area;

    AOC(double r) {
        raddi = r;
        area = r * r * 3.14;
        System.out.println(area);
    }

    void mymethod() {
        System.out.println("this method has no sence");
    }
}

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valu of raddi");
        double raddi = sc.nextDouble();
        AOC aoc = new AOC(raddi);
        aoc.mymethod();
        sc.close();
    }

}
