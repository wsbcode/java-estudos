package aOrientacaoObjetos.Iheranca.domin;

// Define a classe Endereco (molde para guardar informações de rua e CEP)
public class Endereco {

    // Atributos privados: o nome da rua e o número do CEP
    private String rua;
    private int cep;

    // Método 'getRua' (getter): pega/consulta o nome da rua
    public String getRua() {
        return rua;
    }

    // Método 'setRua' (setter): altera ou define o nome da rua
    public void setRua(String rua) {
        this.rua = rua;
    }

    // Método 'getCep' (getter): pega/consulta o valor do CEP
    public int getCep() {
        return cep;
    }

    // Método 'setCep' (setter): altera ou define o valor do CEP
    public void setCep(int cep) {
        this.cep = cep;
    }
}