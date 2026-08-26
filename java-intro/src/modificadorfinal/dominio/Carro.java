package modificadorfinal.dominio;

// // Classe que representa um Carro no sistema
public class Carro {
    // // Atributo normal (pode ser alterado via setter)
    private String marca;

    // // Constante estática: pertence à classe e o valor 100 nunca mudará
    public static final double TAXA_DE_JUROS = 100;

    // // Referência de objeto final: a variável COMPRADOR sempre apontará para este mesmo objeto na memória
    public final Comprador COMPRADOR = new Comprador();

    // // Getter para ler a marca
    public String getMarca() {
        return marca;
    }

    // // Setter para alterar a marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // // Getter para ler a taxa de juros (não há setter por ser final)
    public double getTAXA_DE_JUROS() {
        return TAXA_DE_JUROS;
    }
}