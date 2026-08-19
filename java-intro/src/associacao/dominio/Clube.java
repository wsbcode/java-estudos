package associacao.dominio;

public class Clube {
    private String nome;

    // // Associação: O Clube guarda um ARRAY de objetos da classe Professor
    private Professor[] professores;

    // // Construtor: Torna OBRIGATÓRIO passar o nome e o array de professores na criação
    public Clube(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprimir() {
        System.out.println("Clube: " + nome);

        // // Proteção: Se o array estiver vazio/nulo, ele para por aqui e não dá erro
        if (professores == null) return;

        // // For-each: Percorre o array e imprime o nome de cada professor associado
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}