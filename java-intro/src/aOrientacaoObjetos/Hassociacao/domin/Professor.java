package aOrientacaoObjetos.Hassociacao.domin;

// Define a classe Professor (molde para criar objetos do tipo professor)
public class Professor {

    // Atributo privado para guardar o nome do professor
    private String nome;

    // Construtor: exige que você informe o nome do professor logo ao criá-lo
    public Professor(String nome) {
        this.nome = nome;
    }

    // Método 'getNome' (getter): pega/consulta o nome do professor
    public String getNome() {
        return nome;
    }

    // Método 'setNome' (setter): altera ou define o nome do professor
    public void setNome(String nome) {
        this.nome = nome;
    }
}