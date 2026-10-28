package aOrientacaoObjetos.FblocoInicializacao.domin;

// Define a classe Time (molde para criar objetos do tipo time de futebol ou esporte)
public class Time {

    // Atributos privados para guardar o nome do time e uma lista (array) de títulos
    private String nome;
    private int[] titulos;

    // Bloco de inicialização de instância:
    // Este bloco roda automaticamente TODAS AS VEZES que um novo objeto 'Time' é criado,
    // antes mesmo de qualquer construtor ser executado.
    {
        System.out.println("Inicializando o objetos");

        // Cria o array de títulos com espaço para 10 posições
        titulos = new int[10];

        // Preenche o array com números de 0 a 9 em cada posição
        for (int i = 0; i < titulos.length; i++) {
            titulos[i] = i;
        }
    }

    // Construtor da classe: executa logo após o bloco de inicialização
    public Time() {
        // Percorre cada número dentro do array 'titulos' que foi criado no bloco acima
        for (int titulo : this.titulos) {
            // Imprime cada valor do título na tela
            System.out.println("titulo = " + titulo);
        }
    }

    // Método 'getNome' (getter): pega/consulta o nome do time
    public String getNome() {
        return nome;
    }

    // Método 'getTitulos' (getter): pega/consulta a lista de títulos
    public int[] getTitulos() {
        return titulos;
    }
}