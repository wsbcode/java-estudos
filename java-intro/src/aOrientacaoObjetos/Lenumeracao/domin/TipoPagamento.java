package aOrientacaoObjetos.Lenumeracao.domin;

// Define um Enum chamado 'TipoPagamento' (conjunto fixo de constantes para os tipos de pagamento)
public enum TipoPagamento {

    // Constante DEBITO: representa pagamento no débito.
    // Sobrescreve o método abstrato para calcular um desconto de 10% (multiplica por 0.1).
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },

    // Constante CREDITO: representa pagamento no crédito.
    // Sobrescreve o método abstrato para calcular um desconto de 50% (multiplica por 0.5).
    CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.5;
        }
    };

    // Método abstrato: obriga todas as constantes do Enum a criarem (sobrescreverem) sua própria versão
    // de como o cálculo do desconto deve funcionar.
    public abstract double calcularDesconto(double valor);
}