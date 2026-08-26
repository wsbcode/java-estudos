package modificadorfinal.dominio;

// // Classe que representa um Comprador
public class Comprador {
    // // Atributo privado para armazenar o nome
    private String nome;

    // // Sobrescreve o toString() para exibir os dados do comprador em texto
    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    // // Getter para ler o nome do comprador
    public String getNome() {
        return nome;
    }

    // // Setter para alterar o nome do comprador
    public void setNome(String nome) {
        this.nome = nome;
    }
}