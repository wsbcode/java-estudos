package ClassesUtilitarias.Strings;

public class StringsTST01 {
    public static void main(String[] args) {
        // Criado no String Pool: "William" entra no pool de memória
        String nome = "William";

        // Criado no String Pool: "Joao" entra no pool de memória
        String nome2 = "Joao";

        // Tenta juntar "William" + "Joao", mas NÃO altera 'nome' (String é imutável! O resultado "WilliamJoao" vira lixo)
        nome.concat(nome2);

        // Agora SIM: junta os dois e faz a variável 'nome' apontar para o novo objeto ("WilliamJoao")
        nome = nome.concat(nome2);

        // Junta 'nome' ("WilliamJoao") + 'nome2' ("Joao"), criando o novo texto "WilliamJoaoJoao"
        String nomes = nome + nome2;

        // Imprime o resultado final: "WilliamJoaoJoao"
        System.out.println(nomes);

        // Força a criação de um NOVO objeto fora do String Pool (memória Heap normal) com o valor "Joao"
        String nome3 = new String("Joao");

        // Imprime 'false' porque 'nome' é "WilliamJoao" e 'nome2' é "Joao" (valores e endereços diferentes)
        System.out.println(nome == nome2);

        // Imprime 'true'! O .intern() pega a referência do String Pool onde já existe o "Joao" do 'nome2'
        System.out.println(nome2 == nome3.intern());
    }
}