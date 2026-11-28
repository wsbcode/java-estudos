package EdatasHoras.period;

// Importa LocalDate (data sem hora) e Period (intervalo de tempo baseado em anos, meses e dias)
import java.time.LocalDate;
import java.time.Period;

public class PeriodTST01 {
    public static void main(String[] args) {

        // Pega a data atual do sistema
        LocalDate now = LocalDate.now();
        // Cria uma data futura adicionando 2 anos e 7 dias à data atual
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);

        // Calcula o período entre 'now' e 'nowAfterTwoYears' (resultado esperado próximo de P2Y7D)
        Period p1 = Period.between(now, nowAfterTwoYears);
        // Cria um período fixo de 20 dias (P20D)
        Period p2 = Period.ofDays(20);
        // Cria um período de 30 semanas: internamente o Period converte semanas em dias (30 * 7 = 210 -> P210D)
        Period p3 = Period.ofWeeks(30);
        // Cria um período de 12 meses (P12M — não converte automaticamente 12 meses em 1 ano)
        Period p4 = Period.ofMonths(12);
        // Cria um período de 1 ano (P1Y)
        Period p5 = Period.ofYears(1);

        // Imprime cada período no formato padrão ISO-8601 (ex.: P2Y7D, P20D, P210D, P12M, P1Y)
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}