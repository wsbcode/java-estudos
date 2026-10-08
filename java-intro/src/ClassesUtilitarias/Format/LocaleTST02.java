package ClassesUtilitarias.Format;

import java.util.Locale;

public class LocaleTST02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguage = Locale.getISOLanguages();

        for(String isoLanguege:isoLanguage){
            System.out.println(isoLanguege+ "");
        }
        System.out.println();

        for(String isoLanguege:isoCountries){
            System.out.println(isoLanguege+ "");
        }
    }
}
