package aOrientacaoObjetos.Pexecoes.exeption.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExeptionTST01 {
    public static void main(String[] args) {
        criarNovoArquivo();
//        deleteArquivo();

    }

    private static void criarNovoArquivo() {
        File file = new File("arquivoos\\test.txt");

        try {
            boolean Iscriado = file.createNewFile();
            System.out.println("Arquivo criado com sucesso");

        } catch (Exception e) {
            e.printStackTrace();
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