package aOrientacaoObjetos.metodos.domin;

public class Estudante {
    public String nome;
    public String sexo;
    public int idade;

    public void imprimir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("Idade: "+this.idade);
        System.out.println("____________________________");
    }
}
