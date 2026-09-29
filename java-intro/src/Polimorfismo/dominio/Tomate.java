package Polimorfismo.dominio;

// // Herdando de Produto
public class Tomate extends Produto {

    public static final double IMPOSTO_POR_CENTO = 0.5; // // Taxa fixa do tomate
    private String dataValidade; // // Atributo EXCLUSIVO do tomate

    // // Getter e Setter da data de validade
    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Tomate(String nome, double valor) {
        super(nome, valor); // // Repassa os dados para o pai
    }

    // // Cumprindo o contrato do seu próprio jeito
    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto do Tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}