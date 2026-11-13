package aOrientacaoObjetos.Opolimorfismo.domin;

// Define a classe 'Moto' que herda da classe abstrata 'Produto' (cumprindo também o contrato da interface 'Taxavel')
public class Moto extends Produto {

    // Constante estática e final ('public static final'): define a taxa de imposto fixa de 45% (0.45) para motos
    public static final double TAXA_IMPOSTO = 0.45;

    // Atributo privado: armazena o ano de fabricação da moto
    private int ano;

    // Construtor: recebe o nome e o valor e os repassa para o construtor da classe pai usando 'super(nome, valor)'
    public Moto(String nome, double valor) {
        super(nome, valor);
    }

    // Sobrescreve o método 'CalcularImposto()' exigido pelo contrato de 'Taxavel'.
    // Aqui calculamos o imposto multiplicando o valor da moto pela taxa de 45%.
    @Override
    public double CalcularImposto() {
        return this.valor * TAXA_IMPOSTO;
    }

    // Método 'getAno' (getter): pega/consulta o ano da moto
    public int getAno() {
        return ano;
    }

    // Método 'setAno' (setter): altera ou define o ano da moto
    public void setAno(int ano) {
        this.ano = ano;
    }
}