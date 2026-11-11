package aOrientacaoObjetos.Ninterfaces.domin;

// Define a classe DataBaseLoader que implementa (cumpre o contrato de) duas interfaces: DataLoader e DataRemove.
// Em Java, uma classe pode implementar múltiplas interfaces, simulando herança múltipla de comportamentos.
public class DataBaseLoader implements DataLoader, DataRemove {

    // Sobrescreve o método 'load()' que veio do contrato da interface DataLoader.
    // Aqui é escrita a lógica específica para carregar dados do banco de dados.
    @Override
    public void load() {
        System.out.println("DataBaseLoader load");
    }

    // Sobrescreve o método 'remove()' que veio do contrato da interface DataRemove.
    // Aqui é escrita a lógica específica para remover dados do banco de dados.
    @Override
    public void remove() {
        System.out.println("DataBaseLoader remove");
    }

    // Sobrescreve o método 'checkPermission()' (que provavelmente existia nas interfaces ou na superclasse).
    // Como a classe implementa interfaces que podem ter conflitos ou métodos padrão, aqui definimos a versão própria da classe para checar permissões.
    @Override
    public void checkPermission() {
        System.out.println("DataBaseLoader checkPermission");
    }

    // Método estático próprio da classe DataBaseLoader.
    // ATENÇÃO: Métodos estáticos NÃO são sobrescritos (override). Se houver um método estático com o mesmo nome na interface,
    // este método aqui apenas "esconde" o da interface quando chamado a partir da classe, mas não participa do polimorfismo.
    public static void retrieveMaxDateSize() {
        System.out.println("Dentro do DataBaseLoader retrieveMaxDateSize");
    }
}