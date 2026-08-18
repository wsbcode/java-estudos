// // Declara o pacote onde esta classe de teste está guardada
package metodos.test;

// // Importa a classe 'Calculadora' de outro pacote para poder usar seus métodos aqui
import metodos.dominio.Calculadora;

// // Criação da classe principal de teste
public class CalculadoraTest {

    // // Ponto de partida do Java: o código começa a rodar por aqui!
    public static void main(String[] args) {

        // // Cria (instancia) um objeto da classe 'Calculadora' para podermos usar seus métodos
        Calculadora calculadora = new Calculadora();

        // // Chama o método de somar passando 10 e 20, e guarda o resultado na variável 'soma'
        int soma = calculadora.somarDoisNumeros(10, 20);

        // // Chama o método de subtrair passando 100 e 35, e guarda o resultado na variável 'subtracao'
        int subtracao = calculadora.subtrairDoisNumeros(100, 35);

        // // Chama o método de multiplicar passando 100 e 7, e guarda o resultado na variável 'multiplicacao'
        int multiplicacao = calculadora.multiplicarDoisNumeros(100, 7);

        // // Chama o método de dividir passando 43 e 0, e guarda o resultado na variável 'divisao'
        double divisao = calculadora.divideDoisNumeros(43, 0);

        // // Exibe no terminal o valor guardado na variável 'soma'
        System.out.println("Soma dos números: " + soma);

        // // Exibe no terminal o valor guardado na variável 'subtracao'
        System.out.println("Subtração dos números: " + subtracao);

        // // Exibe no terminal o valor guardado na variável 'multiplicacao'
        System.out.println("Multiplicação dos números: " + multiplicacao);

        // // Exibe no terminal o valor guardado na variável 'divisao'
        System.out.println("Divisão dos números: " + divisao);

        // // Declaração da variável 'num1' com o valor original 100
        int num1 = 100;

        // // Declaração da variável 'num2' com o valor original 200
        int num2 = 200;

        // // Executa o método enviando apenas CÓPIAS (valores 100 e 200) dos dados
        calculadora.alterarDoisnumeros(num1, num2);

        // // Exibe no terminal o valor de 'num1' (que continua sendo o original 100)
        System.out.println("main: " + num1);

        // // Exibe no terminal o valor de 'num2' (que continua sendo o original 200)
        System.out.println("main: " + num2);

    }
}