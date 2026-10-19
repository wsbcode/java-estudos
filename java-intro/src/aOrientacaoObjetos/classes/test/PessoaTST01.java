package aOrientacaoObjetos.classes.test;

import aOrientacaoObjetos.classes.domin.Pessoa;

public class PessoaTST01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "William";
        pessoa.idade = 33;
        pessoa.sexo = 'M';

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo);
    }
}
