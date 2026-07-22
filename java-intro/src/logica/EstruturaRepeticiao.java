package logica;
// ESTRUTURAS DE REPETIÇOÊS

public class EstruturaRepeticiao {
    public static void main(String[] args) {

        int contador = 0;

    // Exemplo com estrutura (While). Usado quando você NÃO sabe quantas vezes vai repetir (depende de uma condição).
        while (contador < 10) {
            System.out.println("Contagem em " + contador++);
        }

    // Exemplo com estrutura (For). Usado quando você SABE quantas vezes vai repetir.
        for (int i = 0; i < 10; i++) {
            System.out.println("Contagem... em " + i);

        }
    }
}
