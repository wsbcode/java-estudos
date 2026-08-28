package Enumeracao.test;

import Enumeracao.dominio.PagamentoEnum;
import Enumeracao.dominio.TipoDePagamento;

public class TipoDePagamentoTST {
    public static void main(String[] args) {

        TipoDePagamento tipoDePagamento2 = new TipoDePagamento("João", PagamentoEnum.DEBITO);
        TipoDePagamento tipoDePagamento3 = new TipoDePagamento("Maria", PagamentoEnum.CREDITO);




        System.out.println(tipoDePagamento2.toString());
        System.out.println(tipoDePagamento3.toString());


    }
}
