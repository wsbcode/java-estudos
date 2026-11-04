package Aarray.leituraDoTeclado;

// Importa a ferramenta Scanner para permitir que o programa leia o que for digitado no teclado
import java.util.Scanner;

public class LeituraDoTecladoTST01 {
    // Método principal onde o programa começa a rodar
    public static void main(String[] args) {

        // Cria o Scanner para capturar o texto digitado pelo usuário
        Scanner input = new Scanner(System.in);

        // Pede para o usuário digitar uma frase ou pergunta
        System.out.println("Faca sua pergunta");
        String pergunta = input.nextLine();

        // Verifica se a primeira letra da frase (posição 0) é um espaço em branco (' ')
        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM"); // Se começar com espaço, imprime SIM
        } else {
            System.out.println("NAO"); // Se não começar com espaço, imprime NAO
        }
    }
}