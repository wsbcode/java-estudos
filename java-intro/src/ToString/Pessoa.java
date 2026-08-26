package ToString;

// // Classe que representa uma Pessoa
public class Pessoa {
    // // Atributos privados para manter o encapsulamento
    private String nome;
    private int idade;

    // // Construtor para inicializar o objeto com nome e idade
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // // Sobrescreve o método toString() padrão da classe Object
    // // Serve para formatar como a Pessoa será exibida em texto
    @Override
    public String toString() {
        return "Nome: " + this.nome + " - " + "Idade: " + this.idade;
    }

    // // Getter para ler o nome
    public String getNome() {
        return nome;
    }

    // // Setter para alterar o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // // Getter para ler a idade
    public int getIdade() {
        return idade;
    }

    // // Setter para alterar a idade
    public void setIdade(int idade) {
        this.idade = idade;
    }
}