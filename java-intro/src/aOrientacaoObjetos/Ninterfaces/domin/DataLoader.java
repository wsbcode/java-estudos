package aOrientacaoObjetos.Ninterfaces.domin;

// Define a interface 'DataLoader' (contrato para carregar dados).
// Uma interface estabelece o que deve ser feito, mas deixa que as classes que a implementam decidam como fazer.
public interface DataLoader {

    // Constante pública, estática e final ('public static final'):
    // Por padrão, qualquer variável criada em uma interface já é automaticamente isso.
    // O valor 100 não poderá mais ser alterado.
    public static final int MAX_DATE_SIZE = 100;

    // Método abstrato ('public abstract'): obriga qualquer classe que assinar este contrato
    // a criar a sua própria versão (código) do método 'load()'.
    public abstract void load();

    // Método padrão ('default'): introduzido a partir do Java 8.
    // Permite criar um método com corpo direto na interface, servindo como um comportamento padrão
    // que as classes filhas herdam automaticamente (mas que ainda podem sobrescrever se quiserem).
    public default void checkPermission() {
        System.out.println("Checking permission...");
    }

    // Método estático ('static'): pertence exclusivamente à interface.
    // É chamado diretamente pelo nome da interface (ex: DataLoader.retrieveMaxDateSize()),
    // sem precisar de um objeto instanciado. Não é herdado nem sobrescrito pelas classes.
    public static void retrieveMaxDateSize() {
        System.out.println("Dentro do retrieveMaxDateSize");
    }

}