package java03objeto.modificadorStatico;

public class Carro {
    // // Atributos de INSTÂNCIA (cada carro criado com 'new' tem o seu próprio)
    private String nome;
    private double velocidadeMaxima;

    // // Atributo ESTÁTICO: Único e compartilhado por TODOS os carros da classe!
    // // Se este limite mudar para 180, muda para todos os carros ao mesmo tempo.
    private static double velocidadeLimite = 300;

    // // Construtor para inicializar os atributos individuais (nome e velocidade máxima)
    Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // // Método de INSTÂNCIA: Imprime as informações do carro atual
    public void imprimir() {
        System.out.println("----------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade-Maxima " + this.velocidadeMaxima);

        // // Acessa a variável estática direto pelo nome da Classe (Carro.velocidadeLimite)
        System.out.println("Velocidade-Limite " + Carro.velocidadeLimite);
    }

    // // Método ESTÁTICO: Altera o limite de velocidade para TODOS os carros
    // // Não usa 'this' porque pertence à Classe e não a um carro específico
    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    // // Método ESTÁTICO: Retorna o limite de velocidade compartilhado
    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    // // Getter para ler o Nome do carro individual
    public String getNome() {
        return nome;
    }

    // // Setter para alterar o Nome do carro individual
    public void setNome(String nome) {
        this.nome = nome;
    }

    // // Getter para ler a Velocidade Máxima individual
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    // // Setter para alterar a Velocidade Máxima individual
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}