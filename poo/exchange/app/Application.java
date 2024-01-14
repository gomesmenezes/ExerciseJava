package poo.exchange.app;

import java.util.Locale;
import java.util.Scanner;

import poo.exchange.currency.CurrencyConverter;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter cc = new CurrencyConverter();

        System.out.println("What is the dollar price? ");
        cc.price = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        cc.dollarAmount = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.calculateCurrency(cc.price, cc.dollarAmount));



        sc.close();
    }
}
