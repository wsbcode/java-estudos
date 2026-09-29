package Polimorfismo.dominio;

// // Herdando de Produto
public class Televisao extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.5; // // Taxa fixa da TV

    public Televisao(String nome, double valor) {
        super(nome, valor); // // Repassa os dados para a classe pai
    }

    // // Cumprindo o contrato do seu próprio jeito
    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto da Televisão ");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}