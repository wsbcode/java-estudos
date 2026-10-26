package aOrientacaoObjetos.metodos.domin;

// Define a classe ImpressoraEstudante, cujo objetivo principal é imprimir os dados de um estudante
public class ImpressoraEstudante {

    // Método que recebe um objeto do tipo Estudante como parâmetro
    public void imprimirEstudante(Estudante estudante){

        // Imprime o nome do estudante que foi enviado
        System.out.println(estudante.nome);

        // Imprime a idade do estudante
        System.out.println(estudante.idade);

        // Imprime o sexo do estudante
        System.out.println(estudante.sexo);

        // Imprime uma linha pontilhada apenas para separar visualmente no console
        System.out.println("__________________________________");

    }
}