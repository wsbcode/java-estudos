package aOrientacaoObjetos.Hassociacao.test;

import aOrientacaoObjetos.Hassociacao.domin.Jogador;
import aOrientacaoObjetos.Hassociacao.domin.Time;

public class JogadorTST02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Rafael Veiga");
        Jogador jogador2 = new Jogador("Ronaldo");
        Time time = new Time("Palmeiras");

        jogador1.setTime(time);


        jogador1.imprimir();
        jogador2.imprimir();
    }
}
