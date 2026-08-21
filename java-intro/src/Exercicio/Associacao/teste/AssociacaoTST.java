package Exercicio.Associacao.teste;

import Exercicio.Associacao.dominio.Aluno;
import Exercicio.Associacao.dominio.Local;
import Exercicio.Associacao.dominio.Professor;
import Exercicio.Associacao.dominio.Seminario;

public class AssociacaoTST {
    public static void main(String[] args) {
        Local local = new Local("Madre de Deus");
        Aluno aluno = new Aluno("Ronaldinho Gaucho", 33);
        Professor professor = new Professor("William", "Programação");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Tecnologia", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprimir();
    }
}
