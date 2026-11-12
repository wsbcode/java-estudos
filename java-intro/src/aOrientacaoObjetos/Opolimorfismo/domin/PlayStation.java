package aOrientacaoObjetos.Opolimorfismo.domin;

public class PlayStation extends Produto {
    public static final double TAXA_IMPOSTO = 0.2;

    public PlayStation(String nome, double valor) {
        super(nome, valor);
    }
    @Override
    public double CalcularImposto() {

        return this.valor * TAXA_IMPOSTO;
    }

}
