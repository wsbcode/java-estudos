package modificadorfinal.dominio;

public class Carro {
    private String marca;
    public static final double TAXA_DE_JUROS = 100;
    public final Comprador COMPRADOR = new Comprador();


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTAXA_DE_JUROS() {
        return TAXA_DE_JUROS;
    }
}
