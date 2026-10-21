package aOrientacaoObjetos.metodos.test;

import aOrientacaoObjetos.metodos.domin.Estudante;
import aOrientacaoObjetos.metodos.domin.ImpressoraEstudante;

public class EstudanteTST01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();


        estudante01.nome = "Pedro";
        estudante01.sexo = "M";
        estudante01.idade = 23;

        estudante02.nome = "Maria";
        estudante02.sexo = "F";
        estudante02.idade = 33;


        impressora.imprimirEstudante(estudante01);
        impressora.imprimirEstudante(estudante02);
        estudante01.imprimir();
        estudante02.imprimir();
    }
}
