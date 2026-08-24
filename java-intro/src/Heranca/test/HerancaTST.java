package Heranca.test;

import Heranca.dominio.Endereco;
import Heranca.dominio.Funcionario;
import Heranca.dominio.Pessoa;

// // Classe de teste com o método main para executar o programa
public class HerancaTST {
    public static void main(String[] args) {

        // // Criando e preenchendo o objeto Endereço
        Endereco endereco = new Endereco();
        endereco.setRua("Nova Madre de Deus");
        endereco.setCep("42600000");

        // // Instanciando uma Pessoa (passando o nome exigido no construtor)
        Pessoa pessoa = new Pessoa("Marivaldo");
        pessoa.setCpf("1233457290147");
        pessoa.setEndereco(endereco);

        // // Instanciando um Funcionário (passando o nome exigido pelo super)
        Funcionario funcionario = new Funcionario("Willian");
        funcionario.setCpf("000000000"); // // Método herdado de Pessoa
        funcionario.setEndereco(endereco); // // Método herdado de Pessoa
        funcionario.setSalario(2000); // // Método próprio de Funcionario

        // // Executando as impressões na tela
        funcionario.imprimir();
        pessoa.imprimir();
    }
}