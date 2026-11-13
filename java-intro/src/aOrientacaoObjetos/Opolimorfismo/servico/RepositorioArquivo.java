package aOrientacaoObjetos.Opolimorfismo.servico;

// Importa a interface Repositorio para que esta classe possa assinar o contrato e implementar seus métodos
import aOrientacaoObjetos.Opolimorfismo.repositorio.Repositorio;

// Define a classe 'RepositorioArquivo' que implementa a interface 'Repositorio'
public class RepositorioArquivo implements Repositorio {

    // Sobrescreve o método 'salvar()' exigido pelo contrato da interface Repositorio.
    // Aqui é escrita a lógica específica para salvar os dados em um arquivo físico no computador.
    @Override
    public void salvar() {
        System.out.println("Salvando arquivo");
    }
}