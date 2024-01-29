import java.util.Scanner;

public class LeapYearM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int year = sc.nextInt();
        if (isleap(year))
            System.out.println("It is leap year");
        else
            System.out.println("It is not leap year");
        sc.close();
    }

    public static boolean isleap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0));
    }
}
