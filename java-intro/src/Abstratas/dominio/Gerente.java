package Abstratas.dominio;

// // A classe Gerente herda de Funcionario usando a palavra 'extends'
public class Gerente extends Funcionario {

    // // Construtor que repassa o nome e o salário para o construtor da classe mãe usar através do 'super'
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    // // Implementação obrigatória do método abstrato da mãe com a regra de bônus específica do Gerente (50%)
    @Override
    public void CalcularBonus(){
        this.salario = this.salario + this.salario * 0.50;
    }
}