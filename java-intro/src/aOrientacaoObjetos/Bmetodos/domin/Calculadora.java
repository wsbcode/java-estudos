package aOrientacaoObjetos.Bmetodos.domin;

// Define a classe Calculadora, onde criamos os métodos com as operações matemáticas
public class Calculadora {

    // Método que soma dois valores fixos (10 + 10) e imprime na tela
    public void SomarDoisValores() {
        System.out.println(10 + 10);
    }

    // Método que recebe dois números e imprime o resultado da subtração deles
    public void SubtrairDoisValores(int num1, int num2) {
        // Cria uma variável para guardar a continha de menos
        int subtracao = num1 - num2;
        // Imprime o resultado formatado
        System.out.println("Resultado da subtração: " + subtracao);
    }

    // Método que recebe três números e faz a multiplicação entre eles
    public void MultiplicarDoisValores(int num1, int num2, int num3) {
        // Guarda o resultado da multiplicação dos três números
        int multiplicacao = num1 * num2 * num3;
        // Imprime o resultado na tela
        System.out.println("Resultado da multiplicacao: " + multiplicacao);
    }

    // Método que divide dois números e retorna um valor com casas decimais (double)
    public double DivisaoDoisValores(int num1, int num2) {
        // Verifica se o segundo número é zero para evitar erro no programa
        if (num2 == 0) {
            return 0; // Se for zero, retorna 0
        } else {
            return num1 / num2; // Senão, faz a divisão normalmente
        }
    }

    // Método vazio (ainda sem código dentro, criado apenas como estrutura)
    public void AlterarDoisValores(int num1, int num2) {
    }

    // Método que recebe uma lista de números (array) e soma todos eles
    public void somarArray(int[] numeros) {
        int soma = 0; // Variável que vai acumulando o total da soma

        // Passa por cada número que está dentro do array
        for (int numero : numeros) {
            soma = soma + numero; // Adiciona o número atual ao total
        }

        // Imprime o resultado final da soma da lista
        System.out.println("Resultado da soma: " + soma);
    }

    // Método usando VarArgs (...), que permite enviar quantos números você quiser separados por vírgula
    public void somaVarArgs(int... numeros) {
        int soma = 0; // Variável para acumular o total

        // Passa por cada número enviado
        for (int numero : numeros) {
            soma = soma + numero; // Acumula na soma
        }

        // Imprime o resultado final
        System.out.println("Resultado da soma: " + soma);
    }
}