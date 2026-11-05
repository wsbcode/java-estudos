package aOrientacaoObjetos.LmodificadorFinal.domin;

// Define a classe Carro (molde para criar objetos do tipo carro)
public class Carro {

    // Atributo privado para guardar o nome do carro
    private String nome;

    // 'public static final': cria uma constante global.
    // 'static' significa que pertence à classe (todos os carros compartilham o mesmo limite),
    // e 'final' significa que o valor (500) não pode mais ser alterado após ser definido.
    public static final double VELOCIDADE_LIMITE = 500;

    // 'final' em uma variável de referência (como um objeto) significa que a variável NÃO pode apontar para outro objeto depois de criada.
    // Porém, os dados/atributos DENTRO do objeto 'Comprador' ainda podem ser alterados normalmente.
    public final Comprador COMPRADOR = new Comprador();

    // Método 'getNome' (getter): pega/consulta o nome do carro
    public String getNome() {
        return nome;
    }

    // Método 'setNome' (setter): altera ou define o nome do carro
    public void setNome(String nome) {
        this.nome = nome;
    }
}