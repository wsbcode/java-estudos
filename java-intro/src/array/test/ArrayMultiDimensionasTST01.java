package array.test;

public class ArrayMultiDimensionasTST01 {
    public static void main(String[] args) {
        // Cria uma matriz bidimensional (array de arrays) de 3 linhas e 3 colunas
        int[][] dias = new int[3][3];

        // Preenche os valores da primeira linha (índice 0)
        dias[0][0] = 10;
        dias[0][1] = 20;
        dias[0][2] = 30;

        // Preenche os valores da segunda linha (índice 1)
        dias[1][0] = 100;
        dias[1][1] = 200;
        dias[1][2] = 300;

        // Preenche os valores da terceira linha (índice 2)
        dias[2][0] = 1000;
        dias[2][1] = 2000;
        dias[2][2] = 3000;

        // Percorre a matriz usando o 'for' tradicional com índices (i para linhas, j para colunas)
        for (int i = 0; i < dias.length; i++) {
            System.out.println("-----------------");
            for (int j = 0; j < dias[i].length; j++) {
                // Exibe cada elemento individual da matriz usando a posição [i][j]
                System.out.println(dias[i][j]);
            }
        }

        // Percorre a matriz usando o 'for-each' (forma mais limpa de ler arrays)
        for (int[] arraybase : dias){
            System.out.println("___________________");
            // Para cada linha/array interno, percorre seus números inteiros e imprime
            for (int j : arraybase ) {
                System.out.println(j);
            }

        }
    }
}