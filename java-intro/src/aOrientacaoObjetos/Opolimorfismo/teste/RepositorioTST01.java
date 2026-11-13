package aOrientacaoObjetos.Opolimorfismo.teste;

import aOrientacaoObjetos.Opolimorfismo.repositorio.Repositorio;
import aOrientacaoObjetos.Opolimorfismo.servico.RepositorioArquivo;
import aOrientacaoObjetos.Opolimorfismo.servico.RepositorioBancoDeDados;
import aOrientacaoObjetos.Opolimorfismo.servico.RepositorioMemoria;

public class RepositorioTST01 {
    public static void main(String[] args) {
        Repositorio repositorio1 = new RepositorioArquivo();
        Repositorio repositorio2 = new RepositorioMemoria();
        Repositorio repositorio3 = new RepositorioBancoDeDados();
       repositorio1.salvar();
       repositorio2.salvar();
       repositorio3.salvar();
    }
}
