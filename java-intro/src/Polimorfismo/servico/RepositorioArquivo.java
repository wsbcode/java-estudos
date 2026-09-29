package Polimorfismo.servico;

import Polimorfismo.repositorio.Repositorio;

// // Assina o contrato Repositorio
public class RepositorioArquivo implements Repositorio {
    // // Cumpre o contrato salvando no formato de Arquivo
    @Override
    public void salvar() {
        System.out.println("Salvo nos Arquivos");
    }
}