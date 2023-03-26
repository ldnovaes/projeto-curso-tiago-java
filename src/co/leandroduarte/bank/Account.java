package co.leandroduarte.bank;

/**
 * Classe da conta
 * @author vostoc
 */

public class Account {

    // define uma propriedade compartilhada (no caso é uma constante pelo "final")onde definiremos o maximo de caracteres de nomes
    private static final int MAX_LENGTH = 12;

    // propriedades privadas da classe (não é possível acessar as propriedades através de outra classe uma vez que estas estão privadas)
    private String ag;
    private String cc;
    private String name;

    private double balance;

    private Log logger;

    // cosntrutor da classe
    public Account(String ag, String cc, String name) {
        this.ag = ag;
        this.cc = cc;
        setName(name);
        logger = new Log();
    }

    // função para setar o nome do dono da conta definindo um numero de caracteres máximos
    public void setName(String name) {

        if (name.length() > MAX_LENGTH) {
            this.name = name.substring(0, MAX_LENGTH);
        } else {
            this.name = name;
        }

    }

    // obtem o nome da objeto instanciado
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // função para depósito
    public void deposit(double value) {
        balance += value;
        logger.out("DEPOSITO - R$ " + value + " Sua conta agora é de R$ " + balance);
    }

    // função para definir o saque
    public boolean withDraw(double value) {

        // se o valor para sacar for menor que o valor da conta ele retorna false
        if (balance < value) {
            System.out.println("SAQUE - R$ " + value + " Saque não disponível! O valor para saque ultrapassa o valor em sua conta!");
            return false;

        }

        // se nao der false, ele executa esse código que quer dizer que o saque foi liberado
        balance -= value;
        logger.out("SAQUE - R$ " + value + " Sua conta agora é de R$ " + balance);
        return true;

    }

    @Override
    public String toString() {
        String result = "A conta " + this.name + " Agencia " + this.ag + "/" + this.cc + " possui: R$ " + balance;
        return result;
    }
}
