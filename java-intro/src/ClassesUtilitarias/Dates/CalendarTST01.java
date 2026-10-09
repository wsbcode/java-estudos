package ClassesUtilitarias.Dates;

import java.util.Calendar;
import java.util.Date;

public class CalendarTST01 {
    public static void main(String[] args) {
        // Pega a instância do calendário do sistema
        Calendar calendar = Calendar.getInstance();

        // Define a data do calendário para a data/hora atual de hoje
        calendar.setTime(new Date());

        // Zera as horas (00)
        calendar.set(Calendar.HOUR_OF_DAY, 0);

        // Zera os minutos (00)
        calendar.set(Calendar.MINUTE, 0);

        // Zera os segundos (00)
        calendar.set(Calendar.SECOND, 0);

        // Zera os milissegundos (000)
        calendar.set(Calendar.MILLISECOND, 0);

        // Imprime a data com o horário "zerado" (meia-noite / 00:00:00)
        System.out.println(calendar.getTime());
    }
}