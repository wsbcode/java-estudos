package Heranca.test;

import Heranca.dominio.Endereco;
import Heranca.dominio.Funcionario;
import Heranca.dominio.Pessoa;

public class HerancaTST {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Nova Madre de Deus");
        endereco.setCep("42600000");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Marivaldo");
        pessoa.setCpf("1233457290147");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Willian");
        funcionario.setCpf("000000000");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);


        funcionario.imprimir();
        pessoa.imprimir();
    }
}
