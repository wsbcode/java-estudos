package aOrientacaoObjetos.Iheranca.domin;

// Define a classe Pessoa (a superclasse ou classe pai que serve de base para outras classes como Funcionario)
public class Pessoa {

    // Atributos protegidos ('protected'): podem ser acessados diretamente pelas classes filhas que herdam de Pessoa
    protected String nome;
    protected int cpf;
    protected Endereco endereco;

    // Bloco de inicialização estático: roda apenas uma vez quando a classe Pessoa é carregada na memória pela primeira vez
    static {
        System.out.println("Bloco de inicialização estático Pessoa ");
    }

    // Primeiro bloco de inicialização de instância: roda toda vez que um objeto Pessoa é criado, antes do construtor
    {
        System.out.println("Bloco inicialização pessoa 1");
    }

    // Segundo bloco de inicialização de instância: roda logo após o primeiro bloco, também antes do construtor
    {
        System.out.println("Bloco inicialização pessoa 2");
    }

    // Primeiro construtor: exige que você informe o nome ao criar a pessoa
    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    // Segundo construtor (sobrecarga): permite criar a pessoa informando o nome e o CPF.
    // Usa 'this(nome)' para reaproveitar o primeiro construtor.
    public Pessoa(String nome, int cpf) {
        this(nome);
        this.cpf = cpf;
    }

    // Método para imprimir os dados da pessoa (nome, CPF, rua e CEP do endereço)
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);

        // Imprime a rua e o CEP pegando os dados do objeto Endereco associado
        System.out.println(this.endereco.getRua());
        System.out.println(this.endereco.getCep());
    }

    // Método 'getNome' (getter): pega/consulta o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Método 'setNome' (setter): altera ou define o nome da pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método 'getCpf' (getter): pega/consulta o CPF da pessoa
    public int getCpf() {
        return cpf;
    }

    // Método 'setCpf' (setter): altera ou define o CPF da pessoa
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    // Método 'getEndereco' (getter): pega/consulta o endereço associado à pessoa
    public Endereco getEndereco() {
        return endereco;
    }

    // Método 'setEndereco' (setter): altera ou define o endereço da pessoa
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}