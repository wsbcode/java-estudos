package ClassesUtilitarias.Strings;

public class StringPerformanceTST01 {
    public static void main(String[] args) {

        // Marca o tempo inicial em milissegundos
        long inicio = System.currentTimeMillis();
        concatString(100_000); // Executa o teste lento usando String comum
        long fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio) + " ms"); // Exibe o tempo total gasto (demora MUITO!)

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000); // Executa o teste super rápido usando StringBuilder (mutável)
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio) + " ms"); // Exibe o tempo (praticamente instantâneo!)

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000); // Executa o teste usando StringBuffer (mutável e seguro para threads)
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio) + " ms"); // Exibe o tempo (rápido, mas um tiquinho mais lento que o StringBuilder)

    }
    // Método 1: PÉSSIMA PERFORMANCE (Cria 100 mil objetos descartáveis na memória)
    private static void concatString(int tamanho) {
        String texto = "Meu nome é William Barbosa";
        for (int i = 0; i <= tamanho; i++) {
            texto += i; // A cada volta do loop, cria um novo objeto String no Heap!
        }
    }

    // Método 2: ALTA PERFORMANCE (Modifica o mesmo objeto na memória)
    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho); // Inicializa com a capacidade ideal
        for (int i = 0; i <= tamanho; i++) {
            sb.append(i); // Altera o mesmo texto sem criar lixo na memória
        }
    }

    // Método 3: SEGURA PARA MULTITHREADS (Thread-Safe, porém com leve custo de sincronização)
    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho); // Inicializa com a capacidade ideal
        for (int i = 0; i <= tamanho; i++) {
            sb.append(i); // Funciona igual ao StringBuilder, mas sincroniza os acessos
        }
    }
}