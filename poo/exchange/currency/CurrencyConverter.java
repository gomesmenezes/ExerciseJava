package poo.exchange.currency;

public class CurrencyConverter {

    public static final double taxIOF = 0.06;

    public double price;
    public double dollarAmount;

    public static double calculateCurrency(double price, double dollarAmount) {
        double amount = price * dollarAmount;
        double taxOFF = amount * taxIOF;
        return amount + taxOFF;
    }
    
}
