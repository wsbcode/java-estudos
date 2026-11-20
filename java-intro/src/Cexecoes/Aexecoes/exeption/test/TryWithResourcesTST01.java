package Cexecoes.Aexecoes.exeption.test;

// Importa as classes que implementam Closeable criadas no pacote domin
import Cexecoes.Aexecoes.exeption.domin.Leitor1;
import Cexecoes.Aexecoes.exeption.domin.Leitor2;

// Importa classes de entrada/saída de arquivos (BufferedReader, FileReader, Reader, IOException, FileNotFoundException)
import java.io.*;

public class TryWithResourcesTST01 {

    // Método principal: chama apenas lerArquivo() (que usa try-with-resources)
    public static void main(String[] args) {
        lerArquivo();
    }

    // Jeito moderno e limpo: try-with-resources
    public static void lerArquivo() {
        // Declara os recursos dentro dos parênteses do try (...).
        // O Java fecha 'leitor1' e 'leitor2' automaticamente ao sair do bloco, na ordem inversa (primeiro leitor2, depois leitor1).
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

            // Corpo do try: aqui ficaria o código usando leitor1 e leitor2

            // Captura IOException caso ocorra erro ao abrir, usar ou fechar os recursos
        } catch (IOException e) {
            // Dica: costuma ser bom colocar e.printStackTrace() aqui para não esconder erros na tela
        }
    }

    // Jeito tradicional/antigo: fechando manualmente dentro de 'finally'
    public static void lerArquivo2() {
        // Declara o reader fora do try para conseguir acessá-lo no bloco finally
        Reader reader = null;
        try {
            // Abre o arquivo "teste.txt" para leitura
            reader = new BufferedReader(new FileReader("teste.txt"));
            // Captura erro caso o arquivo "teste.txt" não exista
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // O bloco 'finally' sempre roda no final, dê erro ou não
        } finally {
            // Precisa de outro try/catch porque o próprio método close() pode lançar IOException
            try {
                // Só tenta fechar se o 'reader' chegou a ser criado (evita NullPointerException)
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}