package DclassesUtilitarias.string;

public class StringPerformanceTST01 {
    public static void main(String[] args) {
        // Marca o tempo inicial (em milissegundos) antes de rodar o teste com String normal
        long inicio = System.currentTimeMillis();
        concatenarString(100_000);
        // Marca o tempo final após terminar o laço de 100.000 repetições
        long fim = System.currentTimeMillis();
        // Atenção: 'inicio - fim' dá um número negativo! O tempo gasto certo é 'fim - inicio'
        System.out.println("Tempo gasto para string " + (inicio - fim) + "ms");

        // Reutiliza 'inicio' para medir o tempo do StringBuilder (com 100.000 iterações)
        inicio = System.currentTimeMillis();
        concatenarStringBuilder(100_000);
        fim = System.currentTimeMillis();
        // Aqui também vale usar 'fim - inicio' para ver o tempo positivo gasto
        System.out.println("Tempo gasto para stringBuilder " + (inicio - fim) + "ms");

        // Reutiliza 'inicio' para medir o tempo do StringBuffer (com 100.000 iterações)
        inicio = System.currentTimeMillis();
        concatenarStringBuffer(100_000);
        fim = System.currentTimeMillis();
        // Aqui também vale usar 'fim - inicio' para ver o tempo positivo gasto
        System.out.println("Tempo gasto para stringBuffer " + (inicio - fim) + "ms");
    }

    // Junta 100.000 números usando 'String' com '+=': em cada volta cria um texto novo na memória
    private static void concatenarString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    // Junta 100.000 números usando 'StringBuilder' com capacidade inicial já reservada
    private static void concatenarStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    // Junta 100.000 números usando 'StringBuffer' (parecido com StringBuilder, mas seguro para várias threads)
    private static void concatenarStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}