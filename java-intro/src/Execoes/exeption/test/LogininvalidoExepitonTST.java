package Execoes.exeption.test;

import Execoes.dominio.LogininvalidoExeption;

import java.util.Scanner;

public class LogininvalidoExepitonTST {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LogininvalidoExeption e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LogininvalidoExeption {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "wsb";
        String senhaDB = "123";
        System.out.println("Digite seu nome: ");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String senhaDigitada = teclado.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LogininvalidoExeption("Usuario ou senha iválidos");
        }
        System.out.println("Usuario logado com sucesso!");
    }
}
