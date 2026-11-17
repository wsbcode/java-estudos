package Cexecoes.Aexecoes.exeption.test;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;

public class ExeptionTST02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
//        deleteArquivo();

    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivos\\teste.txt");

        try {
            boolean Iscriado = file.createNewFile();
            System.out.println("Arquivo criado com sucesso " + Iscriado);

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }

    }


    private static void deleteArquivo() {
        File file = new File("arquivos\\test.txt");

        try {
            boolean Iscriado = file.delete();
            System.out.println("Arquivo deletado com sucesso");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}