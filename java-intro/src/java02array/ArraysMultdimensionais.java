package java02array;


public class ArraysMultdimensionais {
    public static void main(String[] args) {

        // ==========================================
        // ARRAY MULTIDIMENSIONAL (MATRIZ 3x3)
        // ==========================================
        // Linha 0: {1, 2, 3}  → coluna 0, 1, 2
        // Linha 1: {4, 5, 6}  → coluna 0, 1, 2
        // Linha 2: {7, 8, 9}  → coluna 0, 1, 2
        //
        // Acesso: dias[linha][coluna]
        // Exemplo: dias[1][2] = 6 (linha 1, coluna 2)
        // ==========================================

        int[][] dias = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // ==========================================
        // PERCORRENDO COM FOR TRADICIONAL
        // ==========================================
        // i = linha (0 a 2)
        // j = coluna (0 a 2)
        // dias[i][j] = acessa o elemento na posição linha i, coluna j
        // ==========================================

        for (int i = 0; i < dias.length; i++) {          // i = linha
            for (int j = 0; j < dias[i].length; j++) {   // j = coluna
                System.out.print(dias[i][j] + " ");      // mostra elemento
            }
        }

        System.out.println("__________________________");

        // ==========================================
        // PERCORRENDO COM FOR-EACH (MAIS SIMPLES)
        // ==========================================
        // Para cada LINHA (array inteiro) dentro de dias
        // Para cada NUM dentro da linha atual
        // ==========================================

        for (int[] linha : dias) {           // linha = {1,2,3}, depois {4,5,6}, depois {7,8,9}
            for (int num : linha) {          // num = cada número dentro da linha
                System.out.print(num + " "); // mostra o número
            }
        }
    }
}