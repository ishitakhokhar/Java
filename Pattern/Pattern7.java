// 1
// 01
// 010
// 1010
// 10101

public class Pattern7 {

    public static void main(String args[]) {
        int c = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                c++;
                if (c % 2 != 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
