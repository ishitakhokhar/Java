// Write a program that illustrates interface inheritance. Interface A is extended by A1 and A2.
// Interface A12 inherits from both A1 and A2.Each interface declares one constant and one
// method. Class B implements A12.Instantiate B and invoke each of its methods. Each method
// displays one of the constants
interface A {
    int i = 10;

    void displayA();
}

interface A1 extends A {
    int j = 12;

    void displayA1();
}

/**
 * A2 exte
 */
interface A2 extends A {
    int k = 20;

    void displayA2();
}

interface A12 extends A1, A2 {
    int a = 15;

    void displayA12();
}

class B implements A12 {
    public void displayA() {
        System.out.println("A");
    }

    public void displayA1() {
        System.out.println("A1");
    }

    public void displayA2() {
        System.out.println("A2");
    }

    public void displayA12() {
        System.out.println("A12");
    }
}

public class Inter {
    public static void main(String[] args) {
        B b = new B();
        b.displayA();
        b.displayA1();
        b.displayA2();
        b.displayA12();
    }
}
