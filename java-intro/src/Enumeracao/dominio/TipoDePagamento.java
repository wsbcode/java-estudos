package Enumeracao.dominio;

// // Classe que representa um Tipo de Pagamento no sistema
public class TipoDePagamento {
    // // Atributos para armazenar o nome, o tipo de pagamento e o desconto
    private String nome;
    private PagamentoEnum pagamento;
    private PagamentoDesconto pagamentoDesconto;

    // // Construtor para inicializar com nome e o tipo de pagamento (Enum)
    public TipoDePagamento(String nome, PagamentoEnum pagamento) {
        this.nome = nome;
        this.pagamento = pagamento;
    }

    // // Construtor sobrecarregado para inicializar apenas com o desconto
    public TipoDePagamento(PagamentoDesconto pagamentoDesconto) {
        this.pagamentoDesconto = pagamentoDesconto;
    }

    // // Sobrescreve o toString() para exibir o nome e o ID do pagamento formatados
    @Override
    public String toString() {
        return "TipoDePagamento{" +
                "nome='" + nome + '\'' +
                ", pagamento=" + pagamento.getID() +
                '}';
    }

    // // Getter para ler o nome
    public String getNome() {
        return nome;
    }

    // // Setter para alterar o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // // Getter para ler o tipo de pagamento
    public PagamentoEnum getPagamento() {
        return pagamento;
    }

    // // Setter para alterar o tipo de pagamento
    public void setPagamento(PagamentoEnum pagamento) {
        this.pagamento = pagamento;
    }

    // // Getter para ler o desconto do pagamento
    public PagamentoDesconto getPagamentoDesconto() {
        return pagamentoDesconto;
    }

    // // Setter para alterar o desconto do pagamento
    public void setPagamentoDesconto(PagamentoDesconto pagamentoDesconto) {
        this.pagamentoDesconto = pagamentoDesconto;
    }
}