package Zaur.Homework3;

public class Clock {
    public static void time() {
        OUTER:
        for (int hour = 0; hour <= 6; hour++) {

            INNER_minutes:
            for (int minute = 0; minute <= 59; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER; }

                INNER_seconds:
                for (int second = 0; second <= 59; second++) {
                if (second * hour > minute) {
                    continue INNER_minutes;
                }
                System.out.println(hour + ":" + minute + ":" + second);
            }
        }
    }
}
public static void main(String[] args) {
time();
}
}