package logica;
// OPERADORE

public class TiposPrimitivos02 {
    public static void main(String[] args){

    // 1. byte: números inteiros pequenos (-128 até 127)
            byte exemploByte = 127;

    // 2. short: números inteiros médios (-32.768 até 32.767)
            short exemploShort = 32000;

    // 3. int: números inteiros (mais usado)
            int exemploInt = 25;

    // 4. long: números inteiros GIGANTES (usar L no final)
            long exemploLong = 8000000000L;

    // 5. float: números com vírgula (usar f no final)
            float exemploFloat = 10.5f;

    // 6. double: números com vírgula (mais usado)
            double exemploDouble = 25.99;

    // 7. char: UMA única letra/símbolo (usar ' ' aspas simples)
            char exemploChar = 'A';

    // 8. boolean: verdadeiro ou falso
            boolean exemploBoolean = true;

    // 9. String: texto/frase/palavra (usar " " aspas duplas)
        String exemploString = "William Developer JAVA+Spring boot";


        System.out.println(exemploString);
    }
}

class OperadoresRelacionais{
    public static void main(String[]ergs){

    boolean isDezMaiorQueVinte = 10 > 20 ;

    boolean isDezMenorQueVinte = 10 < 20 ;

    boolean isDezigualVinte = 10 == 20 ;

    boolean isDezDiferenteVinte = 10 != 20 ;

    System.out.println(isDezMaiorQueVinte);
    System.out.println(isDezMenorQueVinte);
    System.out.println(isDezigualVinte);
    System.out.println(isDezDiferenteVinte);
}

}
// VERIFICANDO DADOS PARA ADERIR CARD (idade = 30+) e (Salario < 4000)
class OperadoresLogicos {
    public static void main(String[] ergs) {
        int idade = 33;
        float salario = 33500;

        boolean verificandoDados = idade >= 30 && salario <= 4000;
        boolean verificandoDados2 = idade >= 30 && salario <= 4000;
        System.out.println(verificandoDados);
        System.out.println(verificandoDados2);

    }
}