package ClassesUtilitarias.Format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTST01 {
    public static void main(String[] args) {
        // Define o texto da máscara de formatação (dd = dia, MM = mês com 2 dígitos, yyyy = ano com 4 dígitos)
        String isoFormat = "dd/MM/yyyy";

        // Cria o formatador utilitário SimpleDateFormat passando o padrão/máscara desejado
        SimpleDateFormat sdf = new SimpleDateFormat(isoFormat);

        // Formata a data atual do sistema, mas não guarda em nenhuma variável (linha redundante)
        sdf.format(new Date());

        // Formata a data atual e imprime diretamente no console (ex: "09/10/2026")
        System.out.println(sdf.format(new Date()));
    }
}