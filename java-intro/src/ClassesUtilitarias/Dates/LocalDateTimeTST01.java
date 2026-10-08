package ClassesUtilitarias.Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTST01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022-02-02");
        LocalTime time = LocalTime.parse("22:22:22");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ldt1 = date.atTime(time);
        System.out.println(ldt1);

    }
}
