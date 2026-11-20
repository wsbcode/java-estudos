package Cexecoes.Aexecoes.exeption.domin;

// Importa 'Closeable' e 'IOException' do pacote java.io para trabalhar com fechamento de recursos (como leitores/arquivos).
import java.io.Closeable;
import java.io.IOException;

// Define a classe 'Leitor1' que implementa a interface 'Closeable'.
// Implementar 'Closeable' significa que este objeto sabe se fechar sozinho e pode ser usado dentro de um 'try-with-resources'.
public class Leitor1 implements Closeable {

    // Implementa o método 'close()' exigido por 'Closeable'.
    // O 'throws IOException' avisa que pode ocorrer um erro de entrada/saída na hora de fechar o recurso.
    public void close() throws IOException {
        // Exibe no console que o Leitor1 foi fechado
        System.out.println("Leitor1 close");
    }
}