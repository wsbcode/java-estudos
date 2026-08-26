package modificadorfinal.dominio;

public class CarroTST {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(carro.TAXA_DE_JUROS);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("João");;
        System.out.println(carro.COMPRADOR);
    }
}
