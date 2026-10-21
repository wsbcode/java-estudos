package aOrientacaoObjetos.metodos.domin;

public class Calculadora {
    public void SomarDoisValores() {
        System.out.println(10 + 10);
    }

    public void SubtrairDoisValores(int num1, int num2) {
        int subtracao = num1 - num2;
        System.out.println("Resultado da subtração: " + subtracao);
    }

    public void MultiplicarDoisValores(int num1, int num2, int num3) {
        int multiplicacao = num1 * num2 * num3;
        System.out.println("Resultado da multiplicacao: " + multiplicacao);
    }

    public double DivisaoDoisValores(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void AlterarDoisValores(int num1, int num2) {
    }

    public void somarArray(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma = soma + numero;
        }
        System.out.println("Resultado da soma: " + soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma = soma + numero;
        }
        System.out.println("Resultado da soma: " + soma);
    }

}

