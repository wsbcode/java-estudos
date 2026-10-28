package aOrientacaoObjetos.CmodificadorDeAcesso.test;

import aOrientacaoObjetos.CmodificadorDeAcesso.domin.Pessoa;

public class PessoaTST01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(-33);
        pessoa.setNome("Joao");
        pessoa.imprimir();
    }
}
