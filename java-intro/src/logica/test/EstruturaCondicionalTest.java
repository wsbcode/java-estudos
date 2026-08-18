// // Declara o pacote onde este arquivo Java está guardado
package logica.test;

// // Criação da classe principal do nosso programa
public class EstruturaCondicionalTest {

    // // Ponto de partida do Java: o código sempre começa a rodar por aqui!
    public static void main (String[]args){

        // // Variável do tipo número inteiro que guarda a idade a ser testada
        int idade = 393;

        // // Variável do tipo texto que vai guardar a mensagem final
        String resposta;

        // // PRIMEIRA CHECAGEM: Verifica se a idade é menor que 18
        if (idade < 18){
            resposta ="Não tem idade para dirigir";

            // // SEGUNDA CHECAGEM: Se não for menor que 18, testa se está no intervalo de 18 até 70
        }else if(idade >=18 && idade <=70) {
            resposta = "Idade suficiente para dirigir";

            // // CASO CONTRÁRIO: Se não entrou em nenhuma das opções acima (idade maior que 70)
        }else{
            resposta = "Ja passou da idade para dirigir";
        }

        // // Exibe no terminal o texto que ficou salvo dentro da variável 'resposta'
        System.out.println(resposta);
    }
}