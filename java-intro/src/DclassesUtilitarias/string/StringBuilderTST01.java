package DclassesUtilitarias.string;

public class StringBuilderTST01 {
    public static void main(String[] args) {
        // Cria uma String comum ("William"). Em Java, String é imutável (não muda no lugar).
        String nome = "William";

        // Tenta juntar " Barbosa", mas o método concat() devolve uma NOVA String sem alterar 'nome'.
        // Como o resultado não foi guardado em nenhuma variável, ele se perde.
        nome.concat(" Barbosa");

        // Continua imprimindo "William", pois 'nome' não mudou.
        System.out.println(nome);

        // Cria um StringBuilder começando com "William ". Diferente de String, ele pode ser alterado no lugar.
        StringBuilder sb = new StringBuilder("William ");

        // Adiciona textos na sequência usando append() (que retorna o próprio StringBuilder, permitindo encadear).
        sb.append("Dev ").append("Senior");

        // Imprime "William Dev Senior".
        System.out.println(sb);

        // Apaga os caracteres do índice 0 até o 3 (0, 1 e 2 -> "Wil"). O índice final (3) não entra na remoção.
        sb.delete(0, 3);

        // Imprime "liam Dev Senior".
        System.out.println(sb);
    }
}