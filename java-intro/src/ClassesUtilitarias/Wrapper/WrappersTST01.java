package ClassesUtilitarias.Wrapper;

public class WrappersTST01 {
    public static void main(String[] args) {
        // Tipos primitivos: guardam o valor diretamente na memória de forma simples e rápida
        byte byteP = 1; // Guarda um número inteiro muito pequeno (8 bits)
        short shortP = 2; // Guarda um número inteiro pequeno (16 bits)
        int intP = 3; // Guarda um número inteiro padrão (32 bits)
        long longP = 4; // Guarda um número inteiro grande (64 bits)
        float floatP = 5; // Guarda um número decimal de precisão simples
        double doubleP = 6; // Guarda um número decimal de dupla precisão (padrão)
        char charP = 7; // Guarda um único caractere ou código da tabela ASCII/Unicode
        boolean booleanP = true; // Guarda apenas verdadeiro (true) ou falso (false)

        // Classes Wrapper: são objetos que "embrulham" os tipos primitivos e trazem métodos úteis
        Byte byteW = 1; // Wrapper do tipo byte (converte o valor 1 em objeto)
        Short shortW = 2; // Wrapper do tipo short
        Integer intW = 3; // Wrapper do tipo int (permite usar recursos de objetos)
        Long longW = 10L; // Wrapper do tipo long (o sufixo 'L' indica o formato long)
        Float floatW = 10F; // Wrapper do tipo float (o sufixo 'F' indica o formato float)
        Double doubleW = 10D; // Wrapper do tipo double (o sufixo 'D' indica o formato double)
        Character charW = 7; // Wrapper do tipo char (converte o código numérico para caractere)
        Boolean booleanW = true; // Wrapper do tipo boolean

    }
}