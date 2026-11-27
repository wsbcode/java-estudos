package EdatasHoras.localTime;

import java.time.LocalTime;

public class LocalTimeTST01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
    }
}
