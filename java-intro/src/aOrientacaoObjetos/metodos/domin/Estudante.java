package aOrientacaoObjetos.metodos.domin;

// Define a classe Estudante (molde para criar objetos do tipo estudante)
public class Estudante {

    // Atributo para guardar o nome do estudante
    public String nome;

    // Atributo para guardar o sexo do estudante
    public String sexo;

    // Atributo para guardar a idade do estudante (número inteiro)
    public int idade;

    // Método que imprime na tela as informações do estudante
    public void imprimir(){
        // Usa o 'this' para pegar os dados do objeto atual que está chamando o método
        System.out.println("Nome: "+this.nome);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("Idade: "+this.idade);

        // Imprime uma linha para separar visualmente no console
        System.out.println("____________________________");
    }
}