package EdatasHoras.localDateTime;

// Importa as três classes modernas sem fuso horário: data, hora e data+hora juntas
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTST01 {
    public static void main(String[] args) {
        // Pega a data e a hora atuais do sistema juntas (ex.: 2026-11-27T21:59:00...)
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // Converte texto no formato ISO para LocalTime (apenas hora:minuto:segundo)
        LocalTime time = LocalTime.parse("12:30:22");
        // Converte texto no formato ISO para LocalDate (apenas ano-mês-dia)
        LocalDate date = LocalDate.parse("2021-04-20");
        System.out.println(time);
        System.out.println(date);

        // Junta a data ('date') com a hora ('time') formando um LocalDateTime (2021-04-20T12:30:22)
        LocalDateTime localT1 = date.atTime(time);
        // Faz o mesmo resultado partindo de 'time' e informando 'date' (2021-04-20T12:30:22)
        LocalDateTime localT2 = time.atDate(date);

        System.out.println(localT1);
        System.out.println(localT2);
    }
}