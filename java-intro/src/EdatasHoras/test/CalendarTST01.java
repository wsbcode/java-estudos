package EdatasHoras.test;

// Importa Calendar (classe clássica de data/hora que lida com campos de calendário e fuso) e Date
import java.util.Calendar;
import java.util.Date;

public class CalendarTST01 {
    public static void main(String[] args) {
        // Pega uma instância de Calendar com a data/hora atual e configurações da região
        Calendar calendar = Calendar.getInstance();

        // Verifica se o primeiro dia da semana nessa configuração de calendário é Domingo
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingão");
        }

        // Lê campos específicos do calendário usando constantes de Calendar:
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));         // Dia da semana (ex.: Domingo = 1, Sexta = 6)
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));        // Dia do mês (1 a 31)
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));         // Dia do ano (1 a 365/366)
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // Qual ocorrência desse dia da semana no mês (1 a 5)

        // Altera o próprio objeto 'calendar' no lugar (Calendar é mutável, diferente de LocalDateTime)
        calendar.add(Calendar.DAY_OF_YEAR, 2); // Soma 2 dias (poderia usar valor negativo para subtrair)
        calendar.add(Calendar.HOUR, 2);         // Soma 2 horas

        // Converte o Calendar atualizado para um objeto Date e imprime
        Date dade = calendar.getTime();
        System.out.println(dade);
    }
}