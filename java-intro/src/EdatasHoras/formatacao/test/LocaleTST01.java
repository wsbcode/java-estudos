package EdatasHoras.formatacao.test;

// Importa DateFormat, Calendar e Locale (representa idioma e país/região)
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTST01 {
    public static void main(String[] args) {
        // Cria objetos Locale com (idioma, país) seguindo o padrão ISO.
        // Atenção: o código oficial de país para o Brasil é "BR" e de idioma é "pt" -> new Locale("pt", "BR").
        Locale localeItaly = new Locale("it", "IT");
        Locale localeEnglish = new Locale("en", "US");
        Locale localeFrance = new Locale("fr", "FR");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeBrazil = new Locale("br", "BR");

        // Pega a data/hora atual do sistema
        Calendar calendar = Calendar.getInstance();

        // Cria formatadores de data no estilo FULL (mais detalhado) para cada Locale
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeEnglish);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeFrance);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);

        // Imprime a mesma data formatada no idioma e padrão de cada país
        System.out.println("Italy: " + df1.format(calendar.getTime()));
        System.out.println("English: " + df2.format(calendar.getTime()));
        System.out.println("France: " + df3.format(calendar.getTime()));
        System.out.println("Japan: " + df4.format(calendar.getTime()));
        System.out.println("Brazil: " + df5.format(calendar.getTime()));

        // Linha separadora visual no console
        System.out.println("------------------------------------------------");

        // Mostra o nome de "Itália" traduzido para o idioma de cada Locale passado como parâmetro
        System.out.println(localeItaly.getDisplayCountry(localeJapan));
        System.out.println(localeItaly.getDisplayCountry(localeEnglish));
        System.out.println(localeItaly.getDisplayCountry(localeFrance));
        System.out.println(localeItaly.getDisplayCountry(localeBrazil));
    }
}