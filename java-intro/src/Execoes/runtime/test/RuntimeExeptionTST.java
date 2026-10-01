package Execoes.runtime.test;

public class RuntimeExeptionTST {
    public static void main(String[] args) {

        System.out.println(divisao(10 ,0));
    }
    private static int divisao(int a, int b){
        if(b==0){
            throw  new IllegalArgumentException("Argumento invalido , não pode ser 0");
        }

        return a/b;
    }

}
