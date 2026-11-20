package Cexecoes.Aexecoes.exeption.domin;

// Importa 'Closeable' e 'IOException' do pacote java.io para trabalhar com fechamento de recursos
import java.io.Closeable;
import java.io.IOException;

// Define a classe 'Leitor2' implementando 'Closeable' para que ela também possa ser fechada
// (inclusive de forma automática dentro de um bloco try-with-resources)
public class Leitor2 implements Closeable {

    // Implementa o método 'close()' exigido por 'Closeable'.
    // 'throws IOException' avisa que pode ocorrer um erro de entrada/saída ao fechar este leitor.
    public void close() throws IOException {
        // Imprime no console indicando que o Leitor2 foi fechado
        System.out.println("Leitor2 close");
    }
}