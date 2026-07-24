package array;

// CLASSE PARA ESTUDAR ARRAYS EM JAVA
public class Arrays {
    public static void main(String[] args) {

        // 1. DECLARAR ARRAYS
        String[] nomes = {"William", "Palmeiras", "Vitoria", "Brasil"};  // Array de textos
        int[] valores = {1, 2, 3, 4, 5};                                 // Array de números

        // 2. PERCORRER COM FOR TRADICIONAL (USA ÍNDICE)
        // for (começo; condição; incremento)
        // nomes.length = tamanho do array (4)
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);  // nomes[0], nomes[1], nomes[2], nomes[3]
        }

        // 3. PERCORRER COM FOR-EACH (NÃO USA ÍNDICE) - MAIS RECOMENDADO
        // for (tipo variavel : array)
        for (int x : valores) {
            System.out.println(x);  // 1, 2, 3, 4, 5
        }
    }
}
