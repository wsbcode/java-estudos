package Polimorfismo.servico;

import Polimorfismo.repositorio.Repositorio;

// // Assina o mesmo contrato Repositorio
public class RepositorioBancoDeDados implements Repositorio {
    // // Cumpre o contrato salvando no Banco de Dados
    @Override
    public void salvar() {
        System.out.println("Salvo no banco de dados");
    }
}