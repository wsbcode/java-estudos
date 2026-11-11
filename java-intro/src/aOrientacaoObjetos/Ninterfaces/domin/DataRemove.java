package aOrientacaoObjetos.Ninterfaces.domin;

// Define uma interface chamada 'DataRemove' (contrato exclusivo para remoção de dados).
// Assim como outras interfaces, ela serve para padronizar comportamentos sem se preocupar com os detalhes de como a remoção será feita.
public interface DataRemove {

    // Método abstrato ('public abstract'): obriga qualquer classe que implementar esta interface
    // a criar a sua própria lógica para o método 'remove()'.
    public abstract void remove();
}