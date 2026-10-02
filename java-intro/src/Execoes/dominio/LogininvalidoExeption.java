package Execoes.dominio;

public class LogininvalidoExeption extends Exception {

    public LogininvalidoExeption() {
        super("Login invalido!");
    }

    public LogininvalidoExeption(String message) {
        super(message);
    }
}
