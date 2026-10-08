package ClassesUtilitarias.Format;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTST01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] numeroFormatado = new NumberFormat[4];

        numeroFormatado[0] = NumberFormat.getCurrencyInstance(localeBR);
        numeroFormatado[1] = NumberFormat.getCurrencyInstance(localeJP);
        numeroFormatado[2] = NumberFormat.getCurrencyInstance(localeIT);
        numeroFormatado[3] = NumberFormat.getCurrencyInstance(localeJP);

        double valor = 10_000.123;
        for ( NumberFormat format : numeroFormatado ) {
            System.out.println(format.format(valor));
        }
    }
}
