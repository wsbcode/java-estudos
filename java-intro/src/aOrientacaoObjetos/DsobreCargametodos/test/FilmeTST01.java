package aOrientacaoObjetos.DsobreCargametodos.test;

// Importa a classe Filme para podermos utilizá-la aqui no teste
import aOrientacaoObjetos.DsobreCargametodos.domin.Filme;

public class FilmeTST01 {
    // Método principal onde a execução do programa começa
    public static void main(String[] args) {

        // Cria um novo objeto do tipo Filme na memória
        Filme filme = new Filme();

        // Chama o primeiro método 'init' (preenche nome, tipo e episódios)
        filme.init("Sexto Sentido", "Suspense", 10);

        // Chama o segundo método 'init' (sobrecarregado, que recebe também o ano de lançamento)
        // Isso vai sobrescrever/atualizar os dados incluindo o ano (1992)
        filme.init("Sexto Sentido", "Suspense", 10, 1992);

        // Chama o método para imprimir todos os dados preenchidos no console
        filme.imprimir();
    }
}