package aOrientacaoObjetos.Lenumeracao.test;

// Importa as classes e enums necessários para rodar o teste de clientes e enumerações
import aOrientacaoObjetos.Lenumeracao.domin.Cliente;
import aOrientacaoObjetos.Lenumeracao.domin.TipoCliente;
import aOrientacaoObjetos.Lenumeracao.domin.TipoPagamento;

public class ClienteTST01 {
    // Método principal onde o programa começa a rodar
    public static void main(String[] args) {

        // Cria dois objetos Cliente passando o nome, o TipoCliente (Enum) e o TipoPagamento (Enum) correspondentes
        Cliente cliente1 = new Cliente("Will", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Ale ", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        // Imprime os dados dos clientes na tela (o Java chama automaticamente o método toString() sobrescrito na classe Cliente)
        System.out.println(cliente1);
        System.out.println(cliente2);

        // Testa o método de cálculo de desconto diretamente pelas constantes do Enum TipoPagamento (passando o valor 100)
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        // Usa o método padrão do Java 'valueOf' para converter um texto exato ("PESSOA_FISICA") em uma constante real do Enum TipoCliente
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());

        // Testa o método personalizado 'tipoNomeRelatorio' buscando por "pessoa FISICA"
        // (ATENÇÃO: Como a busca faz uso de '.equals()', ela diferencia maiúsculas de minúsculas.
        // Se o texto passado não bater exatamente com o configurado no Enum, vai retornar null)
        TipoCliente tipoCliente2 = TipoCliente.tipoNomeRelatorio("pessoa FISICA");
        System.out.println(tipoCliente2);
    }
}