package AorientacaoObjetos.Opolimorfismo.teste;

import AorientacaoObjetos.Opolimorfismo.domin.Computador;
import AorientacaoObjetos.Opolimorfismo.domin.Moto;
import AorientacaoObjetos.Opolimorfismo.domin.PlayStation;
import AorientacaoObjetos.Opolimorfismo.servico.CalculadoraImposto;

public class ProdutoTST03 {
    public static void main(String[] args) {
        Computador computador = new Computador("AMD-56000", 10000);
        PlayStation playStation = new PlayStation("X-box", 5000);
        Moto moto = new Moto("Suzuki", 50000);
        moto.setAno(2018);

        CalculadoraImposto.calcularImporto(computador);
        System.out.println("____________________________________");
        CalculadoraImposto.calcularImporto(playStation);
        System.out.println("____________________________________");
        CalculadoraImposto.calcularImporto(moto);

    }
}
