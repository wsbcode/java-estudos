package aOrientacaoObjetos.Hassociacao.test;

import aOrientacaoObjetos.Hassociacao.domin.Jogador;

public class JogadorTST01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Gustavo Gomes");
        Jogador jogador2 = new Jogador("Flaco Lopes");
        Jogador jogador3 = new Jogador("Giay");
        Jogador[] jogadores = {jogador1,jogador2,jogador3};

        for ( Jogador jogador : jogadores ) {
            jogador.imprimir();
        }
    }
}
