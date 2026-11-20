package Cexecoes.Aexecoes.exeption.test;

// Importa File para trabalhar com caminhos de arquivo e IOException para erros de entrada/saída
import java.io.File;
import java.io.IOException;
// Importação não utilizada neste código (pode ser removida sem afetar a execução)
import java.rmi.RemoteException;

public class ExeptionTST02 {

    // O 'main' também colocou 'throws IOException' porque chama 'criarNovoArquivo()', que pode lançar esse erro
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
        // deleteArquivo();
    }

    // Avisa ('throws IOException') que este método pode deixar um IOException escapar para quem chamou
    private static void criarNovoArquivo() throws IOException {
        // Aponta para "arquivos\teste.txt" (agora corrigido para "arquivos" com um 'o')
        File file = new File("arquivos\\teste.txt");

        // Tenta criar o arquivo no disco
        try {
            // Guarda em 'Iscriado' se o arquivo foi criado (true) ou se já existia/não deu (false)
            boolean Iscriado = file.createNewFile();
            // Agora exibe junto se retornou true ou false
            System.out.println("Arquivo criado com sucesso " + Iscriado);

            // Captura especificamente erros de entrada/saída (IOException)
        } catch (IOException e) {
            // Mostra o rastreamento do erro no console
            e.printStackTrace();
            // Relança o mesmo erro ('throw e') para quem chamou o método ('main') também ficar sabendo
            throw e;
        }
    }

    // Método auxiliar para tentar apagar "arquivos\test.txt"
    private static void deleteArquivo() {
        File file = new File("arquivos\\test.txt");

        try {
            // Tenta apagar o arquivo (retorna true se apagou e false se não conseguiu)
            boolean Iscriado = file.delete();
            System.out.println("Arquivo deletado com sucesso");

            // Captura qualquer exceção genérica caso aconteça
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}