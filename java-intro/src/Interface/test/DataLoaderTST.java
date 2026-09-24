package Interface.test;

import Interface.dominio.DataBaseLoader;
import Interface.dominio.FileLoader;

public class DataLoaderTST {
    public static void main(String[] args) {
        DataBaseLoader databaseloader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseloader.load();
        fileLoader.load();

        System.out.println("-------------------------");

        databaseloader.remove();
        fileLoader.remove();
    }
}
