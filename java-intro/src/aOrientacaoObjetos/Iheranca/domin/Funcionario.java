package aOrientacaoObjetos.Iheranca.domin;

// Define a classe Funcionario que herda todas as características e comportamentos da classe Pessoa (usando 'extends')
public class Funcionario extends Pessoa {

    // Atributo privado para guardar o salário do funcionário
    private double salario;

    // Bloco de inicialização estático: roda apenas uma vez quando a classe Funcionario é carregada na memória pela primeira vez
    static {
        System.out.println("Bloco de inicialização estático Funcionário ");
    }

    // Primeiro bloco de inicialização de instância: roda sempre que um novo objeto Funcionario é criado (antes do construtor)
    {
        System.out.println("Bloco inicialização Funcionario 1");
    }

    // Segundo bloco de inicialização de instância: roda logo após o primeiro bloco, também antes do construtor
    {
        System.out.println("Bloco inicialização Funcionario 2");
    }

    // Construtor: exige que você informe o nome ao criar o funcionário
    public Funcionario(String nome) {
        // 'super(nome)' chama o construtor da classe Pai (Pessoa) para inicializar o nome primeiro
        super(nome);
        System.out.println("Dentro do construtor Funcionário");
    }

    // Método para imprimir os dados do funcionário
    public void imprimir() {
        // 'super.imprimir()' chama o método de impressão da classe Pai (Pessoa) para exibir o nome e documentos/endereço
        super.imprimir();

        // Imprime o salário específico do funcionário
        System.out.println("Salario: " + this.salario);
    }

    // Método para exibir o relatório de pagamento com o valor e o nome
    public void relatorioPagamento() {
        System.out.println("Pagamento: " + this.salario + " Recebido por William, Valor = " + this.salario);
    }

    // Método 'getSalario' (getter): pega/consulta o salário do funcionário
    public double getSalario() {
        return salario;
    }

    // Método 'setSalario' (setter): altera ou define o valor do salário
    public void setSalario(double salario) {
        this.salario = salario;
    }
}