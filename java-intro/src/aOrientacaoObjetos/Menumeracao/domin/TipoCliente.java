package aOrientacaoObjetos.Menumeracao.domin;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa Fisica"),
    PESSOA_JURIDICA(2,"Pessoa Juridica");

    public final int valor;
    public final String nomeRelatorio;
    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : TipoCliente.values()){
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
       }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getVALOR() {
        return valor;
    }
}
