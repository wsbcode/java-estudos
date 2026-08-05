package java03objeto.testeclass;

import java03objeto.metodos.metodos01.Calculadora;

public class CalculadoraTST01 {
    public static void main(String[] args) {
        // // Cria (instancia) um novo objeto do tipo Calculadora na memória
        Calculadora somaPadrao = new Calculadora();
        Calculadora somaVarArgs = new Calculadora();

        // // Cria um array de inteiros com 5 elementos (opção tradicional)
        int []testeArray = {1,2,3,4,5};

        somaPadrao.somarArrayPadrao(testeArray);

        // // Chama o método repassando vários números soltos de forma direta (graças ao Varargs!)

        somaVarArgs.somaArrayVarArgs(2,30,40);
    }
}
