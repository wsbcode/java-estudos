package aOrientacaoObjetos.KmodificadorFinal.test;

// Importa as classes Carro e Comprador para podermos testar o modificador final
import aOrientacaoObjetos.KmodificadorFinal.domin.Carro;
import aOrientacaoObjetos.KmodificadorFinal.domin.Comprador;

public class CarroTST01 {
    // Método principal onde o programa começa a rodar
    public static void main(String[] args) {

        // Cria um objeto Carro e um objeto Comprador
        Carro carro = new Carro();
        Comprador comprador1 = new Comprador();

        // Imprime a constante 'VELOCIDADE_LIMITE' diretamente da classe Carro (não precisa de objeto por causa do 'static')
        System.out.println(Carro.VELOCIDADE_LIMITE);

        // Imprime o nome do comprador associado ao carro (como nenhum nome foi definido ainda, vai imprimir 'null')
        System.out.println(carro.COMPRADOR.getNome());

        // Altera o nome do comprador que está dentro do objeto final do carro para "Comprador"
        // (Isso é permitido porque o modificador 'final' na referência impede apenas que a variável aponte para outro objeto, mas deixa alterar os dados internos dele)
        carro.COMPRADOR.setNome("Comprador");

        // Imprime o novo nome do comprador agora atualizado
        System.out.println(carro.COMPRADOR.getNome());
    }
}