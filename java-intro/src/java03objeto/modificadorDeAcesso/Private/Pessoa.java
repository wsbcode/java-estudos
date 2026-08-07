package java03objeto.modificadorDeAcesso.Private;

public class Pessoa {
    // // Encapsulamento: atributos privados, acessíveis apenas dentro da classe Pessoa
    private String nome;
    private int idade;
    private char sexo;

    // // Método para exibir todas as informações na tela
    public void imprimirPessoa() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
    }

    // // SETTERS: Usados para ALTERAR / GUARDAR dados com segurança

    // // Altera o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // // Altera a idade validando para não aceitar números negativos
    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade invalida");
            return;
        }
        this.idade = idade;
    }

    // // Altera o sexo validando apenas para 'M' ou 'F'
    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F') {
            this.sexo = sexo;
        } else {
            System.out.println("Sexo invalido");
        }
    }

    // // GETTERS: Usados para LER / RETORNAR o valor que está salvo

    // // Retorna o nome salvo
    public String getNome() {
        return this.nome;
    }

    // // Retorna a idade salva
    public int getIdade() {
        return this.idade;
    }

    // // Retorna o sexo salvo
    public char getSexo() {
        return this.sexo;
    }
}