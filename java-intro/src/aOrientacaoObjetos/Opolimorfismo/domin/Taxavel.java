package aOrientacaoObjetos.Opolimorfismo.domin;

// Define uma interface chamada 'Taxavel' (contrato para itens que calculam imposto).
// Qualquer classe que implementar esta interface assume a responsabilidade de saber calcular o seu próprio imposto.
public interface Taxavel {

    // Método abstrato ('public abstract'): obriga todas as classes que implementarem este contrato
    // a fornecerem o código de cálculo de imposto através do método 'CalcularImposto()'.
    public abstract double CalcularImposto();
}