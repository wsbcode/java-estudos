package aOrientacaoObjetos.KmodificadorFinal.domin;

// Define a classe Comprador (molde para criar objetos que representam quem compra um carro)
public class Comprador {

    // Atributo privado para guardar o nome do comprador
    private String nome;

    // Anotação '@Override': sobrescreve o método 'toString' para exibir o nome do comprador de forma organizada quando o objeto for impresso
    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    // Método 'getNome' (getter): pega/consulta o nome do comprador
    public String getNome() {
        return nome;
    }

    // Método 'setNome' (setter): altera ou define o nome do comprador
    public void setNome(String nome) {
        this.nome = nome;
    }
}