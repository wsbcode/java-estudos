package aulasjava;
// VERIFICANDO POSSIBILIDADE DE HABILITAÇÃO
public class EstruturaCondicional {
    public static void main (String[]args){

int idade = 393;
String resposta;
     if (idade < 18){
         resposta ="Não tem idade para dirigir";
     }else if(idade >=18 && idade <=70) {
         resposta = "Idade suficiente para dirigir";

     }else{
         resposta = "Ja passou da idade para dirigir";
     }
        System.out.println(resposta);
 }

}
