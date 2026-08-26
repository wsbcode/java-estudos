package modificadorfinal.dominio;

// // Classe de teste com o método main
public class CarroTST {
    public static void main(String[] args) {
        // // Instancia o objeto Carro
        Carro carro = new Carro();

        // // Imprime o comprador inicial (nome ainda é null)
        System.out.println(carro.COMPRADOR);

        // // Altera os dados internos do comprador (o objeto aceita mudanças nos atributos dele)
        carro.COMPRADOR.setNome("João");

        // // Imprime a constante da taxa de juros
        System.out.println(carro.TAXA_DE_JUROS);

        // // Imprime o comprador atualizado (nome agora é "João")
        System.out.println(carro.COMPRADOR);
    }
}