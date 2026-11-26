package EdatasHoras.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTST01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingão");
        }

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        calendar.add(Calendar.DAY_OF_YEAR, 2);
        calendar.add(Calendar.HOUR, 2);

        Date dade = calendar.getTime();
        System.out.println(dade);
    }
}
