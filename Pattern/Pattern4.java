//       *
//      * *
//     * * *
//    * * * *
//   * * * * *
//    * * * *
//     * * *
//      * *
//       *
public class Pattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = 2; i <= 5; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int m = 5; m >= i; m--) {
                if (i == 1) {
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }

    }

}
