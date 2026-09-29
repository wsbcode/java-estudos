package Polimorfismo.servico;

import Polimorfismo.dominio.Produto;
import Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    // // Método estático: recebe QUALQUER Produto (Computador, TV ou Tomate)
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de Imposto");

        // // Polimorfismo: chama o cálculo de imposto do produto que chegou
        double imposto = produto.calcularImposto();

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        // // 1. INSTANCEOF: Pergunta se o produto genérico é um Tomate
        if (produto instanceof Tomate) {

            // // 2. CAST: Converte o Produto genérico para o tipo específico Tomate
            Tomate tomate = (Tomate) produto;

            // // Agora o Java libera o acesso ao método exclusivo do Tomate
            System.out.println("Validade: " + tomate.getDataValidade());
        }
    }
}