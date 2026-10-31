package aOrientacaoObjetos.Hassociacao.domin;

// Define a classe Escola (molde para criar objetos do tipo escola)
public class Escola {

    // Atributos privados: o nome da escola e uma lista (array) de professores que trabalham nela
    private String nome;
    private Professor[] professores;

    // Construtor: exige que você informe o nome e a lista de professores ao criar a escola
    public Escola(String nome , Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    // Método para imprimir o nome da escola e listar todos os professores dela
    public void imprimir() {
        System.out.println("Escola: " + this.nome);

        // Verifica se a lista de professores está vazia (nula) para evitar erro no programa
        if (this.professores == null) {
            return; // Se estiver vazia, para por aqui
        }

        // Passa por cada professor dentro do array de professores
        for (Professor professor : this.professores) {
            // Imprime o nome de cada professor usando o método getNome()
            System.out.println("Professor: " + professor.getNome());
        }
    }

    // Método 'getNome' (getter): pega/consulta o nome da escola
    public String getNome() {
        return nome;
    }

    // Método 'setNome' (setter): altera ou define o nome da escola
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método 'getProfessores' (getter): pega/consulta a lista de professores
    public Professor[] getProfessores() {
        return professores;
    }

    // Método 'setProfessores' (setter): altera ou define a lista de professores da escola
    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}