package aOrientacaoObjetos.GmodificadorStatic.test;

// Importa a classe Carro para podermos criar os carros aqui no teste

import aOrientacaoObjetos.GmodificadorStatic.domin.Carro;

public class CarroTST01 {
    // Método principal onde o programa começa a rodar
    public static void main(String[] args) {

        // Cria três objetos diferentes do tipo Carro com seus respectivos nomes e velocidades máximas
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("Audi", 390);

        // Chama o método estático 'setVelocidadeLimite' diretamente na classe Carro,
        // alterando o limite de velocidade compartilhado para 500 para todos os carros de uma vez.
        Carro.setVelocidadeLimite(500);
        // Imprime as informações do primeiro carro (BMW)
        carro1.imprimir();

        // Imprime as informações do segundo carro (Mercedes)
        carro2.imprimir();

        // Imprime as informações do segundo carro novamente (Mercedes)
        carro2.imprimir();
    }
}