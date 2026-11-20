package Cexecoes.Aexecoes.exeption.test;

// Importa a classe File, usada para representar caminhos de arquivos ou pastas
import java.io.File;

public class ExeptionTST01 {

    // Método principal onde o programa começa a rodar
    public static void main(String[] args) {
        // Chama o método para tentar criar um novo arquivo
        criarNovoArquivo();
        // Linha comentada: se tirar o '//', também chamaria o método de deletar arquivo
        // deleteArquivo();
    }

    // Método auxiliar que tenta criar o arquivo test.txt dentro da pasta "arquivoos"
    private static void criarNovoArquivo() {
        // Cria um objeto File apontando para o caminho "arquivoos\test.txt"
        File file = new File("arquivoos\\test.txt");

        // Bloco 'try': tenta executar um código que pode dar erro
        try {
            // Tenta criar o arquivo no disco; retorna true se criou e false se já existia
            boolean Iscriado = file.createNewFile();
            // Aviso: aqui imprime "sucesso" mesmo se o arquivo já existia ('Iscriado' não foi checado)
            System.out.println("Arquivo criado com sucesso");

            // Bloco 'catch': captura qualquer erro ('Exception') que acontecer dentro do 'try'
        } catch (Exception e) {
            // Mostra no console o rastreamento do erro para ajudar a entender o que falhou
            e.printStackTrace();
        }
    }

    // Método auxiliar que tenta apagar o arquivo test.txt dentro da pasta "arquivos"
    private static void deleteArquivo() {
        // Cria um objeto File apontando para o caminho "arquivos\test.txt"
        File file = new File("arquivos\\test.txt");

        // Bloco 'try': tenta executar o comando de apagar o arquivo
        try {
            // Tenta deletar o arquivo; retorna true se apagou e false se não conseguiu/não existia
            boolean Iscriado = file.delete();
            // Aviso: também imprime aqui sem verificar o valor booleano retornado por 'delete()'
            System.out.println("Arquivo deletado com sucesso");

            // Bloco 'catch': captura qualquer erro inesperado durante a tentativa
        } catch (Exception e) {
            // Imprime os detalhes do erro no console
            e.printStackTrace();
        }
    }
}