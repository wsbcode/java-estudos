package aOrientacaoObjetos.Opolimorfismo.servico;

// Importa as classes de domínio necessárias para que a calculadora saiba lidar com os produtos
import aOrientacaoObjetos.Opolimorfismo.domin.Computador;
import aOrientacaoObjetos.Opolimorfismo.domin.Moto;
import aOrientacaoObjetos.Opolimorfismo.domin.PlayStation;
import aOrientacaoObjetos.Opolimorfismo.domin.Produto;

public class CalculadoraImposto {

    // Método estático 'calcularImporto': recebe um objeto do tipo 'Produto' (Polimorfismo!).
    // Graças ao polimorfismo, qualquer classe filha (Computador, Moto, PlayStation) pode ser passada aqui sem precisar de um método separado para cada uma.
    public static void calcularImporto(Produto produto) {
        System.out.println("Calculando Imposto " + produto.getNome());

        // Chama o método 'CalcularImposto()' de forma polimórfica.
        // O Java descobre sozinho qual versão executar (seja a do Computador, da Moto ou do PlayStation) dependendo do objeto real enviado.
        double imposto = produto.CalcularImposto();

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto do Produto: " + imposto);

        // Verifica se o produto recebido é, na verdade, uma instância da classe 'Moto' usando o operador 'instanceof'
        if (produto instanceof Moto) {
            // Se for uma Moto, faz um "downcasting" ((Moto) produto) para conseguir acessar métodos exclusivos de Moto, como o 'getAno()'.
            int ano = ((Moto) produto).getAno();
            System.out.println("Ano: " + ano);
        }

    }
}