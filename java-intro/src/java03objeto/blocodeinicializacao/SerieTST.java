package java03objeto.blocodeinicializacao;

import java.util.Arrays;

public class SerieTST {
    public static void main(String[] args) {
        // // Ao usar o 'new', o Java faz nesta ordem:
        // // 1º Executa o bloco de inicialização { } da classe Serie
        // // 2º Executa o construtor Serie("See")
        Serie serie = new Serie("See");

        // // Imprime o nome da série ("See") retornado pelo Getter
        System.out.println(serie.getNome());

        // // Loop 'for-each' para percorrer o array de episódios preenchido no bloco
        for (int episodio : serie.getEpisodios()) {
            // // Imprime o número do episódio acompanhado da letra "x" (ex: 1x, 2x, 3x...)
            System.out.println(episodio + "-ep");
        }
    }
}