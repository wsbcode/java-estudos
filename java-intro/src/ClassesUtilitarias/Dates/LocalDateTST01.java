package ClassesUtilitarias.Dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTST01 {
    public static void main(String[] args) {
        // Imprime a data/hora atual usando a classe legada Date
        System.out.println(new Date());

        // Imprime a data/hora atual usando a classe legada Calendar
        System.out.println(Calendar.getInstance().getTime());

        // Imprime o valor numérico do mês de Dezembro (12) através do Enum Month
        System.out.println(Month.DECEMBER.getValue());

        // Cria uma data específica (11/12/2022) utilizando LocalDate (API moderna do Java 8+)
        LocalDate date = LocalDate.of(2022, Month.DECEMBER, 11);

        // Pega apenas a data de hoje (sem horário)
        LocalDate dataHoje = LocalDate.now();

        // Tenta somar 4 semanas, mas NÃO altera 'dataHoje' (LocalDate é IMUTÁVEL! O resultado vira lixo pois não foi reatribuído)
        dataHoje.plusWeeks(4);

        // Imprime o ano da data (2022)
        System.out.println(date.getYear());

        // Imprime o mês por extenso em inglês (DECEMBER)
        System.out.println(date.getMonth());

        // Imprime o dia do mês (11)
        System.out.println(date.getDayOfMonth());

        // Imprime o dia do ano (345)
        System.out.println(date.getDayOfYear());

        // Imprime o dia da semana em inglês (SUNDAY)
        System.out.println(date.getDayOfWeek());

        // Imprime o dia do mês novamente (11)
        System.out.println(date.getDayOfMonth());

        // Imprime o dia do ano novamente (345)
        System.out.println(date.getDayOfYear());

        // Pega o ano através da interface genérica ChronoField (2022)
        System.out.println(date.get(ChronoField.YEAR));

        // Pega o dia do mês através da interface genérica ChronoField (11)
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
    }
}