package aOrientacaoObjetos.Opolimorfismo.domin;

public class Computador extends Produto {
    public static final double TAXA_IMPOSTO = 0.25;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double CalcularImposto() {
        return this.valor * TAXA_IMPOSTO;
    }
}