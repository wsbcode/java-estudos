package aOrientacaoObjetos.Hassociacao.test;

// Importa a classe Jogador para podermos criar os jogadores aqui no teste
import aOrientacaoObjetos.Hassociacao.domin.Jogador;

public class JogadorTST01 {
    // Método principal onde o programa começa a rodar
    public static void main(String[] args) {

        // Cria três objetos diferentes do tipo Jogador com seus respectivos nomes
        Jogador jogador1 = new Jogador("Gustavo Gomes");
        Jogador jogador2 = new Jogador("Flaco Lopes");
        Jogador jogador3 = new Jogador("Giay");

        // Cria um array (uma lista) guardando esses três jogadores juntos
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        // Percorre a lista de jogadores usando o laço 'for' (para cada jogador na lista de jogadores)
        for (Jogador jogador : jogadores) {
            // Chama o método imprimir de cada jogador para mostrar o nome e o time (se houver)
            jogador.imprimir();
        }
    }
}