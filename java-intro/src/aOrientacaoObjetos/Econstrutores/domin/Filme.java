package aOrientacaoObjetos.Econstrutores.domin;


public class Filme {
    private String nome;
    private String tipo;
    private int episodios;
    private int anoLancamento;
    private String director;

    public Filme(String nome, String tipo, int episodios, int anoLancamento) {

        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.anoLancamento = anoLancamento;
    }

    public Filme(String nome, String tipo, int episodios, int anoLancamento, String director) {
        this(nome, tipo, episodios, anoLancamento);
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.anoLancamento = anoLancamento;
        this.director = director;
    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.anoLancamento);
        System.out.println(this.director);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

}

