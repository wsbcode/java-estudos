package aOrientacaoObjetos.Opolimorfismo.domin;

// Define a classe 'PlayStation' que herda da classe abstrata 'Produto' (cumprindo também o contrato da interface 'Taxavel')
public class PlayStation extends Produto {

    // Constante estática e final ('public static final'): define a taxa de imposto fixa de 20% (0.2) para o PlayStation
    public static final double TAXA_IMPOSTO = 0.2;

    // Construtor: recebe o nome e o valor e os repassa para o construtor da classe pai usando 'super(nome, valor)'
    public PlayStation(String nome, double valor) {
        super(nome, valor);
    }

    // Sobrescreve o método 'CalcularImposto()' exigido pelo contrato de 'Taxavel'.
    // Aqui calculamos o imposto multiplicando o valor do produto pela taxa de 20%.
    @Override
    public double CalcularImposto() {
        return this.valor * TAXA_IMPOSTO;
    }

}