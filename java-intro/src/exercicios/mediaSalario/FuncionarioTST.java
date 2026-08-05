package exercicios.mediaSalario;

public class FuncionarioTST {
    public static void main(String[] args) {
        // // Cria o objeto funcionario na memória
        Funcionario funcionario = new Funcionario();

        // // Define os valores dos atributos
        funcionario.nome = "Joao";
        funcionario.idade = 18;
        funcionario.salarios = new double[] {3000, 4000, 2000};

        // // Executa a impressão e o cálculo da média
        funcionario.imprimirFuncionario();

        System.out.println("---------------------------------");

//        funcionario.mediaSalario();
    }
}