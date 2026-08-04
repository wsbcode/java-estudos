// // Declara o pacote onde este arquivo Java está guardado
package java01logica;

// // Criação da classe principal
public class EstruturaSwitch {

    // // Ponto de partida do Java: o código começa a rodar por aqui!
    public static void main(String[] args) {

        // // Variável de número inteiro que representa o dia da semana
        int diaSemana = 1;

        // // Estrutura switch: avalia qual valor está guardado em 'diaSemana'
        switch (diaSemana) {
            // // Se o valor for 1: imprime "Domingo"
            case 1:
                System.out.println("Domingo");
                break; // // Encerra o switch e impede de rodar os casos de baixo

            // // Se o valor for 2: imprime "Segunda-Feira"
            case 2:
                System.out.println("Segunda-Feira");
                break; // // Encerra o switch

            // // Se o valor for 3: imprime "Terça-feira"
            case 3:
                System.out.println("Terça-feira");
                break; // // Encerra o switch

            // // Se o valor for 4: imprime "Quinta-feira"
            case 4:
                System.out.println("Quinta-feira");
                break; // // Encerra o switch

            // // Se o valor for 5: imprime "Sexta-feira"
            case 5:
                System.out.println("Sexta-feira");
                break; // // Encerra o switch

            // // Se o valor for 6: imprime "Sábado"
            case 6:
                System.out.println("Sábado");
                break; // // Encerra o switch

            // // Opção padrão: roda se nenhum dos números acima for digitado
            default:
                System.out.println("Insira um número valido!");

        }

        // // Variável do tipo caractere único que guarda a letra do sexo
        char sexo = 'F';

        // // Avalia qual caractere está guardado em 'sexo'
        switch (sexo) {
            // // Se for a letra 'M': imprime "Masculino"
            case 'M':
                System.out.println("Masculino");
                break; // // Encerra o switch

            // // Se for a letra 'F': imprime "Feminino"
            case 'F':
                System.out.println("Feminino");
                break; // // Encerra o switch
        }

    }

}