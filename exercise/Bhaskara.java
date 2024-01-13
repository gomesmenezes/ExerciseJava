package exercise;
import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        Double a = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        Double b = sc.nextDouble();

        System.out.println("Digite o terceiro número: ");
        Double c = sc.nextDouble();

        Double delta = b * b - 4.0 * a * c;

        if (delta < 0.00 || a == 0.0 ) {
            System.out.println("Impossivel de calcular");
        }
        else {
            Double r2 = -(b - Math.sqrt(delta)) / (2.0 * a);
            Double r1 = -(b + Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("R1: %.5f%n", r1);
            System.out.printf("R2: %.5f%n", r2);
            
        }

        sc.close();
    }
}
