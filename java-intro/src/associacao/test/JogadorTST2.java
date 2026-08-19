package associacao.test;

import associacao.dominio.Jogador;
import associacao.dominio.Time;

public class JogadorTST2 {
    public static void main(String[] args) {
        // // 1. Cria o jogador ("Flaco Lopez")
        Jogador jogador1 = new Jogador("Flaco Lopez");

        // // 2. Cria o time ("Palmeiras")
        Time time = new Time("Palmeiras");

        // // 3. ASSOCIAÇÃO: Passa o objeto 'time' para dentro do 'jogador1'
        jogador1.setTime(time);

        // // 4. Imprime o jogador (que agora vai mostrar o nome do time associado)
        jogador1.imprimir();
    }
}