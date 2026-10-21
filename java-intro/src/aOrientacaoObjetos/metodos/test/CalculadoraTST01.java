package aOrientacaoObjetos.metodos.test;

import aOrientacaoObjetos.metodos.domin.Calculadora;

public class CalculadoraTST01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.SomarDoisValores();
        calculadora.SubtrairDoisValores(10, 20);
        calculadora.MultiplicarDoisValores(10, 20, 30);

       double resultadoDivisao = calculadora.DivisaoDoisValores(20 , 7);
       System.out.println("Resultado Divisão " + resultadoDivisao);
    }
}
