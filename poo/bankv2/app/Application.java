package poo.bankv2.app;

import java.util.Locale;
import java.util.Scanner;

import poo.bankv2.businessRules.RulesBusiness;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        RulesBusiness rulesBusiness;
        
        System.out.println("Enter number account: ");
        int numberAccount = sc.nextInt();
        
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();
        
        System.out.println("Is there initial deposit value (y/n): ");
        String response = sc.next();

        if (response.equals("y")) {
            System.out.println("Enter initial deposit value: ");
            double initialDepositValue = sc.nextDouble();
            rulesBusiness = new RulesBusiness(numberAccount, accountHolder, initialDepositValue);
        } else {
            rulesBusiness = new RulesBusiness(numberAccount, accountHolder);
        }

        System.out.println("Account data: ");
        System.out.println(rulesBusiness);

        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        rulesBusiness.deposit(depositValue);

        System.out.println("Update account data: ");
        System.out.println(rulesBusiness);

        System.out.println("Enter a withdraw value: ");
        double removeValue = sc.nextDouble();
        rulesBusiness.withdraw(removeValue);

        System.out.println("Update account data: ");
        System.out.println(rulesBusiness);

        sc.close();
    }
}
