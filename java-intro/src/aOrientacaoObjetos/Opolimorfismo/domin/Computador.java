package aOrientacaoObjetos.Opolimorfismo.domin;

// Define a classe 'Computador' que herda da classe abstrata 'Produto' (e indiretamente cumpre o contrato de 'Taxavel')
public class Computador extends Produto {

    // Constante estática e final ('public static final'): define a taxa de imposto fixa de 25% (0.25) para computadores
    public static final double TAXA_IMPOSTO = 0.25;

    // Construtor: recebe o nome e o valor e os repassa para o construtor da classe pai usando 'super(nome, valor)'
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    // Sobrescreve o método 'CalcularImposto()' exigido pela interface Taxavel (através da classe Produto).
    // Aqui calculamos o valor do imposto multiplicando o valor do produto pela taxa de 25%.
    @Override
    public double CalcularImposto() {
        return this.valor * TAXA_IMPOSTO;
    }
}