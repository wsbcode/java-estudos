package java03objeto.blocodeinicializacao;

public class Serie {
    // // Atributos privados da classe
    private String nome;
    private int[] episodios;

    // // BLOCO DE INICIALIZAÇÃO DE INSTÂNCIA
    // // Este bloco roda AUTOMATICAMENTE sempre que um 'new Serie()' é chamado,
    // // e ele executa SEMPRE ANTES de qualquer construtor!
    {
        System.out.println("Dentro do bloco de Inicialização");

        // // Cria um array com espaço para 5 números inteiros
        episodios = new int[5];

        // // Preenche o array com os números de 1 até 5
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1; // // Na posição 0 guarda 1, na posição 1 guarda 2...
        }
    }

    // // Construtor 1: Recebe o nome da série como parâmetro
    public Serie(String nome) {
        // // O bloco de inicialização já rodou antes de chegar nesta linha!
        this.nome = nome;
    }

    // // Construtor 2: Construtor vazio (sem parâmetros)
    public Serie() {
        // // O bloco de inicialização também roda antes deste construtor!
        System.out.println("Fora do bloco de inicialização");
    }

    // // Getter para ler o Nome
    public String getNome() {
        return nome;
    }

    // // Setter para alterar o Nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // // Getter para pegar o array de Episódios
    public int[] getEpisodios() {
        return episodios;
    }

    // // Setter para alterar o array de Episódios completo
    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}