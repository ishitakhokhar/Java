// Write a program to demonstrate Arithmatic Exception and ArrayIndexOutOfBounds Exception
// using try-catch block.
public class TryCatchBlock {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] arr = new int[3];
        try {
            System.out.println(a / b);
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            arr[3] = 4;
        } catch (ArrayIndexOutOfBoundsException ar) {
            System.out.println("nesting" + ar.toString());
        } catch (ArithmeticException ae) {
            System.out.println("inside Arithmatic Exception" + ae.toString());
        }

    }
}
