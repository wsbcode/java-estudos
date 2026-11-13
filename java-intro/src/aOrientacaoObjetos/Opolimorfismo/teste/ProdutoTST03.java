package aOrientacaoObjetos.Opolimorfismo.teste;

import aOrientacaoObjetos.Bmetodos.domin.Calculadora;
import aOrientacaoObjetos.Opolimorfismo.domin.Computador;
import aOrientacaoObjetos.Opolimorfismo.domin.Moto;
import aOrientacaoObjetos.Opolimorfismo.domin.PlayStation;
import aOrientacaoObjetos.Opolimorfismo.domin.Produto;
import aOrientacaoObjetos.Opolimorfismo.servico.CalculadoraImposto;

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
