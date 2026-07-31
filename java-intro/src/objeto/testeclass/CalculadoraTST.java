package objeto.testeclass;

import objeto.metodos.metodos01.Calculadora;

public class CalculadoraTST {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int soma = calculadora.somarDoisNumeros(10, 20);
        int subtracao = calculadora.subtrairDoisNumeros(100, 35);
        int multiplicacao = calculadora.multiplicarDoisNumeros(100, 7);
        double divisao = calculadora.divideDoisNumeros(43, 0);

        System.out.println("Soma dos números: " + soma);
        System.out.println("Subtração dos números: " + subtracao);
        System.out.println("Multiplicação dos números: " + multiplicacao);
        System.out.println("Divisão dos números: " + divisao);


    }
}
