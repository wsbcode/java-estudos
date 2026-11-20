package Cexecoes.Aexecoes.exeption.domin;

// Importa a exceção FileNotFoundException, usada quando o Java tenta acessar um arquivo que não existe
import java.io.FileNotFoundException;

// Define a classe base 'Pessoa' (classe pai de 'Funcionario')
public class Pessoa {

    // Método 'salvar()' que avisa ('throws') que pode lançar duas exceções checadas:
    // - LoginInvalidoExeption: erro customizado do sistema de login
    // - FileNotFoundException: erro ao tentar encontrar/abrir um arquivo
    public void salvar() throws LoginInvalidoExeption, FileNotFoundException {
        // Exibe no console que o processo de salvar uma pessoa foi executado
        System.out.println("Salvando pessoa...");
    }
}