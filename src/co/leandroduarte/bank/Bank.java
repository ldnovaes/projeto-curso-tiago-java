package co.leandroduarte.bank;

import java.util.ArrayList;
import java.util.List;

/**
 * AUTHOR: vostoc
 * PROJECT: projeto-curso-tiago
 * CREATE DATE: 23/03/2023 16:05
 */

public class Bank {

    private String ag;
    private List<Account> accounts;

    private int lastAccount = 1;
    private double balance;


    // construtor da conta
    public Bank(String ag) {
        this.ag = ag;
        this.accounts = new ArrayList<>();
    }

    // insere a conta criada dentro da lista
    public void inserAccount(Account account) {
        accounts.add(account);
    }

    // função que cria uma instancia da classe account e cria uma conta
    public Account generateAccount(String name) {
        Account account = new Account(ag, "000" + lastAccount, name);
        lastAccount++;
        return account;
    }

    public String getBalance() {
        return "oi";


    }

    @Override
    public String toString() {
        return "Esse banco tem um total de ";
    }
}
