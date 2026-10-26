package aOrientacaoObjetos.metodos.test;

// Importa a classe Calculadora para podermos usar os métodos dela aqui
import aOrientacaoObjetos.metodos.domin.Calculadora;

public class CalculadoraTST01 {
    // Método principal onde a execução do programa começa
    public static void main(String[] args) {

        // Cria um novo objeto da classe Calculadora na memória
        Calculadora calculadora = new Calculadora();

        // Chama o método que soma dois valores fixos (10 + 10)
        calculadora.SomarDoisValores();

        // Chama o método de subtração enviando os números 10 e 20
        calculadora.SubtrairDoisValores(10, 20);

        // Chama o método de multiplicação enviando três números (10, 20 e 30)
        calculadora.MultiplicarDoisValores(10, 20, 30);

        // Chama o método de divisão (20 dividido por 7) e guarda o resultado em uma variável decimal (double)
        double resultadoDivisao = calculadora.DivisaoDoisValores(20 , 7);

        // Imprime o resultado da divisão no console
        System.out.println("Resultado Divisão " + resultadoDivisao);
    }
}