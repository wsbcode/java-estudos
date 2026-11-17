package AorientacaoObjetos.Ninterfaces.test;


import AorientacaoObjetos.Ninterfaces.domin.DataBaseLoader;
import AorientacaoObjetos.Ninterfaces.domin.FileLoader;

public class DataLoaderTST01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        dataBaseLoader.remove();
        dataBaseLoader.checkPermission();
        dataBaseLoader.retrieveMaxDateSize();
        System.out.println("-----------");
        fileLoader.load();
        fileLoader.remove();
        fileLoader.checkPermission();
        fileLoader.retrieveMaxDateSize();
    }
}
