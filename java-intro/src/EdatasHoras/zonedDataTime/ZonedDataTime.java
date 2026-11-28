package EdatasHoras.zonedDataTime;

// Importa classes modernas do java.time para fusos horários (ZoneId, ZonedDateTime, ZoneOffset, OffsetDateTime),
// instante (Instant), data/hora local (LocalDateTime, LocalDate), calendário japonês (JapaneseDate) e Map
import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZonedDataTime {
    public static void main(String[] args) {
        // Mapa com abreviações curtas antigas de fusos (ex.: EST, PST) e seus nomes completos
        Map<String, String> shotsIds = ZoneId.SHORT_IDS;
        System.out.println(shotsIds);
        // Mostra o fuso horário padrão configurado no sistema/JVM (ex.: America/Sao_Paulo)
        System.out.println(ZoneId.systemDefault());

        // Cria um ZoneId (fuso com regras de região, incluindo horário de verão histórico se houver) para Tóquio
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        // Pega data e hora locais atuais (sem fuso horário)
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // "Carimba" o fuso de Tóquio em cima de 'now' (mantém a mesma hora local escrita e anexa a zona Asia/Tokyo)
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        // Pega o instante atual global em UTC (marco exato no tempo)
        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        // Converte esse instante exato para o horário correspondente em Tóquio (ajusta a hora para a zona)
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime1);

        // Mostra os limites máximo (+18:00) e mínimo (-18:00) de deslocamento fixo em relação ao UTC
        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        // Cria um deslocamento fixo de -4 horas em relação ao UTC (ex.: Manaus)
        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");

        // Associa o deslocamento fixo a um LocalDateTime (mantém a hora local e adiciona -04:00)
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime1);

        // Outra forma de criar OffsetDateTime passando 'now' e 'offsetManaus'
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);

        // Converte um Instant (UTC) para OffsetDateTime aplicando -04:00 (ajusta a hora para esse deslocamento)
        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3);

        // Converte a data atual para o calendário oficial japonês (baseado na era do imperador)
        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
    }
}