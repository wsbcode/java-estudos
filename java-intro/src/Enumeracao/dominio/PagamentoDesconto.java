package Enumeracao.dominio;

// // Enumeração que define os tipos de desconto e suas regras de cálculo
public enum PagamentoDesconto {
    // // Opção de débito: sobrescreve o método para dar 50% de desconto
    DEBITO_DESCONTO{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.5;
        }
    },
    // // Opção de crédito: sobrescreve o método para dar 10% de desconto
    CREDITO_DESCONTO{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.1;
        }
    };

    // // Método genérico padrão que será sobresrito por cada opção do Enum acima
    public double calcularDesconto(double valor) {
        return 0;
    }
}