import java.util.Scanner;

class LeapYearI {
    int year;

    LeapYearI(int y) {
        year = y;
    }

    public boolean isLeapYearI() {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}

public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();
        LeapYearI leap = new LeapYearI(year);
        if (leap.isLeapYearI()) {
            System.out.println("It is leap year");
        } else {
            System.out.println("It is not leap year");
        }
        sc.close();
    }
}
