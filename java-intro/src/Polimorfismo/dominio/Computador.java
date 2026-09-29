package Polimorfismo.dominio;

// // Herdando de Produto (que já assinou a interface Taxavel)
public class Computador extends Produto {
    public static final double IMPOSTO_POR_CENTO = 21; // // Taxa fixa do computador

    public Computador(String nome, double valor) {
        super(nome, valor); // // Repassa os dados para o construtor do Produto
    }

    // // Cumprindo a obrigação do contrato: calculando o imposto do computador
    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto da Computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}