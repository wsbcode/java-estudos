package Execoes.runtime.test;

import javax.swing.*;

public class RuntimeExeption03 {
    public static void main(String[] args) {

        try {
            // Exemplo 1: Convertendo texto para número
            String texto = "ABC"; // Isso não é um número!
            int numero = Integer.parseInt(texto); // Lança NumberFormatException

            // Exemplo 2: Divisão por zero
            int resultado = 10 / 0; // Lança ArithmeticException

        } catch (NumberFormatException e) {
            // Captura APENAS erros de conversão de texto/número
            System.out.println("Erro 1: Você precisa digitar um número válido!");

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // O símbolo '|' (pipe) junta as exceções no mesmo catch!
            // Captura APENAS erros de cálculos matemáticos
            System.out.println("Erro 2: Não é possível dividir um número por zero!");

        } catch (Exception e) {
            // "Curinga": Captura qualquer OUTRO erro não previsto acima
            System.out.println("Erro genérico: Algo deu errado -> " + e.getMessage());
        }
    }
}



