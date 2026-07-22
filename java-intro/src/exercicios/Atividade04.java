package exercicios;
// DESCOBRIR EM QUATAS VENZES O VALOR DO CARRO PODE SER PARCELADO
// CINDIÇÃO VALOR DAS PARCELAS >= 1000

public class Atividade04 {
    public static void main(String[] args) {
        double valorCarro = 50000;
        double valorMinimoParcela = 1000;

        for (int parcela = 1; valorCarro / parcela >= valorMinimoParcela ; parcela++) {

            double valorDasparcelas = valorCarro / parcela;

            System.out.println("Carro parcelado em " + parcela + "x de R$" + valorDasparcelas);


        }

    }
}
