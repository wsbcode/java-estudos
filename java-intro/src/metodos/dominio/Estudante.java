package metodos.dominio;

public class Estudante {

    public String nome ;
    public int idade ;
    public char sexo ;

// Método já dentro da classe
// Porem em casos espécifico criar um pacote separado
    public void imprime(){
        System.out.println("__________________");

        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);

    }
}