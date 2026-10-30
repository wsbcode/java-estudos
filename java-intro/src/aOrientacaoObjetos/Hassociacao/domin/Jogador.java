package aOrientacaoObjetos.Hassociacao.domin;

public class Jogador {
    private String nome;
    private Time time;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        if (time != null) {
            System.out.println("Time: " + this.time.getNome());
        }
    }

    public Jogador(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
