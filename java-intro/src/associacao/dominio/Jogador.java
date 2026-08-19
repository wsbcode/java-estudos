package associacao.dominio;

public class Jogador {
    private String nome;

    // // Associação: Atributo do tipo Time (O Jogador tem um Time)
    private Time time;

    // // Método para exibir os dados do jogador no console
    public void imprimir() {
        System.out.println("Nome do Jogador: " + nome);

        // // Proteção: Só tenta imprimir o nome do time se ele não for nulo (evita erro)
        if (time != null) {
            System.out.println(time.getNome());
        }
    }

    // // Construtor: Torna OBRIGATÓRIO informar o nome ao criar o jogador
    public Jogador(String nome) {
        this.nome = nome;
    }

    // // Getter do nome
    public String getNome() {
        return nome;
    }

    // // Setter do nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // // Getter do time associado
    public Time getTime() {
        return time;
    }

    // // Setter para ASSOCIAR ou alterar o time do jogador
    public void setTime(Time time) {
        this.time = time;
    }
}