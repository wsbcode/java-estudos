package aOrientacaoObjetos.classes.test;

// Importa a classe Pessoa para podermos usá-la aqui no teste
import aOrientacaoObjetos.classes.domin.Estudante;

public class EstudanteTST01 {
    // Método principal onde o programa começa a ser executado
    public static void main(String[] args) {

        // Cria um novo objeto do tipo Pessoa na memória
        Estudante pessoa = new Estudante();

        // Define o valor do nome da pessoa
        pessoa.nome = "William";

        // Define a idade da pessoa
        pessoa.idade = 33;

        // Define o sexo da pessoa
        pessoa.sexo = 'M';

        // Imprime o nome no console
        System.out.println(pessoa.nome);

        // Imprime a idade no console
        System.out.println(pessoa.idade);

        // Imprime o sexo no console
        System.out.println(pessoa.sexo);
    }
}