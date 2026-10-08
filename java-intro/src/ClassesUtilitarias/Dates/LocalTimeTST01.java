package ClassesUtilitarias.Dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTST01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(22, 22, 22);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
