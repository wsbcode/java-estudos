package Cexecoes.Aexecoes.exeption.domin;

// Define uma exceção própria chamada 'LoginInvalidoExeption' que herda de 'Exception'.
// Como herda de 'Exception' (e não de 'RuntimeException'), é uma exceção checada: o Java obriga a tratar ou avisar com 'throws'.
public class LoginInvalidoExeption extends Exception {

    // Construtor padrão (sem parâmetros): cria o erro já com uma mensagem fixa usando 'super(...)'.
    public LoginInvalidoExeption() {
        super("Login Invalido");
    }

    // Construtor com mensagem personalizada: permite passar um texto específico na hora de lançar o erro.
    public LoginInvalidoExeption(String message) {
        super(message);
    }
}