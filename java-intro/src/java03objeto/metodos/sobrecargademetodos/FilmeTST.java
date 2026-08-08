package java03objeto.metodos.sobrecargademetodos;

public class FilmeTST {
    public static void main(String[] args) {
        // // Cria o primeiro objeto Filme na memória
        Filme primeiroFilme = new Filme();
        // // Cria o segundo objeto Filme na memória
        Filme segundoFilme = new Filme();

        // // Executa o init com 4 parâmetros (usando a versão sobrecarregada)
        primeiroFilme.init("Sexto Sentido", 1999 , "Mistério",10.0);
        // // Executa o init com 3 parâmetros (usando a versão simples)
        segundoFilme.init("A entidade" ,2012 , "Terror" );

        // // Exibe os dados do primeiro filme no console
        primeiroFilme.imprimeFilme();
        // // Exibe os dados do segundo filme no console
        segundoFilme.imprimeFilme();
    }
}