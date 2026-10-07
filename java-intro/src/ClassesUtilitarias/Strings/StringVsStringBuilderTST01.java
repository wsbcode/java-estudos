package ClassesUtilitarias.Strings;

public class StringVsStringBuilderTST01 {
    public static void main(String[] args) {

        // --- CASO 1: Usamos STRING normal (Dia a dia) ---
        String nome = "William";
        String sobrenome = "Barbosa";

        // Concatenação simples = Pode usar String comum sem medo!
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Nome: " + nomeCompleto);


        // --- CASO 2: Usamos STRINGBUILDER (Dentro de Loops) ---
        StringBuilder relatorio = new StringBuilder();

        // Sempre que houver repetição/modificação frequente = OBRIGATÓRIO StringBuilder
        for (int i = 1; i <= 5; i++) {
            relatorio.append("Item ").append(i).append("\n"); // Altera O MESMO objeto
        }

        // Converte de volta para String apenas na hora de exibir
        System.out.println(relatorio.toString());
    }
}
