package aOrientacaoObjetos.Opolimorfismo.servico;

import aOrientacaoObjetos.Opolimorfismo.domin.Computador;
import aOrientacaoObjetos.Opolimorfismo.domin.PlayStation;

public class CalculadoraImposto {
    public static void calcularImportoComputador(Computador computador) {
        System.out.println("Calculando Imposto do Computador");
        double imposto = computador.CalcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto do Computador: " + imposto);


    }

    public static void calcularImportoPlayStation(PlayStation playStation) {
        System.out.println("Calculando Imposto do PlayStation");
        double imposto = playStation.CalcularImposto();
        System.out.println("PlayStation: " + playStation.getNome());
        System.out.println("Valor: " + playStation.getValor());
        System.out.println("Imposto do PlayStation: " + imposto);


    }
}
