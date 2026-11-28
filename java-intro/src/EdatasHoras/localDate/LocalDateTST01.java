package EdatasHoras.localDate;

// Importa LocalDate (classe moderna do java.time que guarda apenas ano, mês e dia, sem hora)
import java.time.LocalDate;

public class LocalDateTST01 {
    public static void main(String[] args) {

        // Pega a data atual do sistema (ex.: 2026-11-27)
        LocalDate date = LocalDate.now();

        // Imprime a data completa no formato padrão ISO (AAAA-MM-DD)
        System.out.println(date);
        // Pega o ano como número inteiro (ex.: 2026)
        System.out.println(date.getYear());
        // Pega o mês como um enum Month (ex.: NOVEMBER)
        System.out.println(date.getMonth());
        // Pega o dia do mês de 1 a 31 (ex.: 27)
        System.out.println(date.getDayOfMonth());
        // Pega o dia da semana como um enum DayOfWeek (ex.: FRIDAY)
        System.out.println(date.getDayOfWeek());
        // Pega qual é o dia do ano de 1 a 365 (ou 366 em ano bissexto)
        System.out.println(date.getDayOfYear());
        // Descobre quantos dias tem o mês dessa data (ex.: 30 em novembro, 28 ou 29 em fevereiro)
        System.out.println(date.lengthOfMonth());
        // Retorna true se o ano for bissexto (fevereiro com 29 dias) ou false se não for
        System.out.println(date.isLeapYear());

    }
}