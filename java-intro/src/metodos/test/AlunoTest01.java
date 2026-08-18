package metodos.test;

import metodos.dominio.Estudante;
import metodos.dominio.ImpressoraEstudante;

public class AlunoTest01 {
    public static void main(String[] args) {
        // // 1. Cria duas fichas de estudantes em branco na memória
        Estudante aluno1 = new Estudante();
        Estudante aluno2 = new Estudante();

        // // 2. Cria a impressora que vai fazer o trabalho de imprimir
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        // // 3. Preenche a primeira ficha (aluno1)
        aluno1.nome = "joão";
        aluno1.idade = 35;
        aluno1.sexo = 'M';

        // // 4. Preenche a segunda ficha (aluno2)
        aluno2.nome = "Maria";
        aluno2.idade = 33;
        aluno2.sexo = 'F';

        // // 5. Entrega a ficha de 'aluno1' para a impressora trabalhar
        aluno1.imprime();


        // // 6. Entrega a ficha de 'aluno2' para a impressora trabalhar
        aluno2.imprime();


    }

}
