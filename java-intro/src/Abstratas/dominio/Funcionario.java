package Abstratas.dominio;

// // O 'abstract' marca esta classe como um molde genérico que NÃO pode ser instanciado diretamente com 'new'
public abstract class Funcionario {
    // // 'protected' permite que as classes filhas (Gerente, Desenvolvedor) acessem os atributos diretamente
    protected String nome;
    protected double salario;

    // // Construtor da classe mãe para inicializar o nome e o salário
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        // // Chama o cálculo de bônus automático assim que o objeto é criado
        CalcularBonus();
    }

    // // Método abstrato: NÃO tem corpo '{}'. Obriga todas as classes filhas a criarem sua própria regra de bônus
    public abstract void CalcularBonus();

    // // Sobrescreve o método padrão do Java para formatar a exibição dos dados do funcionário em texto
    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", salario=" + salario + '}';
    }

    // // Getters e Setters para permitir o acesso e modificação segura dos dados por outras classes
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}