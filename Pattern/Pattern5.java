//      *
//     * *
//    *   *
//   *     *
//  *********
//     *   *
public class Pattern5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == 5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
        for (int i = 2; i <= 5; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= 2 * i - 1; j--) {
                if (j == 1 || j == 2 * i - 1 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }

}
