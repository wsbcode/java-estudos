package java03objeto.modificadorStatico;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 300;

    Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }


    public void imprimir() {
        System.out.println("----------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade-Maxima " + this.velocidadeMaxima);
        System.out.println("Velocidade-Limite " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;

    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}

