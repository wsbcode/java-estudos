package Abstratas.dominio;

// // A classe Desenvolvedor herda de Funcionario usando a palavra 'extends'
public class Desenvolvedor extends Funcionario {

    // // Construtor que repassa os dados para o construtor da mãe via 'super'
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    // // Implementação obrigatória do método abstrato com a regra de bônus específica do Desenvolvedor (10%)
    @Override
    public void CalcularBonus(){
        this.salario = this.salario + this.salario * 0.10;
    }
}