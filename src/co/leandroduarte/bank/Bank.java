package co.leandroduarte.bank;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe do banco
 * @author vostoc
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
        accounts.add(account);
        return account;
    }

    public double getBalance() {

        for (Account account:accounts) {
            balance += account.getBalance();
        }

        return balance;
    }

    @Override
    public String toString() {
        return "Esse banco tem um total de R$ " + getBalance() + "reais.";
    }
}
