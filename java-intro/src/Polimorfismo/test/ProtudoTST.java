package Polimorfismo.test;

import Polimorfismo.dominio.Computador;
import Polimorfismo.dominio.Televisao;
import Polimorfismo.dominio.Tomate;
import Polimorfismo.servico.CalculadoraImposto;

public class ProtudoTST {
    public static void main(String[] args) {
        Computador computador = new Computador("AMD Raze", 10000);
        Tomate tomate = new Tomate("Tomate Redondo", 10);
        Televisao televisao = new Televisao("Televisao LG", 1500 );

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("________________________________");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("_______________________________");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
