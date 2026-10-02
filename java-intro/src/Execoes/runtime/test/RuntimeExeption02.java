package Execoes.runtime.test;

public class RuntimeExeption02 {
    public static void main(String[] args) {
        System.out.println("--- Início do Processamento ---");

        try {
            System.out.println("1. [TRY] Abrindo o arquivo e tentando ler os dados...");

            // Simulando um erro (divisão por zero)
            int contaComErro = 10 / 0;

            System.out.println("Esta linha não será executada se houver erro acima.");

        } catch (ArithmeticException e) {
            // Esse bloco só executa se acontecer o erro no try
            System.out.println("2. [CATCH] Erro capturado! Tratando o problema com uma mensagem amigável.");

        } finally {
            // Este bloco EXECUTA SEMPRE no final
            System.out.println("3. [FINALLY] Fechando o arquivo de forma segura para liberar memória.");
        }

        System.out.println("--- Fim do Processamento (Programa continua rodando) ---");
    }
}

