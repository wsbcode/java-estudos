package blocodeinicializacao.dominio;

import java.util.Arrays;

public class Usuario {

    // // Atributos de INSTÂNCIA (cada usuário terá o seu próprio nome, idade e gênero)
    private String nome;
    private int idade;
    private String genero;

    // // Atributo ESTÁTICO (compartilhado por TODOS os objetos da classe)
    private static String[] habilidades;

    // // BLOCO DE INICIALIZAÇÃO ESTÁTICO
    // // Roda Apenas 1 vez quando a classe é carregada na memória
    static {
        System.out.println("Carregando dados do cliente STATIC:");

        // // Inicializa e preenche o array estático compartilhado
        habilidades = new String[3];
        habilidades[0] = "Aqui";
        habilidades[1] = "Aqui";
        habilidades[2] = "Aqui";

        // // Imprime as habilidades padrão no console
        for (int i = 0; i < habilidades.length; i++) {
            System.out.println(i + ": " + habilidades[i]);
        }
    }

    // // BLOCO DE INICIALIZAÇÃO NORMAL
    // // Roda TODA VEZ que você cria um objeto novo com 'new'
    {
        System.out.println("Preencha os dados do cliente NORMAL:");
    }

    // // Método para exibir os dados do usuário no console
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Genero: " + this.genero);

        // // Converte o Array em texto legível para imprimir de uma vez
        System.out.println("Habilidades:" + Arrays.toString(this.habilidades));
    }

    // // Getter do Nome (Nota: não precisa receber 'String nome' no parâmetro)
    public String getNome(String nome) {
        return nome;
    }

    // // Setter para alterar o Nome do usuário
    public void setNome(String nome) {
        this.nome = nome;
    }

    // // Getter para ler a Idade
    public int getIdade() {
        return idade;
    }

    // // Setter para alterar a Idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // // Getter para ler o Gênero
    public String getGenero() {
        return genero;
    }

    // // Setter para alterar o Gênero
    public void setGenero(String genero) {
        this.genero = genero;
    }

    // // Getter para ler as Habilidades compartilhadas
    public String[] getHabilidades() {
        return habilidades;
    }

    // // Setter para alterar as Habilidades compartilhadas
    public void setHabilidades(String[] habilidades) {
        Usuario.habilidades = habilidades;
    }
}