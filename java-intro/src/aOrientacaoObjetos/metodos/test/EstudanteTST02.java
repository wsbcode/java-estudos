package aOrientacaoObjetos.metodos.test;

// Importa a classe Estudante para podermos criar nossos estudantes
import aOrientacaoObjetos.metodos.domin.Estudante;
// (Nota: A classe ImpressoraEstudante foi importada aqui, mas não é usada neste arquivo)
import aOrientacaoObjetos.metodos.domin.ImpressoraEstudante;

public class EstudanteTST02 {
    // Método principal onde o programa começa a rodar
    public static void main(String[] args) {

        // Cria dois objetos diferentes do tipo Estudante na memória
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        // Define os dados do primeiro estudante (Pedro)
        estudante01.nome = "Pedro";
        estudante01.sexo = "M";
        estudante01.idade = 23;

        // Define os dados do segundo estudante (Maria)
        estudante02.nome = "Maria";
        estudante02.sexo = "F";
        estudante02.idade = 33;

        // Chama o método 'imprimir' direto do estudante01 para mostrar os dados dele na tela
        estudante01.imprimir();

        // Chama o método 'imprimir' direto do estudante02 para mostrar os dados dela na tela
        estudante02.imprimir();
    }
}