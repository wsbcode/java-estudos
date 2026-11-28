package EdatasHoras.formatacao.test;

// Importa DateFormat (formatador clássico de datas do pacote java.text) e Calendar (data/hora clássica)
import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTST01 {
    public static void main(String[] args) {
        // Pega uma instância de Calendar com a data e hora atuais do sistema/região
        Calendar calendar = Calendar.getInstance();

        // Cria um array com 7 posições para guardar diferentes estilos de formatação
        DateFormat[] df = new DateFormat[7];

        // Estilo padrão com data e hora curtas (ex.: 27/11/2026 21:57)
        df[0] = DateFormat.getInstance();
        // Estilo padrão apenas para data (equivale ao MEDIUM)
        df[1] = DateFormat.getDateInstance();
        // Estilo padrão para data e hora juntas
        df[2] = DateFormat.getDateTimeInstance();
        // Data bem curta (ex.: 27/11/2026)
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        // Data média (ex.: 27 de nov. de 2026)
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        // Data longa (ex.: 27 de novembro de 2026)
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        // Data completa, incluindo dia da semana (ex.: sexta-feira, 27 de novembro de 2026)
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);

        // Percorre cada formatador do array e aplica em calendar.getTime() (que retorna um Date)
        for (DateFormat dataFormatada : df) {
            System.out.println(dataFormatada.format(calendar.getTime()));
        }
    }
}