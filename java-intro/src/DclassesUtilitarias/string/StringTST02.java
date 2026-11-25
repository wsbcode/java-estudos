package DclassesUtilitarias.string;

// Importação não utilizada neste código (pode ser removida sem afetar o programa)
import java.util.Locale;

public class StringTST02 {
    public static void main(String[] args) {
        // Cria uma String com 7 letras (índices de 0 a 6)
        String nome1 = "William";
        // Cria uma String com 6 caracteres numéricos (índices de 0 a 5)
        String numeros = "012345";
        // Cria uma String com espaços em branco no começo e no fim
        String nome2 = "      William    ";

        // Pega o caractere na posição 0 ('W')
        System.out.println(nome1.charAt(0));
        // Mostra quantos caracteres existem no texto ("William" tem 7)
        System.out.println(nome1.length());
        // Troca "W" por "U" e devolve uma nova String ("Uilliam") sem alterar 'nome1'
        System.out.println(nome1.replace("W", "U"));
        // Converte todas as letras para minúsculo ("william")
        System.out.println(nome1.toLowerCase());
        // Converte todas as letras para maiúsculo ("WILLIAM")
        System.out.println(nome1.toUpperCase());
        // Recorta do índice 0 até antes do 3 (índices 0, 1 e 2 -> "012")
        System.out.println(numeros.substring(0, 3));
        // Remove espaços em branco das pontas (início e fim), deixando "William"
        System.out.println(nome2.trim());
    }
}