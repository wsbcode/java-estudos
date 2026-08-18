package modificadorStatico.test;

import modificadorStatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        // // Cria 3 objetos 'Carro' diferentes na memória
        // // Cada um terá seu próprio nome e sua própria velocidade máxima
        Carro c1 = new Carro("Celta", 1000);
        Carro c2 = new Carro("Gol", 200);
        Carro c3 = new Carro("MBW", 500);

        // // Altera a velocidade limite usando o MÉTODOS ESTÁTICO direto pela Classe.
        // // Essa alteração afeta o c1, c2 e c3 de uma só vez, pois a variável é compartilhada!
        Carro.setVelocidadeLimite(560);

        // // Imprime os dados de cada carro no console
        // // Todos os três vão exibir 'Velocidade-Limite 560'
        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
    }
}