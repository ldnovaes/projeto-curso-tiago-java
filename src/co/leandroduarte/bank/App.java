package co.leandroduarte.bank;

import java.util.Scanner;

/**
 * AUTHOR: vostoc
 * PROJECT: projeto-curso-tiago
 * CREATE DATE: 22/03/2023
 */

public class App {

    public static void main(String[] args) {

        // cria instancia do banco
        Bank santander = new Bank("001");

        // cria uma conta dentro do banco a
        Account leandro = santander.generateAccount("Leandro");
        Account dapheny = santander.generateAccount("Dapheny");
        dapheny.deposit(5000000);
        dapheny.withDraw(5000000);


        System.out.println(dapheny);

    }

}

