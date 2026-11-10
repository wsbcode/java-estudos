package aOrientacaoObjetos.MclassesAbstratas.test;

// Importa as classes Gerente, Funcionario e Desenvolvedor para podermos testar o uso de classes e métodos abstratos
import aOrientacaoObjetos.MclassesAbstratas.domin.Desenvolvedor;
import aOrientacaoObjetos.MclassesAbstratas.domin.Funcionario;
import aOrientacaoObjetos.MclassesAbstratas.domin.Gerente;

public class FuncionarioTST01 {
    // Método principal onde o programa começa a rodar
    public static void main(String[] args) {

        // Cria um objeto Gerente (o construtor chama a classe pai e executa o cálculo de salário do gerente, dobrando o valor de 1000 para 2000)
        Gerente gerente = new Gerente("Abel Ferreira", 1000);

        // Cria um objeto Desenvolvedor (o construtor chama a classe pai e executa o cálculo de salário do desenvolvedor, adicionando 50% e indo de 1000 para 1500)
        Desenvolvedor desenvolvedor = new Desenvolvedor("William Barbosa", 1000);

        // Imprime os dados do gerente na tela (o Java chama automaticamente o método toString() sobrescrito na classe Gerente)
        System.out.println(gerente);

        // Imprime os dados do desenvolvedor na tela (o Java chama automaticamente o método toString() sobrescrito na classe Desenvolvedor)
        System.out.println(desenvolvedor);
    }
}