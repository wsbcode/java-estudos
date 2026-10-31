package aOrientacaoObjetos.Hassociacao.test;

// Importa as classes Escola e Professor para podermos utilizá-las aqui no teste
import aOrientacaoObjetos.Hassociacao.domin.Escola;
import aOrientacaoObjetos.Hassociacao.domin.Professor;

public class EscolaTST01 {
    // Método principal onde o programa começa a rodar
    public static void main(String[] args) {

        // Cria o primeiro objeto Professor chamado "Abel Ferreira"
        Professor professor = new Professor("Abel Ferreira");

        // Cria o segundo objeto Professor chamado "Andrey Celoba"
        Professor professor1 = new Professor("Andrey Celoba");

        // Cria um array (uma lista) contendo os dois professores criados acima
        Professor[] professores = {professor, professor1};

        // Cria um objeto Escola chamado "Palmeiras" e já passa a lista de professores para ele no construtor
        Escola escola = new Escola("Palmeiras", professores);

        // Chama o método imprimir da escola para mostrar o nome dela e listar todos os professores cadastrados
        escola.imprimir();
    }
}