package Cexecoes.Aexecoes.runtime.test;

public class RuntimeExeptionTST03 {
    public static void main(String[] args) {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados arquivo");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando arquivo");
        }
    }

}
