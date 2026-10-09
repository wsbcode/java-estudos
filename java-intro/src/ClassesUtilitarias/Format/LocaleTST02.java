package ClassesUtilitarias.Format;

import java.util.Locale;

public class LocaleTST02 {
    public static void main(String[] args) {
        // Exibe o Locale padrão configurado no Sistema Operacional / JVM da máquina atual (ex: pt_BR)
        System.out.println(Locale.getDefault());

        // Carrega um array de Strings contendo todos os códigos ISO de 2 letras de PAÍSES suportados (ex: BR, US, IT)
        String[] isoCountries = Locale.getISOCountries();

        // Carrega um array de Strings contendo todos os códigos ISO de 2 letras de IDIOMAS suportados (ex: pt, en, es)
        String[] isoLanguage = Locale.getISOLanguages();

        // Percorre o array e imprime cada código de IDIOMA cadastrado no Java
        for(String isoLanguege:isoLanguage){
            System.out.println(isoLanguege+ "");
        }

        // Imprime uma linha em branco para separar a exibição dos idiomas da exibição dos países
        System.out.println();

        // Percorre o array e imprime cada código de PAÍS cadastrado no Java
        for(String isoLanguege:isoCountries){
            System.out.println(isoLanguege+ "");
        }
    }
}