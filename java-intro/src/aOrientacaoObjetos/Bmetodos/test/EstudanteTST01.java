package aOrientacaoObjetos.Bmetodos.test;

// Importa as classes Estudante e ImpressoraEstudante para podermos usá-las aqui
import aOrientacaoObjetos.Bmetodos.domin.Estudante;
import aOrientacaoObjetos.Bmetodos.domin.ImpressoraEstudante;

public class EstudanteTST01 {
    // Método principal onde o programa começa a rodar
    public static void main(String[] args) {

        // Cria dois objetos diferentes do tipo Estudante (estudante01 e estudante02)
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        // Cria um objeto da classe ImpressoraEstudante para ajudar a mostrar os dados
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        // Preenche os dados do primeiro estudante (Pedro)
        estudante01.nome = "Pedro";
        estudante01.sexo = "M";
        estudante01.idade = 23;

        // Preenche os dados do segundo estudante (Maria)
        estudante02.nome = "Maria";
        estudante02.sexo = "F";
        estudante02.idade = 33;

        // Usa a classe impressora para exibir os dados do estudante01
        impressora.imprimirEstudante(estudante01);

        // Usa a classe impressora para exibir os dados do estudante02
        impressora.imprimirEstudante(estudante02);

        // Chama o método 'imprimir' diretamente de dentro do próprio estudante01
        estudante01.imprimir();

        // Chama o método 'imprimir' diretamente de dentro do próprio estudante02
        estudante02.imprimir();
    }
}