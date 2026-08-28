package Enumeracao.dominio;

public class TipoDePagamento {
    private String nome;
    private PagamentoEnum pagamento;
    private PagamentoDesconto pagamentoDesconto;


    public TipoDePagamento(String nome, PagamentoEnum pagamento) {
        this.nome = nome;
        this.pagamento = pagamento;

    }

    public TipoDePagamento(PagamentoDesconto pagamentoDesconto) {
        this.pagamentoDesconto = pagamentoDesconto;
    }

    @Override
    public String toString() {
        return "TipoDePagamento{" +
                "nome='" + nome + '\'' +
                ", pagamento=" + pagamento.getID() +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PagamentoEnum getPagamento() {
        return pagamento;
    }

    public void setPagamento(PagamentoEnum pagamento) {
        this.pagamento = pagamento;
    }

    public PagamentoDesconto getPagamentoDesconto() {
        return pagamentoDesconto;
    }

    public void setPagamentoDesconto(PagamentoDesconto pagamentoDesconto) {
        this.pagamentoDesconto = pagamentoDesconto;
    }
}
