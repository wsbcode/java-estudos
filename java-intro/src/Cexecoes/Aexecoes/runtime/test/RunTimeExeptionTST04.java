package Cexecoes.Aexecoes.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLDataException;

public class RunTimeExeptionTST04 {
    public static void main(String[] args) {

        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceExepion();
        } catch (SQLDataException | FileNotFoundException e) {

        }
    }

    private static void talvezLanceExepion() throws SQLDataException, FileNotFoundException {
    }
}
