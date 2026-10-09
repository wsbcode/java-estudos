package ClassesUtilitarias.Format;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTST01 {
    public static void main(String[] args) {
        // Cria o Locale configurado para Itália (idioma: italiano, país: Itália)
        Locale localeItaly = new Locale("it", "IT");

        // Cria o Locale configurado para Estados Unidos (idioma: inglês, país: EUA)
        Locale localeEnglish = new Locale("en", "US");

        // Cria o Locale configurado para França (idioma: francês, país: França)
        Locale localeFrance = new Locale("fr", "FR");

        // Cria o Locale configurado para Alemanha (idioma: alemão, país: Alemanha)
        Locale localeGermany = new Locale("de", "DE");

        // Cria o Locale configurado para Japão (idioma: japonês, país: Japão)
        Locale LocaleJapao = new Locale("ja", "JP");

        // Pega a instância do calendário com a data/hora atual
        Calendar calendar = Calendar.getInstance();

        // Formatadores de data estendida (FULL) aplicando cada Locale de país diferente
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL, localeEnglish);
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.FULL, localeFrance);
        DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.FULL, localeGermany);
        DateFormat dateFormat5 = DateFormat.getDateInstance(DateFormat.FULL, LocaleJapao);

        // Imprime a mesma data atual formatada nas regras e idioma de cada país
        System.out.println("Italy: " + dateFormat.format(calendar.getTime()));
        System.out.println("English: " + dateFormat2.format(calendar.getTime()));
        System.out.println("France: " + dateFormat3.format(calendar.getTime()));
        System.out.println("Germany: " + dateFormat4.format(calendar.getTime()));
        System.out.println("Japão: " + dateFormat5.format(calendar.getTime()));
    }
}