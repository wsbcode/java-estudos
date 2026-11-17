package Cexecoes.Aexecoes.runtime.test;

public class RunTimeExeptionTST02 {
    public static void main(String[] args) {
        divisao(100,0);
    }

    public static int divisao(int a, int b) {
        if (b <= 0) {
            throw new IllegalArgumentException("Digite um valor inteiro positivo");
        }
        return a / b;
    }
}
