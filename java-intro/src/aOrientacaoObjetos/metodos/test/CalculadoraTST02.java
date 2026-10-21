package aOrientacaoObjetos.metodos.test;

import aOrientacaoObjetos.metodos.domin.Calculadora;

public class CalculadoraTST02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somarArray(numeros);
        calculadora.somaVarArgs(10, 20, 30);
    }
}
