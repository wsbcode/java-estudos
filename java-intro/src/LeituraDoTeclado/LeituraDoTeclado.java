package LeituraDoTeclado;

// // Importa a classe Scanner para permitir a leitura de dados do teclado
import java.util.Scanner;

public class LeituraDoTeclado {
    public static void main(String[] args) {
        // // Cria o leitor conectado à entrada padrão do teclado (System.in)
        Scanner input = new Scanner(System.in);

        // // Pede e lê o nome do usuário (texto/linha inteira)
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        // // Pede e lê a idade do usuário (número inteiro)
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        // // Pede e lê a altura do usuário (número decimal/float)
        System.out.print("Digite sua altura: ");
        float altura = input.nextFloat();

        // // Pede e lê o peso do usuário (número decimal/float)
        System.out.print("Digite sua peso: ");
        float peso = input.nextFloat();

        // // Aplica a fórmula do IMC: peso dividido pela altura ao quadrado
        double imc = peso / (altura * altura);

        // // Imprime o IMC formatado para exibir apenas 2 casas decimais
        System.out.printf("Seu IMC é: %.2f%n", imc);

        // // Estrutura condicional para verificar em qual faixa o IMC se encaixa
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }

        // // Boa prática: fecha o recurso do teclado no final do programa
        input.close();
    }
}