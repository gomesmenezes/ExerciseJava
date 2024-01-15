package poo.bank.bussinesrules;

public class Rules {
    private String accountHolder;
    private int numberAccout;
    private double amount;

    public Rules(String accountHolder, int numberAccout, double amount) {
        this.accountHolder = accountHolder;
        this.numberAccout = numberAccout;
        this.amount = amount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    
    public int getNumberAccout() {
        return numberAccout;
    }

    public double getAmount() {
        return amount;
    }

    public double withdrawal(double withdraw) {
        return amount -= withdraw;
    }

    public double deposit(double valueDeposit) {
        return amount += valueDeposit;
    }

    
}
