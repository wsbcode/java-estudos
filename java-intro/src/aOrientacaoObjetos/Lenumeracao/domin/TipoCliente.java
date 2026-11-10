package aOrientacaoObjetos.Lenumeracao.domin;

// Define um Enum chamado 'TipoCliente' (um conjunto fixo de constantes para representar os tipos de clientes)
public enum TipoCliente {

    // Constantes do Enum. Cada uma representa um tipo e passa valores para o construtor:
    // PESSOA_FISICA recebe o valor "PIX" e o nome do relatório "Pessoa física"
    PESSOA_FISICA("PIX","Pessoa física"),

    // PESSOA_JURIDICA recebe o valor "CREDITO" e o nome do relatório "Pessoa jurídica"
    PESSOA_JURIDICA("CREDITO","Pessoa jurídica");

    // Atributos finais ('final'): guardam os valores associados a cada constante do Enum
    public final String valor;
    public final String nomeRelatorio;

    // Construtor do Enum (sempre privado por padrão): inicializa os atributos de cada constante criada acima
    TipoCliente(String valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    // Método estático para buscar um TipoCliente com base no nome do relatório (ex: procurar "Pessoa física")
    public static TipoCliente tipoNomeRelatorio(String nomeRelatorio){
        // Percorre todas as opções disponíveis no Enum usando o método '.values()'
        for (TipoCliente tipoCliente : TipoCliente.values()){
            // Se o nome do relatório do tipo atual for igual ao que estamos procurando, retorna esse tipo
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        // Se não encontrar nenhum correspondente, retorna null
        return null;
    }

    // Método 'getNome' (getter): pega/consulta o nome amigável do relatório
    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    // Método 'getVALOR' (getter): pega/consulta o valor associado (ex: "PIX" ou "CREDITO")
    public String getVALOR() {
        return valor;
    }
}