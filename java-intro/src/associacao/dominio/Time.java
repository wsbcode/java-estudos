package associacao.dominio;

public class Time {
    private String nome;

    // // Construtor: Torna OBRIGATÓRIO informar o nome do time
    public Time(String nome) {
        this.nome = nome;
    }

    // // Método simples para imprimir o nome do time
    public void imprimir(){
        System.out.println("Nome: " + nome);
    }

    // // Getter do nome
    public String getNome() {
        return nome;
    }

    // // Setter do nome
    public void setNome(String nome) {
        this.nome = nome;
    }
}