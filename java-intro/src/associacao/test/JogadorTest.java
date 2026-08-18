package associacao.test;

import associacao.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Marivaldo");
        Jogador jogador2 = new Jogador("Arlindo");
        Jogador jogador3 = new Jogador("Raimundo");

         Jogador[] jogadores ={jogador1,jogador2,jogador3};

        for (Jogador jogador : jogadores)
            jogador.imprimir();


    }

}
