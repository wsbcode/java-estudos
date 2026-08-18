package construtores.test;

import construtores.dominio.Construtores;

public class ConstrutoresTest {
  public static void main(String[] args) {
    // // Objeto usando o construtor com 3 parâmetros
    Construtores pessoa = new Construtores("William", 33, 'M');

    // // Objeto usando a sobrecarga com 4 parâmetros
    Construtores pessoa02 = new Construtores("William", 33, 'M', 1992);

    // // Exibe os dados dos dois objetos
    pessoa.imprimir();
    pessoa02.imprimir();
  }
}