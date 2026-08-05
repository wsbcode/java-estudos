package exercicios.mediaSalario;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    // // Método para exibir os dados completos do funcionário
    public void imprimirFuncionario() {
        System.out.println("Nome do funcionario: " + this.nome);
        System.out.println("Idade do funcionario: " + this.idade);

        // // Verifica se o array de salários não está nulo antes de percorrer
        if (this.salarios == null) {
            System.out.println("Nenhum salario cadastrado.");
            return; // // Sai do método se não houver salários
        }

        // // Contador para numerar os salários na impressão
        int contador = 1;
        for (double salario : this.salarios) {
            System.out.println("Salario " + contador + " do funcionario: R$ " + salario);
            contador++; // // Incrementa a numeração
        }
        mediaSalario();
    }

    // // Método para calcular e imprimir a média salarial
    public void mediaSalario() {
        // // Evita erros se o array for nulo ou estiver vazio (tamanho 0)
        if (this.salarios == null || this.salarios.length == 0) {
            System.out.println("Nao foi possivel calcular a media: sem salarios informados.");
            return; // // Sai do método sem tentar fazer a divisão
        }

        double somaTotal = 0;

        // // Percorre todos os salários e acumula o total
        for (double salario : this.salarios) {
            somaTotal += salario;
        }

        // // Divide o total de salários pela quantidade de itens no array
        double mediaSalarial = somaTotal / this.salarios.length;

        System.out.println("Media do funcionario: R$ " + mediaSalarial);
    }
}