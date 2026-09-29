package Polimorfismo.test;

import Polimorfismo.dominio.Televisao;
import Polimorfismo.dominio.Tomate;
import Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTST03 {
    public static void main(String[] args) {
        Televisao televisao = new Televisao("LG" , 2000);
        Tomate tomate = new Tomate("Tomate Redondo", 1500);
        tomate.setDataValidade("11/11/11");

        CalculadoraImposto.calcularImposto(tomate);

    }
}
