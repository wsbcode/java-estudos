package aOrientacaoObjetos.Bmetodos.test;

// Importa a classe Calculadora para podermos usar seus métodos de cálculo
import aOrientacaoObjetos.Bmetodos.domin.Calculadora;

public class CalculadoraTST02 {
    // Método principal onde o programa começa a rodar
    public static void main(String[] args) {

        // Cria um objeto da classe Calculadora na memória
        Calculadora calculadora = new Calculadora();

        // Cria um array (uma lista) com 5 números inteiros
        int[] numeros = {1, 2, 3, 4, 5};

        // Chama o método que soma os números que estão dentro do array
        calculadora.somarArray(numeros);

        // Chama o método VarArgs passando vários números diretamente separados por vírgula
        calculadora.somaVarArgs(10, 20, 30);
    }
}