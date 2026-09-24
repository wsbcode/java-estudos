// Indica a pasta do arquivo
package Interface.dominio;

// A classe FileLoader TAMBÉM assina as duas interfaces (DataLoader e DataRemove)
public class FileLoader implements DataLoader , DataRemove {

    // Escreve a regra do 'load', mas agora voltada para ARQUIVOS
    @Override
    public void load() {
        // Lógica específica para carregar ARQUIVOS
        System.out.println("Carregando base dos arquivos...");
    }

    // Escreve a regra do 'remove', mas agora voltada para ARQUIVOS
    @Override
    public void remove() {
        // Lógica específica para remover ARQUIVOS
        System.out.println("Removendo base de arquivos...");
    }
}