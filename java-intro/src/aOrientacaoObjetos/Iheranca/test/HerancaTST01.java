package aOrientacaoObjetos.Iheranca.test;

// Importa as classes necessárias para podermos rodar o teste de herança
import aOrientacaoObjetos.Iheranca.domin.Endereco;
import aOrientacaoObjetos.Iheranca.domin.Funcionario;
import aOrientacaoObjetos.Iheranca.domin.Pessoa;

public class HerancaTST01 {
    // Método principal onde o programa começa a rodar
    public static void main(String[] args) {

        // Cria um objeto Endereco e define a rua e o CEP
        Endereco endereco = new Endereco();
        endereco.setRua("Madre de Deus");
        endereco.setCep(55555555);

        // Cria um objeto Pessoa chamado "funcinario3"
        Pessoa pessoa = new Pessoa("funcinario3");

        // Define o CPF e o endereço da pessoa
        pessoa.setCpf(1234345656);
        pessoa.setEndereco(endereco);

        // Imprime os dados da pessoa na tela
        pessoa.imprimir();

        // Imprime uma linha separadora para organizar a visualização
        System.out.println("----------------");

        // Cria um objeto Funcionario chamado "funcionario2" (isso vai disparar os blocos estáticos, de instância e o construtor da mãe e da filha)
        Funcionario funcionario = new Funcionario("funcionario2");

        // Define o CPF, o endereço e o salário do funcionário (herdando os métodos de Pessoa)
        funcionario.setCpf(1234345656);
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);

        // Imprime os dados do funcionário (nome, CPF, endereço e salário)
        funcionario.imprimir();

        // Chama o método específico do funcionário para exibir o relatório de pagamento
        funcionario.relatorioPagamento();
    }
}