package associacao.dominio;

public class Professor {
    private String nome;

    // // Construtor: Torna OBRIGATÓRIO passar o nome do professor
    public Professor(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}