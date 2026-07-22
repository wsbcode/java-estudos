package exercicios;
// VERIFICANDO SE É ULIL OU FINAL DE SEMANA

public class Atividade03 {
    public static void main(String[] args) {
        int diaSemanaUtil = 7;

        switch (diaSemanaUtil) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;

            default:
                System.out.println("Dia normal, va trabalhar");
                break;
        }
    }
}
