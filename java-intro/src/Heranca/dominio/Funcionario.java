package Heranca.dominio;

// // Classe Filha (Subclasse) que herda tudo da classe Pessoa usando 'extends'
public class Funcionario extends Pessoa {
    // // Atributo específico apenas de Funcionario
    private double salario;

    // // Construtor do Funcionario que repassa o nome para o construtor do Pai (Pessoa)
    public Funcionario(String nome) {
        super(nome); // // O 'super()' chama o construtor da classe Pessoa
    }

    // // Sobrescreve o método imprimir() da classe Pessoa
    public void imprimir() {
        // // Executa primeiro o método imprimir() da classe Pai (Pessoa)
        super.imprimir();

        // // Adiciona as impressões específicas da classe Funcionario
        System.out.println("Salario " + this.salario);

        // // Acessa o atributo 'nome' diretamente porque ele foi definido como 'protected' na classe Pessoa
        System.out.println("Salário recebido por " + "Nome " + this.nome);
    }

    // // Getters e Setters do salário
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}