package aOrientacaoObjetos.Hassociacao.exercicio.domin;

// Define a classe Seminario (molde para criar objetos do tipo seminário no sistema)
public class Seminario {

    // Atributos privados: o título do seminário, a lista (array) de alunos inscritos e o local onde ele vai acontecer
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    // Construtor: exige que você informe o título, a lista de alunos e o local ao criar o seminário
    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    // Método 'getTitulo' (getter): pega/consulta o título do seminário
    public String getTitulo() {
        return titulo;
    }

    // Método 'setTitulo' (setter): altera ou define o título do seminário
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Método 'getAlunos' (getter): pega/consulta a lista de alunos inscritos no seminário
    public Aluno[] getAlunos() {
        return alunos;
    }

    // Método 'setAlunos' (setter): altera ou define a lista de alunos do seminário
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    // Método 'getLocal' (getter): pega/consulta o local onde o seminário vai acontecer
    public Local getLocal() {
        return local;
    }

    // Método 'setLocal' (setter): altera ou define o local do seminário
    public void setLocal(Local local) {
        this.local = local;
    }
}