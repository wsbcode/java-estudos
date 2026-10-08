package ClassesUtilitarias.Format;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTST01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeEnglish = new Locale("en", "US");
        Locale localeFrance = new Locale("fr", "FR");
        Locale localeGermany = new Locale("de", "DE");
        Locale LocaleJapao = new Locale("ja", "JP");


        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL, localeEnglish);
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.FULL, localeFrance);
        DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.FULL, localeGermany);
        DateFormat dateFormat5 = DateFormat.getDateInstance(DateFormat.FULL, LocaleJapao);


        System.out.println("Italy: " + dateFormat.format(calendar.getTime()));
        System.out.println("English: " + dateFormat2.format(calendar.getTime()));
        System.out.println("France: " + dateFormat3.format(calendar.getTime()));
        System.out.println("Germany: " + dateFormat4.format(calendar.getTime()));
        System.out.println("Japão: " + dateFormat5.format(calendar.getTime()));
    }
}
