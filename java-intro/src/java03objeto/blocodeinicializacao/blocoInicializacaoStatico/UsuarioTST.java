package java03objeto.blocodeinicializacao.blocoInicializacaoStatico;

public class UsuarioTST {
    public static void main(String[] args) {
        // // Cria o 1º objeto: Roda o bloco STATIC (1ª vez) e depois o bloco NORMAL
        Usuario novoUsuario1 = new Usuario();

        // // Cria o 2º objeto: Roda APENAS o bloco NORMAL
        Usuario novoUsuario2 = new Usuario();

        // // Array com as novas habilidades
        String[] minhaSatcks = {"Java", "Spring Boot", "Git"};

        // // Preenche os dados do 'novoUsuario2'
        novoUsuario2.setNome("William");
        novoUsuario2.setIdade(33);
        novoUsuario2.setGenero("Masculino");

        // // ATENÇÃO: Como 'habilidades' é STATIC na classe Usuario,
        // // alterar aqui vai mudar o array do 'novoUsuario2' E TAMBÉM do 'novoUsuario1'!
        novoUsuario2.setHabilidades(minhaSatcks);

        // // Imprime o usuario1: Nome será 'null', mas terá as habilidades {"Java", "Spring Boot", "Git"}
        novoUsuario1.imprimir();

        System.out.println("____________________________");

        // // Imprime o usuario2 com todos os dados preenchidos
        novoUsuario2.imprimir();
    }
}