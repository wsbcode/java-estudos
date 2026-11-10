package aOrientacaoObjetos.MclassesAbstratas.domin;

// Define a classe abstrata 'Funcionario'.
// A palavra 'abstract' significa que esta classe serve apenas como modelo base (superclasse) e NÃO pode ser instanciada diretamente com 'new Funcionario(...)'.
public abstract class Funcionario {

    // Atributos protegidos: nome e salário, acessíveis pelas classes filhas que herdarão de Funcionario
    protected String nome;
    protected double salario;

    // Construtor da classe abstrata: executado quando uma classe filha é criada, inicializando o nome e o salário
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

        // Chamada de método dentro do construtor:
        // ATENÇÃO: Chamar um método abstrato ou sobrescrito aqui pode ser perigoso se a classe filha ainda não terminou de inicializar,
        // mas o objetivo aqui é forçar o cálculo logo na criação.
        calculaSalario();
    }

    // Método abstrato ('abstract'): não possui corpo (chaves `{}`).
    // Ele funciona como uma "regra" ou contrato obrigatório:
    // qualquer classe filha que herdar de Funcionario é OBRIGADA a criar a sua própria versão (sobrescrever) deste método.
    public abstract void calculaSalario();

}