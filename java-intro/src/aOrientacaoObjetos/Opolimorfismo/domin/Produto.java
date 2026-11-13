package aOrientacaoObjetos.Opolimorfismo.domin;

// Define a classe abstrata 'Produto' que implementa a interface 'Taxavel'.
// Como é uma classe abstrata, ela serve de modelo base e não pode ser instanciada diretamente com 'new Produto(...)'.
public abstract class Produto implements Taxavel {

    // Atributos protegidos: nome e valor do produto, acessíveis pelas classes filhas
    protected String nome;
    protected double valor;

    // Construtor: exige que sejam informados o nome e o valor ao criar qualquer produto filho
    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    // Método 'getNome' (getter): pega/consulta o nome do produto
    public String getNome() {
        return nome;
    }

    // Método 'getValor' (getter): pega/consulta o valor do produto
    public double getValor() {
        return valor;
    }
}