package EdatasHoras.localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTST01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime time = LocalTime.parse("12:30:22");
        LocalDate date = LocalDate.parse("2021-04-20");
        System.out.println(time);
        System.out.println(date);

        LocalDateTime localT1 = date.atTime(time);
        LocalDateTime localT2 = time.atDate(date);

        System.out.println(localT1);
        System.out.println(localT2);
    }
}
