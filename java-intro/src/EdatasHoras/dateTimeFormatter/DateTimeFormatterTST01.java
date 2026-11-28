package EdatasHoras.dateTimeFormatter;

// Importa classes modernas de data/hora (pacote java.time) e o formatador DateTimeFormatter
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTST01 {
    public static void main(String[] args) {
        // Pega a data atual do sistema (apenas ano, mês e dia, sem hora)
        LocalDate date = LocalDate.now();

        // Formata a data em padrões prontos do DateTimeFormatter (transforma LocalDate -> String)
        String dateFormat1 = date.format(DateTimeFormatter.BASIC_ISO_DATE); // ex.: 20261127
        String dateFormat2 = date.format(DateTimeFormatter.ISO_DATE);       // ex.: 2026-11-27
        String dateFormat3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE); // ex.: 2026-11-27

        System.out.println(dateFormat1);
        System.out.println(dateFormat2);
        System.out.println(dateFormat3);

        // Converte um texto (String) de volta para LocalDate seguindo o formato informado ('parse')
        // Dica: 'parse' é um método estático, então o jeito mais comum de chamar é LocalDate.parse(...)
        LocalDate parse = date.parse("20261127", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse);

        // Pega data e hora atuais juntas
        LocalDateTime now = LocalDateTime.now();

        // Formata data + hora no padrão ISO (ex.: 2026-11-27T21:42:32.2500668)
        String dateformat4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(dateformat4);

        // Converte uma String com data e hora no formato ISO de volta para LocalDateTime
        LocalDateTime parse2 = LocalDateTime.parse("2026-11-27T21:42:32.2500668", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse2);

        // Cria um formato personalizado com 'ofPattern' (dia-mês-ano hora:minuto:segundo) e já formata a data/hora atual
        String formatBR = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(LocalDateTime.now());
        System.out.println(formatBR);
    }
}