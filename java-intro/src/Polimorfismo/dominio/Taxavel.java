package Polimorfismo.dominio;

// // Interface é um contrato: obriga qualquer classe a ter este método
public interface Taxavel {
    // // Quem assinar este contrato DEVE criar o método de calcular imposto
    public abstract double calcularImposto();
}