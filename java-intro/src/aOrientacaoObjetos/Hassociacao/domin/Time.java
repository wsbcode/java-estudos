package aOrientacaoObjetos.Hassociacao.domin;

import java.util.Arrays;

// Define a classe Time (molde para criar objetos do tipo time de futebol)
public class Time {

    // Atributos privados: o nome do time e uma lista (array) de jogadores que fazem parte dele
    private String nome;
    private Jogador[] jogadores;

    // Primeiro construtor: exige apenas o nome do time ao criá-lo (a lista de jogadores começa vazia)
    public Time(String nome) {
        this.nome = nome;
    }

    // Segundo construtor (sobrecarga): permite criar o time informando o nome e já passando a lista de jogadores de uma vez
    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    // Método para imprimir o nome do time e listar todos os jogadores dele
    public void imprimir() {
        System.out.println("Nome: " + nome);

        // Verifica se a lista de jogadores está vazia (nula) para evitar erro no programa
        if (jogadores == null) return;

        // Passa por cada jogador dentro do array de jogadores
        for (Jogador jogador : jogadores) {
            // Imprime o nome de cada jogador usando o método getNome()
            System.out.println(jogador.getNome());
        }
    }

    // Método 'getNome' (getter): pega/consulta o nome do time
    public String getNome() {
        return nome;
    }

    // Método 'setNome' (setter): altera ou define o nome do time
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método 'getJogadores' (getter): pega/consulta a lista de jogadores do time
    public Jogador[] getJogadores() {
        return jogadores;
    }

    // Método 'setJogadores' (setter): altera ou define a lista de jogadores do time
    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}