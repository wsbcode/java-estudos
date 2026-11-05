package aOrientacaoObjetos.Menumeracao.domin;

import aOrientacaoObjetos.LmodificadorFinal.domin.Comprador;

public class Cliente {
    private String nome;
    private String tipo;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoCliente=" + tipoCliente.getVALOR() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
