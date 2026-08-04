// // Declara o pacote onde esta classe de teste está guardada
package java03objeto.testeclass;

// // Importa a classe 'Estudante' de outro pacote para poder usá-la aqui
import java03objeto.poo01.Estudante;

// // Criação da classe principal de teste
public class AlunoTST {

    // // Ponto de partida do Java: o código começa a rodar por aqui!
    public static void main(String[] args) {

        // // Cria (instancia) um novo objeto do tipo 'Estudante' na memória chamado 'aluno01'
        Estudante aluno01 = new Estudante();

        // // Define o valor do atributo 'nome' do 'aluno01'
        aluno01.nome = "William";

        // // Define o valor do atributo 'idade' do 'aluno01'
        aluno01.idade = 33;

        // // Define o valor do atributo 'sexo' do 'aluno01'
        aluno01.sexo = 'M';

        // // Exibe no terminal o nome salvo no objeto 'aluno01'
        System.out.println(aluno01.nome);

        // // Exibe no terminal a idade salva no objeto 'aluno01'
        System.out.println(aluno01.idade);

        // // Exibe no terminal o sexo salvo no objeto 'aluno01'
        System.out.println(aluno01.sexo);

    }

}