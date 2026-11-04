package Aarray.leituraDoTeclado;

// Importa a ferramenta Scanner para permitir que o programa leia o que o usuário digita no teclado
import java.util.Scanner;

public class LeituraDoTeclado {
    // Método principal onde o programa começa a rodar
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado 'input' para capturar as entradas do teclado
        Scanner input = new Scanner(System.in);

        // Pede e lê o nome digitado pelo usuário (texto completo)
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        // Pede e lê a idade digitada pelo usuário (número inteiro)
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        // Pede e lê o sexo do usuário.
        // O '.next()' pega a primeira palavra digitada e o '.charAt(0)' pega apenas a primeira letra dela.
        System.out.println("Digite seu Sexo");
        char sexo = input.next().charAt(0);

        // Pede e lê a altura digitada pelo usuário (número com ponto flutuante)
        System.out.println("Digite sua altura: ");
        float altura = input.nextFloat();

        // Pede e lê o peso digitado pelo usuário (número com ponto flutuante)
        System.out.println("Digite sua peso: ");
        float peso = input.nextFloat();

        // Imprime linhas separadoras para organizar a exibição dos dados na tela
        System.out.println("--------------------------------------------------------");
        System.out.println("Exibindo dados");
        System.out.println("######################################################");

        // Exibe todas as informações que foram digitadas e guardadas nas variáveis
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }
}