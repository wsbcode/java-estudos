package Cexecoes.Aexecoes.runtime.test;

public class RunTimeExeptionTST02 {

    // Método principal: chama o método 'divisao' passando 100 e 0 (o que vai disparar o erro)
    public static void main(String[] args) {
        divisao(100, 0);
    }

    // Método que divide 'a' por 'b', mas bloqueia valores de 'b' menores ou iguais a zero
    public static int divisao(int a, int b) {
        // Verifica se o divisor 'b' é zero ou negativo
        if (b <= 0) {
            // Lança uma 'IllegalArgumentException' (exceção em tempo de execução) avisando que o argumento é inválido
            throw new IllegalArgumentException("Digite um valor inteiro positivo");
        }
        // Só chega aqui se 'b' for maior que zero; realiza a divisão e retorna o resultado
        return a / b;
    }
}