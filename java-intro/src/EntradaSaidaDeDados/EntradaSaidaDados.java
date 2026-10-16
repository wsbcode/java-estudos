package EntradaSaidaDeDados;

import java.util.Scanner;

public class EntradaSaidaDados {
    // Método principal (ponto de entrada onde a execução do programa Java começa)
    public static void main(String[] args) {

        // Cria um objeto chamado 'input' da classe Scanner para capturar o que você digita no teclado (System.in)
        Scanner input = new Scanner(System.in);

        // Imprime na tela a mensagem pedindo para digitar o nome (o 'print' não pula linha no final)
        System.out.print("Digite seu nome: ");

        // Lê o texto digitado pelo usuário no teclado até que ele aperte Enter, e guarda na variável 'nome'
        String nome = input.nextLine();

        // Imprime na tela a mensagem pedindo o sobrenome
        System.out.print("Digite seu sobrenome: ");

        // Lê o texto digitado do sobrenome e guarda na variável 'sobrenome'
        String sobrenome = input.nextLine();

        // Junta (concatena) os textos e exibe o resultado final completo no console
        System.out.println("Nome completo: " + nome + " " + sobrenome);

//        input.close();
    }
}
