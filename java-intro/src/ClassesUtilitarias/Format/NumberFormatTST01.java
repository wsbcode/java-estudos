package ClassesUtilitarias.Format;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTST01 {
    public static void main(String[] args) {
        // Define o Locale para Português do Brasil usando o construtor tradicional (pt_BR)
        Locale localeBR = new Locale("pt", "BR");

        // Utiliza as constantes prontas de Locale para Japão e Itália
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        // Cria um array para guardar 4 formatadores de moeda da classe utilitária NumberFormat
        NumberFormat[] numeroFormatado = new NumberFormat[4];

        // Carrega o formatador de moeda (Currency) configurado nas regras do Brasil (R$)
        numeroFormatado[0] = NumberFormat.getCurrencyInstance(localeBR);

        // Carrega o formatador de moeda configurado nas regras do Japão (¥)
        numeroFormatado[1] = NumberFormat.getCurrencyInstance(localeJP);

        // Carrega o formatador de moeda configurado nas regras da Itália (€)
        numeroFormatado[2] = NumberFormat.getCurrencyInstance(localeIT);

        // Repete o formatador de moeda das regras do Japão
        numeroFormatado[3] = NumberFormat.getCurrencyInstance(localeJP);

        // Valor numérico de teste (10000.123) usando o caractere '_' para legibilidade
        double valor = 10_000.123;

        // Loop 'for-each' que aplica a formatação de moeda correspondente a cada país e imprime o resultado
        for ( NumberFormat format : numeroFormatado ) {
            System.out.println(format.format(valor));
        }
    }
}