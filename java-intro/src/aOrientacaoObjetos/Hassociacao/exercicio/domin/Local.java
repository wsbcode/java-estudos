package aOrientacaoObjetos.Hassociacao.exercicio.domin;

// Define a classe Local (molde para criar objetos que representam o endereço ou local de um evento)
public class Local {

    // Atributo privado que guarda o endereço do local
    private String endereco;

    // Construtor: exige que você informe o endereço logo ao criar o objeto Local
    public Local(String endereco) {
        this.endereco = endereco;
    }

    // Método 'getEndereco' (getter): pega/consulta o endereço guardado
    public String getEndereco() {
        return endereco;
    }

    // Método 'setEndereco' (setter): altera ou define o endereço
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}