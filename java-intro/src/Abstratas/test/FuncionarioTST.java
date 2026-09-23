package Abstratas.test;

import Abstratas.dominio.Desenvolvedor;

import Abstratas.dominio.Gerente;

public class FuncionarioTST {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gojo", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("William Barbosa", 10000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }

}
