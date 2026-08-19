package associacao.test;

import associacao.dominio.Jogador;

// // Lembrete: Troque por "import associacao.dominio.Time;" para usar o seu Time
import java.sql.Time;

public class JogadorTest {
    public static void main(String[] args) {
        // // 1. Cria 3 objetos de jogadores independentes (sem time)
        Jogador jogador1 = new Jogador("Marivaldo");
        Jogador jogador2 = new Jogador("Arlindo");
        Jogador jogador3 = new Jogador("Raimundo");

        // // 2. Agrupa os objetos num Array de Jogadores
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        // // 3. Percorre o array e chama o método imprimir de cada jogador
        for (Jogador jogador : jogadores)
            jogador.imprimir();
    }
}