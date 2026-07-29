package objeto.testeclass;

import objeto.poo01.Estudante;

public class AlunoTXT {
    public static void main(String[] args) {
        Estudante aluno01 = new Estudante();
        aluno01.nome = "William";
        aluno01.idade = 33;
        aluno01.sexo = 'M';


        System.out.println(aluno01.nome);
        System.out.println(aluno01.idade);
        System.out.println(aluno01.sexo);


    }

}
