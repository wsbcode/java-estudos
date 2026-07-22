package logica;
// ESTRUTURA CONDICINAL SWITCH

public class EstruturaSwitch {
    public static void main(String[] args) {

        int diaSemana = 1;

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda-Feira");
                break;

            case 3:
                System.out.println("Terça-feira");
                break;

            case 4:
                System.out.println("Quinta-feira");
                break;

            case 5:
                System.out.println("Sexta-feira");
                break;

            case 6:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Insira um número valido!");

        }
//  VERIFICANDO SEXO COM SWITCH

        char sexo = 'F';

        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;

            case 'F':
                System.out.println("Feminino");
                break;
        }


    }

}

