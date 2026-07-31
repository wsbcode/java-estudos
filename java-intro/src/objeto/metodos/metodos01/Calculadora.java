package objeto.metodos.metodos01;

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
}
