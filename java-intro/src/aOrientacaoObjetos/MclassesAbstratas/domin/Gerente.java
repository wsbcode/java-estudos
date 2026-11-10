package aOrientacaoObjetos.MclassesAbstratas.domin;

// Define a classe Gerente que herda da classe abstrata Funcionario (usando 'extends')
public class Gerente extends Funcionario {

    // Construtor: exige o nome e o salário e os repassa para a classe pai usando 'super(nome, salario)'
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    // Sobrescreve o método abstrato 'calculaSalario' exigido pela classe Pai.
    // Aqui a regra para o gerente é somar o salário atual com ele mesmo (ou seja, dobrar o salário, equivalente a um bônus de 100%).
    @Override
    public void calculaSalario() {
        this.salario = this.salario + salario;
    }

    // Anotação '@Override': sobrescreve o método 'toString' para exibir os dados do gerente formatados.
    // (Observação no texto: há uma pequena vírgula sobrando logo após a abertura das chaves, mas funciona normalmente).
    @Override
    public String toString() {
        return "Gerente {" +
                ", nome ='" + nome + '\'' +
                "salario =" + salario +
                '}';
    }
}