package Cexecoes.Aexecoes.runtime.test;

// Importa exceções específicas de arquivo e de banco de dados (SQL)
import java.io.FileNotFoundException;
import java.sql.SQLDataException;

public class RunTimeExeptionTST04 {

    public static void main(String[] args) {

        try {
            // Lança propositalmente uma 'RuntimeException' genérica para testar a ordem dos blocos 'catch'
            throw new RuntimeException();
            // Como o erro lançado é 'RuntimeException' (e não um dos filhos mais específicos abaixo), ele pula estes três:
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
            // Cai aqui porque 'RuntimeException' corresponde ao erro lançado.
            // Regra de ouro: se colocássemos 'RuntimeException' em cima, ele pegaria tudo antes dos específicos!
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            // Chama o método auxiliar que avisa ('throws') poder lançar dois tipos de erro
            talvezLanceExepion();
            // Multi-catch ('|'): captura 'SQLDataException' OU 'FileNotFoundException' no mesmo bloco 'catch'
        } catch (SQLDataException | FileNotFoundException e) {
            // Dica: costuma ser útil tratar ou registrar o erro aqui (ex.: e.printStackTrace())
        }
    }

    // Método auxiliar que declara poder lançar tanto SQLDataException quanto FileNotFoundException
    private static void talvezLanceExepion() throws SQLDataException, FileNotFoundException {
    }
}