package Polimorfismo.test;

import Polimorfismo.dominio.Televisao;
import Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTST02 {
    public static void main(String[] args) {
        Televisao televisao = new Televisao("LG" , 2000);

        CalculadoraImposto.calcularImposto(televisao);

    }
}
