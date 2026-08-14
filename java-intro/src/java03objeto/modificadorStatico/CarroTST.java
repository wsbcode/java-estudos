package java03objeto.modificadorStatico;

public class CarroTST {
    public static void main(String[] args) {
        Carro c1 = new Carro("Celta", 1000);
        Carro c2 = new Carro("Gol", 200);
        Carro c3 = new Carro("MBW", 500);

        Carro.setVelocidadeLimite(560);

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();


    }
}
