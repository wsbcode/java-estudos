package Cexecoes.Aexecoes.exeption.test;

// Importa as classes de domínio usadas no teste de sobrescrita com exceções
import Cexecoes.Aexecoes.exeption.domin.Funcionario;
import Cexecoes.Aexecoes.exeption.domin.LoginInvalidoExeption;
import Cexecoes.Aexecoes.exeption.domin.Pessoa;

// Importa FileNotFoundException para capturar a exceção lançada pelo método salvar() de Pessoa
import java.io.FileNotFoundException;

public class SobreEscritaComExeptionTST01 {

    // O 'main' avisa ('throws LoginInvalidoExeption') porque chama 'funcionario.salvar()',
    // que pode lançar 'LoginInvalidoExeption' e não está dentro de um try/catch aqui.
    public static void main(String[] args) throws LoginInvalidoExeption {
        // Cria um objeto do tipo Pessoa (classe pai)
        Pessoa pessoa = new Pessoa();
        // Cria um objeto do tipo Funcionario (classe filha, que sobrescreveu salvar())
        Funcionario funcionario = new Funcionario();

        // 'pessoa.salvar()' avisa que pode lançar LoginInvalidoExeption e FileNotFoundException.
        // Aqui você colocou try/catch apenas para 'FileNotFoundException', e deixou 'LoginInvalidoExeption'
        // subir para o 'main' (que já tem 'throws LoginInvalidoExeption').
        try {
            pessoa.salvar();
        } catch (FileNotFoundException e) {
            // Se acontecer FileNotFoundException, transforma em RuntimeException e lança
            throw new RuntimeException(e);
        }

        // Chama o 'salvar()' de Funcionario. Como ele pode lançar LoginInvalidoExeption (exceção checada),
        // o 'main' precisa ter 'throws LoginInvalidoExeption' ou usar try/catch.
        funcionario.salvar();
    }
}