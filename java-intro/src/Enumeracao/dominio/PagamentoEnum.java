package Enumeracao.dominio;

public enum PagamentoEnum {
    DEBITO(1),
    CREDITO(2);

    private final int ID;
    PagamentoEnum(int identificadoro) {
        this.ID = identificadoro;

    }

    public int getID() {
        return ID;
    }
}
