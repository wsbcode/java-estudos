package aOrientacaoObjetos.Jsobrescrita.domin;

// Define a classe Filme (molde para criar objetos do tipo filme)
public class Filme {

    // Atributo privado para guardar o nome do filme
    private String nome;

    // Anotação '@Override': indica que estamos sobrescrevendo (reescrevendo) um método que já existe na classe mãe de todas (Object).
    // O método 'toString' serve para transformar o objeto em um texto legível quando mandamos imprimi-lo diretamente.
    @Override
    public String toString() {
        return " Filme { " + "nome = " + nome + '}';
    }

    // Construtor: exige que você informe o nome do filme logo ao criá-lo
    public Filme(String nome) {
        this.nome = nome;
    }

    // Método 'getNome' (getter): pega/consulta o nome do filme
    public String getNome() {
        return nome;
    }

    // Método 'setNome' (setter): altera ou define o nome do filme
    public void setNome(String nome) {
        this.nome = nome;
    }
}