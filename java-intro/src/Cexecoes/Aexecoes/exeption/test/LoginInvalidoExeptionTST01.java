package Cexecoes.Aexecoes.exeption.test;

// Importa a exceção personalizada 'LoginInvalidoExeption' criada no pacote domin
import Cexecoes.Aexecoes.exeption.domin.LoginInvalidoExeption;

// Importa Scanner para ler o que o usuário digita no teclado
import java.util.Scanner;

public class LoginInvalidoExeptionTST01 {

    // Método principal onde o programa começa
    public static void main(String[] args) {
        // Tenta executar o processo de login
        try {
            logar();
            // Se 'logar()' lançar 'LoginInvalidoExeption', este bloco captura o erro
        } catch (LoginInvalidoExeption e) {
            // Embrulha a exceção original dentro de uma 'RuntimeException' e a lança
            throw new RuntimeException(e);
        }
    }

    // Método que lê login e senha e avisa ('throws LoginInvalidoExeption') que pode lançar esse erro
    private static void logar() throws LoginInvalidoExeption {
        // Cria o leitor para capturar entradas digitadas no console
        Scanner teclado = new Scanner(System.in);

        // Credenciais corretas simulando um "banco de dados" (DB)
        String loginDB = "wsb";
        String senhaDB = "admin";

        // Pede e lê o login digitado pelo usuário
        System.out.println("Digite o login do usuario");
        String loginDigitado = teclado.nextLine();

        // Pede e lê a senha digitada pelo usuário
        System.out.println("Digite o senha do usuario");
        String senhaDigitada = teclado.nextLine();

        // Atenção à lógica: o '&&' (E) só dispara o erro se AMBOS (login E senha) estiverem errados.
        // Se apenas um dos dois estiver errado, o código passa direto e imprime "Usuario autorizado"!
        if (!loginDB.equals(loginDigitado) && !senhaDB.equals(senhaDigitada)) {
            // Cria e lança ('throw new') a exceção personalizada com a mensagem de erro
            throw new LoginInvalidoExeption("Usuario ou senha inválidos");
        }

        // Executado apenas quando o 'if' acima não lança exceção
        System.out.println("Usuario autorizado");
    }
}