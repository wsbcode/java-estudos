package aOrientacaoObjetos.GmodificadorStatic.domin;

// Define a classe Carro, que serve de molde para criar objetos do tipo carro
public class Carro {

    // Atributos normais (cada carro tem o seu próprio nome e velocidade máxima)
    private String nome;
    private double VelocidadeMaxima;

    // Atributo 'static': significa que ele pertence à CLASSE e não a um carro específico.
    // Todos os carros criados vão compartilhar exatamente o mesmo valor de VelocidadeLimite (250).
    public static double VelocidadeLimite = 250;

    // Construtor: usado para dar um nome e uma velocidade máxima ao criar o carro
    public Carro(String nome, double VelocidadeMaxima) {
        this.nome = nome;
        this.VelocidadeMaxima = VelocidadeMaxima;
    }

    // Método 'setVelocidadeLimite' (setter estático): pega o valor recebido nos parênteses
    // e atualiza a velocidade limite compartilhada de todos os carros.
    public static void setVelocidadeLimite(double VelocidadeLimite) {
        Carro.VelocidadeLimite = VelocidadeLimite;
    }

    // Método 'getVelocidadeLimite' (getter): serve para consultar/pegar o valor atual da velocidade limite da classe.
    public double getVelocidadeLimite() {
        return Carro.VelocidadeLimite;
    }

    // Método para imprimir as informações do carro na tela
    public void imprimir() {
        System.out.println("________________________");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.VelocidadeMaxima);

        // Note que para acessar a VelocidadeLimite usamos o nome da classe (Carro.)
        // porque ela é estática e compartilhada por todos.
        System.out.println("Velocidade Limete: " + Carro.VelocidadeLimite);
    }

    // Método 'getNome' (getter): pega/consulta o nome do carro
    public String getNome() {
        return nome;
    }

    // Método 'setNome' (setter): altera ou define o nome do carro
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método 'getVelocidadeMaxima' (getter): pega/consulta a velocidade máxima
    public double getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    // Método 'setVelocidadeMaxima' (setter): altera ou define a velocidade máxima
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        VelocidadeMaxima = velocidadeMaxima;
    }
}