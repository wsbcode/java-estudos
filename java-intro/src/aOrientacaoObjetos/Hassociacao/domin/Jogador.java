package aOrientacaoObjetos.Hassociacao.domin;

// Define a classe Jogador (molde para criar objetos do tipo jogador de futebol)
public class Jogador {

    // Atributos privados: o nome do jogador e o time ao qual ele pertence (associação entre objetos)
    private String nome;
    private Time time;

    // Método para imprimir as informações do jogador na tela
    public void imprimir() {
        System.out.println("Nome: " + this.nome);

        // Verifica se o jogador tem um time cadastrado (se não é nulo) antes de tentar pegar o nome dele
        if (time != null) {
            System.out.println("Time: " + this.time.getNome());
        }
    }

    // Construtor: exige que você informe o nome do jogador ao criá-lo
    public Jogador(String nome) {
        this.nome = nome;
    }

    // Método 'getNome' (getter): pega/consulta o nome do jogador
    public String getNome() {
        return nome;
    }

    // Método 'setNome' (setter): altera ou define o nome do jogador
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método 'getTime' (getter): pega/consulta o objeto Time associado ao jogador
    public Time getTime() {
        return time;
    }

    // Método 'setTime' (setter): altera ou define o time do jogador
    public void setTime(Time time) {
        this.time = time;
    }
}