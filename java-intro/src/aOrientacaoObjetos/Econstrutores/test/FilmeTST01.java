package aOrientacaoObjetos.Econstrutores.test;


import aOrientacaoObjetos.Econstrutores.domin.Filme;

public class FilmeTST01 {
    public static void main(String[] args) {

        Filme filme = new Filme("DBZ", "Anime", 300, 2000);
        Filme filme2 = new Filme("DBZ", "Anime", 300, 2000,"William");
        filme.imprimir();
        System.out.println("----------------");
        filme2.imprimir();

    }
}
