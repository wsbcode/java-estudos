package AorientacaoObjetos.Opolimorfismo.teste;

import AorientacaoObjetos.Opolimorfismo.domin.Computador;
import AorientacaoObjetos.Opolimorfismo.domin.PlayStation;
import AorientacaoObjetos.Opolimorfismo.domin.Produto;

public class ProdutoTST02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Intel i9", 10000);
        System.out.println("Computador: " + produto1.getNome());
        System.out.println("Valor: " + produto1.getValor());
        System.out.println(produto1.CalcularImposto());

        System.out.println("---------------");

        Produto produto2 =new PlayStation("Super Nintendo", 5000);
        System.out.println("Video Game: " + produto2.getNome());
        System.out.println("Valor: " + produto2.getValor());
        System.out.println(produto2.CalcularImposto());
    }
}
