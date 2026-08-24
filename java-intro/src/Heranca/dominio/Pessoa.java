package Heranca.dominio;

// // Classe Pai (Superclasse) que contém os atributos e métodos comuns
public class Pessoa {
    // // Protected: permite acesso direto às classes filhas (como Funcionario)
    protected String nome;

    // // Private: visíveis e acessíveis diretamente apenas dentro da classe Pessoa
    private String cpf;
    private Endereco endereco; // // Associação: Pessoa tem um Endereço

    // // Construtor que exige o nome na criação da Pessoa
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // // Método para imprimir as informações da Pessoa
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        // // Imprime a rua do endereço associado
        System.out.println("Endereco: " + this.endereco.getRua() + " " + this.endereco.getRua());
        System.out.println("________________________");
    }

    // // Getters e Setters para manipular os atributos privados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}