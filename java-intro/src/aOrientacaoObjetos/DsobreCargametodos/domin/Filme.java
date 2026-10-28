package aOrientacaoObjetos.DsobreCargametodos.domin;

// Define a classe Filme, que serve de molde para criar objetos do tipo filme/série
public class Filme {

    // Atributos privados (privados significa que só podem ser alterados ou lidos através dos métodos da própria classe)
    private String nome;          // Guarda o nome do filme ou série
    private String tipo;          // Guarda o tipo (ex: "TV", "Filme", "Anime")
    private int episodios;        // Guarda a quantidade de episódios
    private int anoLancamento;    // Guarda o ano em que foi lançado

    // Primeiro método 'init' (usado para inicializar os dados principais sem o ano de lançamento)
    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;             // Atribui o nome recebido ao atributo da classe
        this.tipo = tipo;             // Atribui o tipo recebido
        this.episodios = episodios;   // Atribui a quantidade de episódios
    }

    // Segundo método 'init' (sobrecarga de método: tem o mesmo nome, mas recebe um parâmetro a mais: o ano)
    public void init(String nome, String tipo, int episodios, int anoLancamento) {
        // Aproveita o primeiro 'init' para preencher os três primeiros campos
        this.init(nome, tipo, episodios);
        // Preenche o ano de lançamento que é exclusivo deste método
        this.anoLancamento = anoLancamento;
    }

    // Método para imprimir todos os dados do filme de uma só vez no console
    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.anoLancamento);
    }

    // Método 'setNome' (setter): serve para alterar ou definir o valor do nome do filme depois de criado
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método 'getNome' (getter): serve para pegar/consultar o valor guardado no nome
    public String getNome() {
        return this.nome;
    }

    // Método 'setTipo' (setter): serve para alterar ou definir o tipo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método 'getTipo' (getter): serve para pegar/consultar o tipo
    public String getTipo() {
        return tipo;
    }

    // Método 'setEpisodios' (setter): serve para alterar ou definir a quantidade de episódios
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    // Método 'getEpisodios' (getter): serve para pegar/consultar a quantidade de episódios
    public int getEpisodios() {
        return episodios;
    }

    // Método 'getAnoLancamento' (getter): serve para pegar/consultar o ano de lançamento
    public int getAnoLancamento() {
        return anoLancamento;
    }
}