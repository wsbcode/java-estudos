package aOrientacaoObjetos.Hassociacao.exercicio.domin;

// Define a classe Aluno (molde para criar objetos do tipo aluno para o exercício)
public class Aluno {

    // Atributos privados: o nome do aluno, a idade dele e o seminário em que ele está participando
    private String nome;
    private int idade;
    private Seminario seminario;

    // Construtor: exige que você informe o nome e a idade do aluno ao criá-lo
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método 'getNome' (getter): pega/consulta o nome do aluno
    public String getNome() {
        return nome;
    }

    // Método 'setNome' (setter): altera ou define o nome do aluno
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método 'getIdade' (getter): pega/consulta a idade do aluno
    public int getIdade() {
        return idade;
    }

    // Método 'setIdade' (setter): altera ou define a idade do aluno
    public void setIdade(int idade) {
        this.idade = idade;
    }
}