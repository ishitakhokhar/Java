
/**
 * Time
 */
import java.util.Scanner;

class Time {
    int hour;
    int minutes;
    int seconds;
    int days;

    Time(int h, int m, int s, int d) {
        hour = h;
        minutes = m;
        seconds = s;
        days = d;
    }

    Time add(Time t) {
        Time result = new Time(hour, minutes, seconds, days);
        result.seconds += t.seconds;
        if (result.seconds >= 60) {
            result.minutes += result.minutes / 60;
            result.minutes %= 60;
        }
        result.minutes += t.minutes;
        if (result.minutes >= 60) {
            result.hour += result.minutes / 60;
            result.minutes %= 60;
        }
        result.hour += t.hour;
        if (result.hour >= 24) {
            result.days += result.minutes / 24;
            result.minutes %= 24;
        }
        result.days += t.days;
        return result;
    }
}

public class TimeAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in hour");
        int h = sc.nextInt();
        System.out.println("Enter time in minutes");
        int m = sc.nextInt();
        System.out.println("Enter time in seconds");
        int s = sc.nextInt();
        System.out.println("Enter days");
        int d = sc.nextInt();
        Time t1 = new Time(h, m, s, d);

        System.out.println("Enter time in hour");
        h = sc.nextInt();
        System.out.println("Enter time in minutes");
        m = sc.nextInt();
        System.out.println("Enter time in seconds");
        s = sc.nextInt();
        System.out.println("Enter days");
        d = sc.nextInt();
        Time t2 = new Time(h, m, s, d);
        Time result = t1.add(t2);
        System.out.println(result.hour + "hour :" + result.minutes + "minutes :" + result.seconds + "seconds :"
                + result.days + "days ");
        sc.close();
    }
}
