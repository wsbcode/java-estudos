// Indica a pasta do arquivo
package Interface.dominio;

// A classe DataBaseLoader assina DUAS interfaces ao mesmo tempo, separadas por vírgula
public class DataBaseLoader implements DataLoader, DataRemove {

    // O @Override avisa o Java que estamos escrevendo o código exigido pela interface DataLoader
    @Override
    public void load() {
        // Lógica específica para carregar dados do BANCO DE DADOS
        System.out.println("Carregando base de dados...");
    }

    // O @Override avisa que estamos escrevendo o código exigido pela interface DataRemove
    @Override
    public void remove() {
        // Lógica específica para remover dados do BANCO DE DADOS
        System.out.println("Removendo base de dados...");
    }

}