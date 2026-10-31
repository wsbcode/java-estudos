package aOrientacaoObjetos.Hassociacao.test;

// Importa as classes Jogador e Time para podermos utilizá-las aqui no teste
import aOrientacaoObjetos.Hassociacao.domin.Jogador;
import aOrientacaoObjetos.Hassociacao.domin.Time;

public class JogadorTST02 {
    // Método principal onde o programa começa a rodar
    public static void main(String[] args) {

        // Cria o primeiro jogador chamado "Rafael Veiga"
        Jogador jogador1 = new Jogador("Rafael Veiga");

        // Cria o segundo jogador chamado "Ronaldo"
        Jogador jogador2 = new Jogador("Ronaldo");

        // Cria um objeto Time chamado "Palmeiras"
        Time time = new Time("Palmeiras");

        // Associa o time "Palmeiras" apenas ao jogador1 usando o método 'setTime'
        jogador1.setTime(time);

        // Imprime as informações do jogador1 (vai mostrar o nome e o time "Palmeiras")
        jogador1.imprimir();

        // Imprime as informações do jogador2 (vai mostrar apenas o nome, pois ele não tem time associado)
        jogador2.imprimir();
    }
}