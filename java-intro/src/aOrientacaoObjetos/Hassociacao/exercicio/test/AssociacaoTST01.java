package aOrientacaoObjetos.Hassociacao.exercicio.test;

// Importa as classes que vamos usar para criar o cenário do teste

import aOrientacaoObjetos.Hassociacao.exercicio.domin.Aluno;
import aOrientacaoObjetos.Hassociacao.exercicio.domin.Local;
import aOrientacaoObjetos.Hassociacao.exercicio.domin.Professor;
import aOrientacaoObjetos.Hassociacao.exercicio.domin.Seminario;

public class AssociacaoTST01 {
    // Método principal onde o programa começa a rodar
    public static void main(String[] args) {

        // Cria um objeto Local com o endereço "Nova Madre de Deus"
        Local local = new Local("Nova Madre de Deus");

        // Cria um objeto Aluno com o nome "William Barbos" e 33 anos
        Aluno aluno = new Aluno("William Barbos", 33);

        // Cria um array (lista) de alunos contendo apenas este aluno para colocar no seminário
        Aluno[] alunosParaSeminario = {aluno};

        // Cria um objeto Seminario com o título "Programação", passando a lista de alunos e o local criados acima
        Seminario seminario = new Seminario("Programação", alunosParaSeminario, local);

        // Cria um array (lista) de seminários contendo este seminário para associar ao professor
        Seminario[] seminariosDisponiveis = {seminario};

        // Cria um objeto Professor com o nome "William Suane", a especialidade "Java" e a lista de seminários
        Professor professor = new Professor("William Suane", "Java", seminariosDisponiveis);

        // Chama o método imprimir do professor para exibir todas as informações na tela
        professor.imprimir();
    }
}