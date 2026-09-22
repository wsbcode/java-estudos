package Enumeracao.dominio;

// // Enumeração que associa o tipo de pagamento a um ID numérico
public enum PagamentoEnum {
    // // Constantes passando o valor do ID para o construtor
    DEBITO(1),
    CREDITO(2);

    // // Atributo final para guardar o ID de forma imutável
    private final int ID;

    // // Construtor do Enum (é privado por padrão no Java)
    PagamentoEnum(int identificadoro) {
        this.ID = identificadoro;
    }

    // // Getter para consultar o valor do ID
    public int getID() {
        return ID;
    }
}