package aOrientacaoObjetos.Ninterfaces.domin;

// Define a classe FileLoader que implementa (cumpre o contrato de) duas interfaces: DataLoader e DataRemove.
// Assim como o DatabaseLoader, esta classe fornece implementações específicas para carregar e remover arquivos.
public class FileLoader implements DataLoader, DataRemove {

    // Sobrescreve o método 'load()' exigido pela interface DataLoader.
    // Aqui implementamos a lógica específica para carregar dados a partir de um arquivo.
    @Override
    public void load() {
        System.out.println("Carregando arquivo... load");
    }

    // Sobrescreve o método 'remove()' exigido pela interface DataRemove.
    // Aqui implementamos a lógica específica para remover dados/arquivos.
    @Override
    public void remove() {
        System.out.println("Removendo arquivo... remove");
    }

    // Sobrescreve o método 'checkPermission()' para definir a regra de verificação de permissões voltada para arquivos.
    @Override
    public void checkPermission() {
        System.out.println("FileLoader checkPermission");
    }

    // Método estático próprio da classe FileLoader.
    // Assim como vimos na outra classe, métodos estáticos pertencem à própria classe e não participam de sobrescrita de polimorfismo.
    public static void retrieveMaxDateSize() {
        System.out.println("Dentro do FileLoader retrieveMaxDateSize");
    }
}