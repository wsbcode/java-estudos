package Polimorfismo.test;

import Polimorfismo.repositorio.Repositorio;
import Polimorfismo.servico.RepositorioArquivo;
import Polimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTST {
    public static void main(String[] args) {
        // // Polimorfismo: variável de tipo genérico (Repositorio) recebendo a implementação (RepositorioBancoDeDados)
        Repositorio repositorio = new RepositorioBancoDeDados();

        // // Executa o salvar do Banco de Dados. Se mudar 'new RepositorioBancoDeDados()' para 'new RepositorioArquivo()', o resto do código continua igual!
        repositorio.salvar();
    }
}