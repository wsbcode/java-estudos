package construtores.dominio;

public class Construtores {
    // // Atributos privados
    private String nome;
    private int idade;
    private char sexo;
    private int dataNascimento;
    private String dataCriacao;

    // // Construtor 1: recebe os 3 dados básicos
    public Construtores(String nome, int idade, char sexo) {
        this();
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // // Construtor 2: sobrecarga que chama o Construtor 1 e adiciona o ano de nascimento
    public Construtores(String nome, int idade, char sexo, int dataNascimento) {
        this(nome, idade, sexo);
        this.dataNascimento = dataNascimento;
    }

    // // Construtor Vazio: define uma regra padrão para QUALQUER usuário
    public Construtores() {
        this.dataCriacao = "10/08/2026"; // // Preenche a data atual automaticamente
        System.out.println("LOG: Novo usuário instanciado no sistema.");
    }

    // // Método para exibir os dados no console
    public void imprimir() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(sexo);
        System.out.println(dataNascimento);
    }

    // // Getter do Nome
    public String getNome() {
        return nome;
    }

    // // Setter do Nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // // Getter da Idade
    public int getIdade() {
        return idade;
    }

    // // Setter da Idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // // Getter do Sexo
    public char getSexo() {
        return sexo;
    }

    // // Setter do Sexo
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    // // Getter da Data de Nascimento (retorna int conforme o atributo)
    public int getDataNascimento() {
        return dataNascimento;
    }

    // // Setter da Data de Nascimento
    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}