package ClassesUtilitarias.Dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTST01 {
    public static void main(String[] args) {
        // Cria um horário específico: 22 horas, 22 minutos e 22 segundos (API moderna de hora pura)
        LocalTime time = LocalTime.of(22, 22, 22);

        // Pega apenas a hora exata de AGORA do sistema (sem a data)
        LocalTime timeNow = LocalTime.now();

        // Imprime o horário criado: "22:22:22"
        System.out.println(time);

        // Imprime o horário atual do sistema
        System.out.println(timeNow);

        // Imprime apenas a hora do objeto 'time' (22)
        System.out.println(time.getHour());

        // Imprime apenas os minutos do objeto 'time' (22)
        System.out.println(time.getMinute());

        // Imprime apenas os segundos do objeto 'time' (22)
        System.out.println(time.getSecond());

        // Retorna a hora no formato de 12 horas (AM/PM). Como 22h é 10h da noite, imprime 10
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM));

        // Constante que representa a menor hora possível no dia ("00:00")
        System.out.println(LocalTime.MIN);

        // Constante que representa a maior hora possível no dia ("23:59:59.999999999")
        System.out.println(LocalTime.MAX);
    }
}