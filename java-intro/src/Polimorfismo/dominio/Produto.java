package Polimorfismo.dominio;

// // Classe genérica que serve de modelo e ASSINA o contrato 'Taxavel'
public abstract class Produto implements Taxavel {

    // // Atributos protegidos: as classes filhas (Tomate, TV, Computador) têm acesso
    protected String nome;
    protected double valor;

    // // Construtor para passar o nome e o valor do produto
    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    // // Getters e Setters normais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}