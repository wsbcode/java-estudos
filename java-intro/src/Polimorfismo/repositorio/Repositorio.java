package Polimorfismo.repositorio;

// // Contrato central: define O QUE deve ser feito, mas não COMO
public interface Repositorio {
    // // Quem assinar essa interface É OBRIGADO a implementar o método salvar
    public abstract void salvar();
}