package Heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public void imprimir() {
        // Usar o metodo imprimir da classe Pessoa, e atribui parametros depois
        super.imprimir();
        System.out.println("Salario " + this.salario);
        // Acessando atributo da classe Pessoa com protected
        System.out.println("Salário recebido por " + "Nome " + this.nome);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
