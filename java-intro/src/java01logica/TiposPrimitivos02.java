// // Declara o pacote onde este arquivo Java está guardado
package java01logica;

// // Primeira classe: demonstração dos tipos primários de dados e String
public class TiposPrimitivos02 {

    // // Ponto de partida do Java para executar a classe TiposPrimitivos02
    public static void main(String[] args){

        // // 1. byte: guarda inteiros muito pequenos (-128 até 127)
        byte exemploByte = 127;

        // // 2. short: guarda inteiros de tamanho médio (-32.768 até 32.767)
        short exemploShort = 32000;

        // // 3. int: guarda inteiros normais (o padrão mais usado para números inteiros)
        int exemploInt = 25;

        // // 4. long: guarda inteiros gigantes (deve ter a letra 'L' no final)
        long exemploLong = 8000000000L;

        // // 5. float: guarda números com casas decimais (deve ter a letra 'f' no final)
        float exemploFloat = 10.5f;

        // // 6. double: guarda números com casas decimais e mais precisão (mais usado)
        double exemploDouble = 25.99;

        // // 7. char: guarda apenas UM caractere/letra entre aspas simples (' ')
        char exemploChar = 'A';

        // // 8. boolean: guarda apenas verdadeiro (true) ou falso (false)
        boolean exemploBoolean = true;

        // // 9. String: guarda textos ou frases entre aspas duplas (" ")
        String exemploString = "William Developer JAVA+Spring boot";

        // // Exibe o texto da variável 'exemploString' no terminal
        System.out.println(exemploString);
    }
}

// // Segunda classe: demonstração de comparações entre números
class OperadoresRelacionais{

    // // Ponto de partida para executar a classe OperadoresRelacionais
    public static void main(String[]ergs){

        // // Testa se 10 é maior que 20 (retorna false)
        boolean isDezMaiorQueVinte = 10 > 20 ;

        // // Testa se 10 é menor que 20 (retorna true)
        boolean isDezMenorQueVinte = 10 < 20 ;

        // // Testa se 10 é igual a 20 (retorna false)
        boolean isDezigualVinte = 10 == 20 ;

        // // Testa se 10 é diferente de 20 (retorna true)
        boolean isDezDiferenteVinte = 10 != 20 ;

        // // Exibe o resultado da comparação (false)
        System.out.println(isDezMaiorQueVinte);

        // // Exibe o resultado da comparação (true)
        System.out.println(isDezMenorQueVinte);

        // // Exibe o resultado da comparação (false)
        System.out.println(isDezigualVinte);

        // // Exibe o resultado da comparação (true)
        System.out.println(isDezDiferenteVinte);
    }
}

// // Terceira classe: demonstração de operadores lógicos (E / &&)
class OperadoresLogicos {

    // // Ponto de partida para executar a classe OperadoresLogicos
    public static void main(String[] ergs) {

        // // Variável de número inteiro que guarda a idade
        int idade = 33;

        // // Variável de número com vírgula que guarda o salário
        float salario = 33500;

        // // O operador && (E) só dá true se AMBAS as condições forem verdadeiras
        // // Testa: idade é maior/igual a 30 E salário é menor/igual a 4000
        boolean verificandoDados = idade >= 30 && salario <= 4000;

        // // Repetição da mesma validação lógica
        boolean verificandoDados2 = idade >= 30 && salario <= 4000;

        // // Exibe o resultado final da validação (false, pois o salário passa de 4000)
        System.out.println(verificandoDados);

        // // Exibe o resultado da segunda validação (false)
        System.out.println(verificandoDados2);
    }
}