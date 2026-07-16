package exercicios;
import java.time.LocalDate;
/*
PRATICA

Criando variaveis para exibir dados
*/
public class Atividade01 {
    public static  void main(String[]ergs){
        LocalDate dataHoje = LocalDate.now();
        String name = "William";
        String address = "Nova Madre de Deus";
        double salary = 2500.22;
        String report = "EU " + name + " Morando no endereço " + address + " Confirmo que recebi o de " + salary + "$ na data de " + dataHoje;
        System.out.println(report);
    }

}
