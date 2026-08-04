package java03objeto.metodos.metodos01;

// MÉTODOS = FUNÇÃO
public class Calculadora {

    public int somarDoisNumeros(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int subtrairDoisNumeros(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicarDoisNumeros(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public double divideDoisNumeros(double numero1, double numero2) {
        if (numero2 == 0) {
            System.out.println("Aviso: Divisão por zero não é permitida.");
            return 0;
        }
        return numero1 / numero2;
    }

    public static void alterarDoisnumeros(int n1, int n2) {
        // // n1 e n2 são apenas CÓPIAS das variáveis do main!

        n1 = 10; // // Altera APENAS a cópia local de n1 para 10
        n2 = 20; // // Altera APENAS a cópia local de n2 para 20

        // // Imprime os novos valores que estão valendo DENTRO do método (10 e 20)
        System.out.println("Método: " + n1);
        System.out.println("Método: " + n2);

        // // Quando a execução chega aqui, a função acaba e as CÓPIAS são jogadas no lixo!
    }
}
