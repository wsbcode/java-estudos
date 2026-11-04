package aOrientacaoObjetos.Hassociacao.exercicio.domin;

// Define a classe Professor (molde para criar objetos do tipo professor para o exercício)
public class Professor {

    // Atributos privados: o nome do professor, sua especialidade e uma lista (array) de seminários que ele ministra
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    // Construtor: exige que você informe o nome, a especialidade e a lista de seminários ao criar o professor
    public Professor(String nome, String especialidade, Seminario[] seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }

    // Método para imprimir as informações do professor, sua especialidade, os seminários e os alunos cadastrados
    public void imprimir() {
        System.out.println("-------------------");
        System.out.println("Professor: " + this.nome);

        // ATENÇÃO: Aqui imprime diretamente a referência do array de seminários na memória (aparece algo como [L...]),
        // e logo abaixo o código faz a listagem detalhada usando o laço de repetição.
        System.out.println("Seminarios: " + this.seminario);
        System.out.println("## Seminarios ##");

        // Se a lista de seminários estiver vazia (nula), o método para por aqui
        if (this.seminario == null) return;

        System.out.println("Especialidade: " + this.especialidade);

        // Passa por cada seminário dentro do array de seminários do professor
        for (Seminario seminario : this.seminario) {
            // Imprime o título do seminário
            System.out.println(seminario.getTitulo());

            // Pega o local do seminário e imprime o endereço
            System.out.println(seminario.getLocal().getEndereco());

            // Se a lista de alunos daquele seminário estiver vazia, pula para o próximo seminário
            if (seminario.getAlunos() == null) continue;

            System.out.println("## Alunos ##");

            // Passa por cada aluno inscrito no seminário atual
            for (Aluno aluno : seminario.getAlunos()) {
                // Imprime o nome e a idade de cada aluno
                System.out.println("Aluno: " + aluno.getNome() + " idade: " + aluno.getIdade());
            }
        }
    }

    // Método 'getNome' (getter): pega/consulta o nome do professor
    public String getNome() {
        return nome;
    }

    // Método 'setNome' (setter): altera ou define o nome do professor
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método 'getEspecialidade' (getter): pega/consulta a especialidade do professor
    public String getEspecialidade() {
        return especialidade;
    }

    // Método 'setEspecialidade' (setter): altera ou define a especialidade do professor
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    // Método 'getSeminario' (getter): pega/consulta a lista de seminários do professor
    public Seminario[] getSeminario() {
        return seminario;
    }

    // Método 'setSeminario' (setter): altera ou define a lista de seminários do professor
    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}