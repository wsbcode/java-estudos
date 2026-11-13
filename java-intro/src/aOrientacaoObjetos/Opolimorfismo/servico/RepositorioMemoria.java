package aOrientacaoObjetos.Opolimorfismo.servico;

// Importa a interface Repositorio para permitir que a classe cumpra o contrato de salvamento
import aOrientacaoObjetos.Opolimorfismo.repositorio.Repositorio;

// Define a classe 'RepositorioMemoria' que implementa a interface 'Repositorio'
public class RepositorioMemoria implements Repositorio {

    // Sobrescreve o método 'salvar()' exigido pelo contrato da interface Repositorio.
    // Aqui implementamos a lógica para salvar os dados temporariamente na memória RAM (por exemplo, em uma lista ou mapa).
    @Override
    public void salvar() {
        System.out.println("Salvando na Memoria");
    }
}