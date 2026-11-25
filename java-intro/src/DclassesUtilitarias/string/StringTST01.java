package DclassesUtilitarias.string;

public class StringTST01 {
    public static void main(String[] args) {
        // Cria o texto literal "William" no String Pool (área de cache de Strings do Java).
        String nome = "William";

        // Reaproveita o mesmo "William" do String Pool, pois já existe lá.
        String nome2 = "William";

        // concat() cria uma nova String ("William Barbosa") e guarda em 'nome'.
        // 'nome' passa a apontar para esse novo texto, sem alterar o "William" original do pool.
        nome = nome.concat(" Barbosa");

        // Imprime "William Barbosa".
        System.out.println(nome);

        // Compara referências de memória ('=='): 'nome' aponta para "William Barbosa" e 'nome2' para "William" -> false.
        System.out.println(nome == nome2);

        // 'new String("William")' força a criação de um novo objeto fora do pool (no heap comum).
        String nome3 = new String("William");

        // Compara referências: 'nome2' está no String Pool e 'nome3' é outro objeto separado -> false.
        System.out.println(nome2 == nome3);

        // intern() pega/devolve a referência oficial de "William" dentro do String Pool, igual à de 'nome2' -> true.
        System.out.println(nome2 == nome3.intern());
    }
}