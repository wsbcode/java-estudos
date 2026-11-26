package EdatasHoras.formatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTST01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeEnglish = new Locale("en", "US");
        Locale localeFrance = new Locale("fr", "FR");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeBrazil = new Locale("br", "BR");


        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeEnglish);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeFrance);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);

        System.out.println("Italy: " + df1.format(calendar.getTime()));
        System.out.println("English: " + df2.format(calendar.getTime()));
        System.out.println("France: " + df3.format(calendar.getTime()));
        System.out.println("Japan: " + df4.format(calendar.getTime()));
        System.out.println("Brazil: " + df5.format(calendar.getTime()));

        System.out.println("------------------------------------------------");

        System.out.println(localeItaly.getDisplayCountry(localeJapan));
        System.out.println(localeItaly.getDisplayCountry(localeEnglish));
        System.out.println(localeItaly.getDisplayCountry(localeFrance));
        System.out.println(localeItaly.getDisplayCountry(localeBrazil));

    }
}
