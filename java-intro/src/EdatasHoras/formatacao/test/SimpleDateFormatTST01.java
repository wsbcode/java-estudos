package EdatasHoras.formatacao.test;

// Importação não utilizada neste código (pode ser removida sem afetar o programa)
import java.text.ParseException;
// Importa SimpleDateFormat (formatador clássico que aceita padrão personalizado em texto)
import java.text.SimpleDateFormat;
// Importa Date (classe clássica que representa data e hora)
import java.util.Date;

public class SimpleDateFormatTST01 {
    public static void main(String[] args) {
        // Define o modelo/padrão de data e hora: ano(4 dígitos)-mês-dia hora:minuto:segundo
        String pattern = "yyyy-MM-dd HH:mm:ss";

        // Cria o formatador usando o padrão definido
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        // Formata a data/hora atual (new Date()) para String no formato "yyyy-MM-dd HH:mm:ss"
        System.out.println(simpleDateFormat.format(new Date()));

        try {
            // Tenta converter o texto "25 de November de 2026" para um objeto Date usando o padrão "yyyy-MM-dd HH:mm:ss".
            // Como o texto NÃO segue esse padrão (e ainda mistura "de" com "November"), o parse() lança ParseException!
            System.out.println(simpleDateFormat.parse(("25 de November de 2026")));
        } catch (Exception e) {
            // Captura o erro de leitura (ParseException) e imprime a pilha do erro no console sem travar o programa antes do catch
            e.printStackTrace();
        }
    }
}