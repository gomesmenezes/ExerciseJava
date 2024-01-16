package poo.bankv2.businessRules;

public class RulesBusiness {
    private int numberAccount;
    private String holder;
    private double balance;


    public RulesBusiness(int numberAccount, String holder, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.holder = holder;
        deposit(initialDeposit);   
    }

    public RulesBusiness(int numberAccount, String holder) {
        this.numberAccount = numberAccount;
        this.holder = holder;
    }

    // Getters and setters
    public int getNumberAccount() {
        return numberAccount;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    // methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5;
    }

    @Override
    public String toString() {
        return "Account: " + numberAccount + ", holder: " + holder + ", balance: " + String.format("%.2f",  balance);
    }
}
