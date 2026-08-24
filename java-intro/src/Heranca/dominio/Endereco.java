package Heranca.dominio;

// // Classe simples que representa o Endereço (usada para Associação)
public class Endereco {
    // // Atributos privados (encapsulamento)
    private String rua;
    private String cep;

    // // Métodos Getters e Setters para acessar e alterar as variáveis privadas
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}