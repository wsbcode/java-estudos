package aOrientacaoObjetos.Opolimorfismo.servico;

// Importa a interface Repositorio para que esta classe possa cumprir o contrato estabelecido
import aOrientacaoObjetos.Opolimorfismo.repositorio.Repositorio;

// Define a classe 'RepositorioBancoDeDados' que implementa a interface 'Repositorio'
public class RepositorioBancoDeDados implements Repositorio {

    // Sobrescreve o método 'salvar()' exigido pelo contrato da interface Repositorio.
    // Aqui implementamos a lógica específica para salvar os dados em um banco de dados relacional ou não-relacional.
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}