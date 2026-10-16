package array.test;

public class ArraysTST01 {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        nomes[0] = "Juan";
        nomes[1] = "Maria";
        nomes[2] = "Pedro";
        nomes[3] = "Jose";
        nomes[4] = "Lucas";
        int[] idades = new int[]{10, 20, 30, 40, 50};

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("-----------------");

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}
