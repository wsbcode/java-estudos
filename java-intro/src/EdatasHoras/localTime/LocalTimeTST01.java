package EdatasHoras.localTime;

// Importa LocalTime (classe moderna do java.time que guarda apenas hora, minuto, segundo e nanossegundo)
import java.time.LocalTime;

public class LocalTimeTST01 {
    public static void main(String[] args) {
        // Pega a hora atual do sistema (sem data e sem fuso horário)
        LocalTime time = LocalTime.now();
        // Imprime a hora completa no formato ISO (ex.: 21:59:10.123456789)
        System.out.println(time);
        // Pega apenas a hora como inteiro (0 a 23)
        System.out.println(time.getHour());
        // Pega apenas os minutos como inteiro (0 a 59)
        System.out.println(time.getMinute());
        // Pega apenas os segundos como inteiro (0 a 59)
        System.out.println(time.getSecond());
    }
}