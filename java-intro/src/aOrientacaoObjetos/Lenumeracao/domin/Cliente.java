package aOrientacaoObjetos.Lenumeracao.domin;

// Define a classe Cliente (molde para criar objetos do tipo cliente)
public class Cliente {

    // Atributos privados: o nome do cliente, o tipo de cliente e o tipo de pagamento (ambos usando Enums)
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    // Construtor: exige que você informe o nome, o tipo de cliente e o tipo de pagamento ao criar o cliente
    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    // Anotação '@Override': sobrescreve o método 'toString' para exibir os dados do cliente de forma organizada quando o objeto for impresso
    @Override
    public String toString() {
        return "Cliente{" +
                "nome = " + nome + '\'' +
                // Pega o nome descritivo do relatório vindo do Enum TipoCliente
                " tipoCliente = " + tipoCliente.getNomeRelatorio() +
                // Pega o valor numérico vindo do Enum TipoCliente
                " tipoCliente = " + tipoCliente.getVALOR() +
                // Exibe o tipo de pagamento escolhido
                " tipoPagamento = " + tipoPagamento +
                '}';
    }

    // Método 'getNome' (getter): pega/consulta o nome do cliente
    public String getNome() {
        return nome;
    }

    // Método 'setNome' (setter): altera ou define o nome do cliente
    public void setNome(String nome) {
        this.nome = nome;
    }
}