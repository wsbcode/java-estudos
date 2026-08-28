package Enumeracao.dominio;

public enum PagamentoDesconto {
    DEBITO_DESCONTO{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.5;
        }
    },
    CREDITO_DESCONTO{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.1;
        }
    };

    public double calcularDesconto(double valor) {
        return 0;
    }
}
