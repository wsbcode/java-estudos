package ClassesUtilitarias.Strings;

import java.util.Locale;

public class StringTST02 {
    public static void main(String[] args) {
        String nome = "William";
        String numeros = "0123456789";
        String sobreNome = "    William";

        // .charAt(index) -> Retorna o caractere na posição informada (começa a contar do 0: 'W')
        System.out.println(nome.charAt(0));

        // .length() -> Retorna o tamanho total do texto (quantidade de caracteres: 7)
        System.out.println(nome.length());

        // .replace(antigo, novo) -> Substitui um caractere/trecho por outro ("Uilliam")
        System.out.println(nome.replace("W", "U"));

        // .toLowerCase() -> Converte todo o texto para letras minúsculas ("william")
        System.out.println(nome.toLowerCase());

        // .toUpperCase() -> Converte todo o texto para letras maiúsculas ("WILLIAM")
        System.out.println(nome.toUpperCase());

        // .length() -> Retorna a quantidade de números/caracteres do texto (10)
        System.out.println(numeros.length());

        // .substring(inicio, fim) -> Corta o texto do índice inicial até o final (o índice final NÃO é incluído: pega de 0 a 5 -> "012345")
        System.out.println(numeros.substring(0,6));

        // .trim() -> Remove os espaços em branco inúteis do início e do fim do texto ("William")
        System.out.println(sobreNome.trim());
    }
}