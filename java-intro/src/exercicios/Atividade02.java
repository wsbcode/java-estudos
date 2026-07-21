package exercicios;
// ATIVIDADE PARA VERIFICAR DESCONTO DE ACORDO COM SALARIO RECEBIDO

public class Atividade02 {
    public static void main(String[] args) {
        double salario = 5000;
        double valorFinal;
        double desconto;

        if (salario > 3000 && salario < 4999) {
            desconto = 0.10;
        } else if (salario >= 5000) {
            desconto = 0.30;
        } else {
            desconto = 0.0;
        }

        valorFinal = salario - (salario * desconto);

        if (desconto > 0) {
            System.out.printf("Salário: R$ %.2f%n", salario);
            System.out.printf("Desconto: %.0f%%%n", desconto * 100);
            System.out.printf("Salário após descontos: R$ %.2f%n", valorFinal);
        } else {
            System.out.println("Salário isento de cobranças");
        }
    }
}