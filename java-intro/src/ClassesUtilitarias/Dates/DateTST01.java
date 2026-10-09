package ClassesUtilitarias.Dates;

import java.util.Date;

public class DateTST01 {
    public static void main(String[] args) {
        // Cria um objeto Date contendo a data e a hora exatas deste milissegundo
        Date date = new Date();

        // Imprime a data atual no formato padrão do sistema (ex: Fri Oct 09 19:43:00 BRT 2026)
        System.out.println(date);
    }
}