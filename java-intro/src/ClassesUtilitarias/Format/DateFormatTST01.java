package ClassesUtilitarias.Format;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTST01 {
    public static void main(String[] args) {
        // Pega a instância com a data/hora atual do sistema
        Calendar calendar = Calendar.getInstance();

        // Cria um array para guardar 7 formatadores diferentes da classe utilitária DateFormat
        DateFormat[] dateFormat = new DateFormat[7];

        // Formatador padrão abreviado (data e hora curtas)
        dateFormat[0] = DateFormat.getInstance();

        // Formatador padrão apenas de data (estilo padrão do sistema)
        dateFormat[1] = DateFormat.getDateInstance();

        // Formatador completo com data e hora juntos
        dateFormat[2] = DateFormat.getDateTimeInstance();

        // Formatador apenas de hora no formato curto (ex: 19:44)
        dateFormat[3] = DateFormat.getTimeInstance(DateFormat.SHORT);

        // Formatador apenas de hora no formato médio (ex: 19:44:00)
        dateFormat[4] = DateFormat.getTimeInstance(DateFormat.MEDIUM);

        // Formatador apenas de data no formato longo (ex: 9 de outubro de 2026)
        dateFormat[5] = DateFormat.getDateInstance(DateFormat.LONG);

        // Formatador apenas de data no formato completo/extenso (ex: sexta-feira, 9 de outubro de 2026)
        dateFormat[6] = DateFormat.getDateInstance(DateFormat.FULL);

        // Loop 'for-each' que percorre o array e imprime a data formatada em cada estilo
        for (DateFormat df : dateFormat) {
            System.out.println(df.format(calendar.getTime()));
        }
    }
}