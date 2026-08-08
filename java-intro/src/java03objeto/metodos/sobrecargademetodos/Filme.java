package java03objeto.metodos.sobrecargademetodos;

public class Filme {
    // // Atributos privados: apenas a própria classe Filme tem acesso direto
    private String nome;
    private int ano;
    private String genero;
    private double IMDb;

    // // Método init simples: recebe e salva os 3 dados básicos
    public void init(String nome, int ano, String genero) {
        this.nome = nome;
        this.ano = ano;
        this.genero = genero;
    }

    // // Sobrecarga do init: aceita 4 parâmetros (incluindo o IMDb)
    public void init(String nome, int ano, String genero, double IMDb) {
        // // Chama o primeiro init para reaproveitar o código sem repetir linhas
        this.init(nome, ano, genero);
        this.IMDb = IMDb;
    }

    // // Método para exibir todas as informações do filme organizadas na tela
    public void imprimeFilme() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano: " + this.ano);
        System.out.println("Genero: " + this.genero);
        System.out.println("IMDb: " + this.IMDb);
        System.out.println("----------------------");
    }

    // // Getter do IMDb: devolve o valor da nota
    public double getIMDb() {
        return IMDb;
    }

    // // Setter do IMDb: altera o valor da nota
    public void setIMDb(double IMDb) {
        this.IMDb = IMDb;
    }

    // // Getter do Nome: devolve o nome salvo
    public String getNome() {
        return nome;
    }

    // // Setter do Nome: altera o nome salvo
    public void setNome(String nome) {
        this.nome = nome;
    }

    // // Getter do Ano: devolve o ano salvo
    public int getAno() {
        return ano;
    }

    // // Setter do Ano: altera o ano salvo
    public void setAno(int ano) {
        this.ano = ano;
    }

    // // Getter do Gênero: devolve o gênero salvo
    public String getGenero() {
        return genero;
    }

    // // Setter do Gênero: altera o gênero salvo
    public void setGenero(String genero) {
        this.genero = genero;
    }
}