package metodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante aluno) {
        System.out.println("________________________");

        System.out.println(aluno.nome);
        System.out.println(aluno.idade);
        System.out.println(aluno.sexo);

    }
}
