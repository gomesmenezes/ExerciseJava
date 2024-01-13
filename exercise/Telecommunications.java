package exercise;
import java.util.Locale;
import java.util.Scanner;

public class Telecommunications {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double standardPlan = 50.0;
        Double minutes = 100.0;
        Double priceExceed = 2.0;

        System.out.println("Quantidade de minutos consumidas: ");
        Double minutesConsumed = sc.nextDouble();

        if (minutesConsumed > minutes) {
            Double minutesUsed = minutesConsumed - minutes;
            Double taxExceed = minutesUsed * priceExceed;
            Double updateStandardPlan = standardPlan + taxExceed;
            System.out.printf("Minutos excedidos da franquia: %.0f%n", minutesUsed);
            System.out.printf("Valor das taxa: R$%.2f%n", taxExceed);
            System.out.printf("Valor total: R$%.2f%n", updateStandardPlan);
        }
        else {
            System.out.printf("Valor a pagar: R$%.2f%n", standardPlan);
        }

        sc.close();
    }
}
