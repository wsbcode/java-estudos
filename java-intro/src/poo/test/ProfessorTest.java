package poo.test;

import poo.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        Professor professor02 = new Professor();

      professor1.nome = "Marcela";
        professor1.idade = 30;
        professor1.sexo = 'F';
        professor1.materia = "Tecnologia";

        System.out.println("Nome:" +    professor1.nome + " Idade:" +    professor1.idade + " Sexo:" +    professor1.sexo + " Matéria:" +    professor1.materia);

        System.out.println("------------------------------------------");

        professor02.nome = "William";
        professor02.idade = 33;
        professor02.sexo = 'M';
        professor02.materia = "Java";

        System.out.println("Nome:" +    professor02.nome + " Idade:" +    professor02.idade + " Sexo:" +    professor02.sexo + " Matéria:" +    professor02.materia);

    }
}
