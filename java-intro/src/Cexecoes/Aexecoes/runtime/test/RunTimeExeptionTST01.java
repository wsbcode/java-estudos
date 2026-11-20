package Cexecoes.Aexecoes.runtime.test;

public class RunTimeExeptionTST01 {

    // Método principal onde o programa começa a executar
    public static void main(String[] args) {
        // Cria um array de inteiros com 3 elementos: índice 0 é 1, índice 1 é 2, índice 2 é 3
        int[] nums = {1, 2, 3};

        // Tenta acessar o índice 5, que não existe (os índices válidos vão só de 0 até 2).
        // Isso dispara uma 'ArrayIndexOutOfBoundsException' (uma exceção em tempo de execução / RuntimeException).
        System.out.println(nums[5]);
    }
}