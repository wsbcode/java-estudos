package aOrientacaoObjetos.FblocoInicializacao.domin;

public class Time {
    private String nome;
    private int[] titulos;

    {
        System.out.println("Inicializando o objetos");
        titulos = new int[10];
        for (int i = 0; i < titulos.length; i++) {
            titulos[i] = i;
        }

    }
    public Time() {
        for (int titulo : this.titulos) {
            System.out.println("titulo = " + titulo);
        }
    }



    public String getNome() {
        return nome;
    }

    public int[] getTitulos() {
        return titulos;
    }
}
