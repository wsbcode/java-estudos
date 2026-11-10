package aOrientacaoObjetos.MclassesAbstratas.domin;

// Define a classe Desenvolvedor que herda da classe abstrata Funcionario (usando 'extends')
public class Desenvolvedor extends Funcionario {

    // Construtor: exige o nome e o salário e os repassa para a classe pai usando 'super(nome, salario)'
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    // Sobrescreve o método abstrato 'calculaSalario' exigido pela classe Pai.
    // Aqui é definida a regra específica de cálculo para o desenvolvedor (adicionando 50% ao salário).
    @Override
    public void calculaSalario() {
        this.salario = salario + (salario * 0.5);
    }

    // Anotação '@Override': sobrescreve o método 'toString' para exibir os dados do desenvolvedor formatados
    @Override
    public String toString() {
        return "Desenvolvedor {" +
                "nome ='" + nome + '\'' +
                ", salario =" + salario +
                '}';
    }
}