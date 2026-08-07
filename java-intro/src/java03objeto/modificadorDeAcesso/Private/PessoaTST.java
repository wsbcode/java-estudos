package java03objeto.modificadorDeAcesso.Private;

public class PessoaTST {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        // // Usando os SETTERS para enviar os dados
        p1.setNome("William");
        p1.setIdade(33);
        p1.setSexo('M');

        // // Imprime usando o método próprio da classe
        p1.imprimirPessoa();

        System.out.println("-------------------------");

        // // Usando os GETTERS para ler e montar uma frase
        System.out.println(p1.getNome() + " " + p1.getIdade() + " " + p1.getSexo());
    }
}