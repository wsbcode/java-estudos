package AorientacaoObjetos.Opolimorfismo.teste;

import AorientacaoObjetos.Opolimorfismo.repositorio.Repositorio;
import AorientacaoObjetos.Opolimorfismo.servico.RepositorioArquivo;
import AorientacaoObjetos.Opolimorfismo.servico.RepositorioBancoDeDados;
import AorientacaoObjetos.Opolimorfismo.servico.RepositorioMemoria;

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
