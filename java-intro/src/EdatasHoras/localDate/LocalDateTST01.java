package EdatasHoras.localDate;

import java.time.LocalDate;

public class LocalDateTST01 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());




    }
}
