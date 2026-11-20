package Cexecoes.Aexecoes.exeption.domin;

// Define a classe Funcionario que herda da classe Pessoa.
// Por herdar de Pessoa, Funcionario ganha os atributos e métodos comuns de pessoa, mas pode adicionar ou ajustar comportamentos próprios.
public class Funcionario extends Pessoa {

    // Sobrescreve/define o método 'salvar()'.
    // 'throws LoginInvalidoExeption, ArithmeticException' avisa que este método PODE lançar esses dois tipos de erro.
    // - LoginInvalidoExeption: erro customizado (exceção checada/do projeto) quando o login não é válido.
    // - ArithmeticException: erro de matemática em tempo de execução (exceção não checada, como divisão por zero).
    public void salvar() throws LoginInvalidoExeption, ArithmeticException {
        // Imprime no console que o processo de salvar o funcionário começou
        System.out.println("Salvando Funcionario...");
    }

}