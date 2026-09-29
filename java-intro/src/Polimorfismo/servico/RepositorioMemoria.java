package Polimorfismo.servico;

import Polimorfismo.repositorio.Repositorio;

// // Assina o mesmo contrato Repositorio
public class RepositorioMemoria implements Repositorio {
    // // Cumpre o contrato salvando na Memória RAM
    @Override
    public void salvar() {
        System.out.println("Salvo na Memoria");
    }
}