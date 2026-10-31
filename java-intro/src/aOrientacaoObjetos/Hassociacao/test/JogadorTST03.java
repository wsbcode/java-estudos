package aOrientacaoObjetos.Hassociacao.test;

// Importa as classes Jogador e Time para podermos utilizá-las aqui no teste
import aOrientacaoObjetos.Hassociacao.domin.Jogador;
import aOrientacaoObjetos.Hassociacao.domin.Time;

public class JogadorTST03 {
    // Método principal onde o programa começa a rodar
    public static void main(String[] args) {

        // Cria um objeto Jogador com o nome "Jogador 1"
        Jogador jogador = new Jogador("Jogador 1");

        // Cria um objeto Time com o nome "Palmeiras"
        Time time = new Time("Palmeiras");

        // Cria um array (uma lista) contendo apenas esse jogador
        Jogador[] jogadores = {jogador};

        // Associa o time criado ao jogador (o jogador agora sabe qual é o seu time)
        jogador.setTime(time);

        // Associa a lista de jogadores ao time (o time agora sabe quem são seus jogadores)
        // Isso cria uma associação bidirecional (ambos apontam um para o outro)
        time.setJogadores(jogadores);

        // Imprime uma linha separadora para organizar a visualização
        System.out.println("---- Jogador ----");

        // Imprime os dados do jogador (mostra o nome do jogador e o nome do seu time)
        jogador.imprimir();

        // Imprime uma linha separadora para organizar a visualização
        System.out.println("---- Time ----");

        // Imprime os dados do time (mostra o nome do time e lista os jogadores que pertencem a ele)
        time.imprimir();
    }
}