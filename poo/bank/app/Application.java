package poo.bank.app;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import poo.bank.bussinesrules.Rules;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter account number: ");
        int numberAccount = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter account holder: ");
        String nameHolder = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n)? ");
        String initialDeposit = sc.nextLine();

        System.out.println("Enter initial deposit value: ");
        double valueDeposit = sc.nextDouble();
        
        Rules r = new Rules(nameHolder, numberAccount, valueDeposit); 
        
        System.out.printf("Account data: \n Account: %d, Holder: %s, Balance: $ %.2f \n", r.getNumberAccout(), r.getAccountHolder(), r.getAmount());

        System.out.println("Enter a deposit value: ");
        double TvalueDeposit = sc.nextDouble();
        r.deposit(TvalueDeposit);
        System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f \n", r.getNumberAccout(), r.getAccountHolder(), r.getAmount());

        System.out.println("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        r.withdrawal(withdraw);
        System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f", r.getNumberAccout(), r.getAccountHolder(), r.getAmount());

        sc.close();
    }
}
