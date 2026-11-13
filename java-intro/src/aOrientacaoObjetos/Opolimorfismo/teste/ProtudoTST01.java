package aOrientacaoObjetos.Opolimorfismo.teste;

import aOrientacaoObjetos.Opolimorfismo.domin.Computador;
import aOrientacaoObjetos.Opolimorfismo.domin.Moto;
import aOrientacaoObjetos.Opolimorfismo.domin.PlayStation;
import aOrientacaoObjetos.Opolimorfismo.servico.CalculadoraImposto;

public class ProtudoTST01 {
    public static void main(String[] args) {
        Computador computador = new Computador("AMD-56000", 10000);
        PlayStation playStation = new PlayStation("X-box", 5000);
        Moto moto = new Moto("Suzuki", 50000);

        CalculadoraImposto.calcularImporto(computador);
        System.out.println("____________________________________");
        CalculadoraImposto.calcularImporto(playStation);
        System.out.println("____________________________________");
        CalculadoraImposto.calcularImporto(moto);

    }
}
