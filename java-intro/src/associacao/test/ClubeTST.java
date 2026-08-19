package associacao.test;

import associacao.dominio.Clube;
import associacao.dominio.Professor;

public class ClubeTST {
    public static void main(String[] args) {
        // // 1. Criamos os 3 objetos da classe Professor
        Professor professor1 = new Professor("Abel Ferreira");
        Professor professor2 = new Professor("Felipão");
        Professor professor3 = new Professor("Vanderlei Luxemburgo");

        // // 2. Guardamos os objetos dentro de um Array de Professores
        Professor[] professores = {professor1, professor2, professor3};

        // // 3. Criamos o Clube passando o nome e o Array (Associação feita!)
        Clube escola = new Clube("Sociedade Esportiva Palmeiras", professores);

        // // 4. Imprime o clube e todos os professores associados
        escola.imprimir();
    }
}