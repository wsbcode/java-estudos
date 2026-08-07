package exercicios.mediaSalario;

public class FuncionarioTST {
    public static void main(String[] args) {
        // // Cria o objeto funcionario na memória
        Funcionario funcionario = new Funcionario();

        // // Define os valores dos atributos
        funcionario.setNome("Joao");
        funcionario.setIdade(18);
        funcionario.setSalarios(new double[]{3000, 4000, 2000});

        // // Executa a impressão e o cálculo da média
        funcionario.imprimirFuncionario();

        System.out.println("---------------------------------");

//        funcionario.mediaSalario();
    }
}