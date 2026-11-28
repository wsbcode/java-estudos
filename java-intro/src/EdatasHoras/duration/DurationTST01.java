package EdatasHoras.duration;

// Importação não utilizada neste código (pode ser removida sem afetar a execução)
import javax.swing.plaf.synth.SynthOptionPaneUI;
// Importa Duration (intervalo de tempo baseado em segundos/ nanossegundos) e classes de data/hora
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTST01 {
    public static void main(String[] args) {
        // Pega data e hora atuais e outra daqui a 2 anos
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);

        // Pega a hora atual e outra subtraindo 17 horas (mesmo que o nome da variável diga Minus7Hours)
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(17);

        // Calcula a duração entre dois LocalDateTime (convertida internamente para segundos/nanossegundos)
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        // Calcula a duração entre dois LocalTime (como subtraiu 17h, a duração fica negativa)
        Duration d2 = Duration.between(timeNow, timeMinus7Hours);
        // Calcula a duração entre dois Instants (marcos no tempo) separados por 1000 segundos
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));

        // Cria durações fixas diretamente com métodos 'of...'
        Duration d4 = Duration.ofDays(20);            // 20 dias -> internamente vira horas (ex.: PT480H)
        Duration d5 = Duration.ofMinutes(5);          // 5 minutos -> PT5M
        Duration d6 = Duration.of(5, ChronoUnit.HOURS); // 5 horas usando ChronoUnit -> PT5H

        // Imprime as durações no formato padrão ISO-8601 (ex.: PT... para tempo, P... para período)
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
    }
}