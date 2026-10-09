package ClassesUtilitarias.Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTST01 {
    public static void main(String[] args) {
        // Pega a data e a hora exatas de AGORA (API moderna do Java 8+)
        LocalDateTime localDateTime = LocalDateTime.now();

        // Converte o texto "YYYY-MM-DD" para um objeto de DATA pura (sem hora)
        LocalDate date = LocalDate.parse("2022-02-02");

        // Converte o texto "HH:mm:ss" para um objeto de HORA pura (sem data)
        LocalTime time = LocalTime.parse("22:22:22");

        // Imprime a data e hora atuais zeradas/completas do sistema
        System.out.println(localDateTime);

        // Imprime a data isolada: 2022-02-02
        System.out.println(date);

        // Imprime a hora isolada: 22:22:22
        System.out.println(time);

        // Combina o objeto LocalDate com o LocalTime, gerando um LocalDateTime completo ("2022-02-02T22:22:22")
        LocalDateTime ldt1 = date.atTime(time);

        // Imprime a união da data com a hora
        System.out.println(ldt1);
    }
}