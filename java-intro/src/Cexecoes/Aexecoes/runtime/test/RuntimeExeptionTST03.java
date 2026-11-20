package Cexecoes.Aexecoes.runtime.test;

public class RuntimeExeptionTST03 {

    // Método principal onde o programa começa a rodar
    public static void main(String[] args) {
        // Bloco 'try': tenta abrir e escrever dados no arquivo
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados arquivo");
            // Bloco 'catch': só roda se acontecer algum erro dentro do 'try' (aqui não vai disparar nada)
        } catch (Exception e) {
            e.printStackTrace();
            // Bloco 'finally': sempre roda no final, dê erro dentro do 'try' ou não
        } finally {
            System.out.println("Fechando arquivo");
        }
    }

}