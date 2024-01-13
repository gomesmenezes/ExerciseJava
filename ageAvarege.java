import java.util.Locale;
import java.util.Scanner;

public class ageAvarege {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        double soma = 0;
        double tentativas = 0;

        while (age >= 0) {

            soma += age;
            tentativas++;
            age = sc.nextInt();
        }
        
        if (tentativas > 0) {
            Double avarege = soma / tentativas;
            System.out.printf("%.2f", avarege);
        } else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}
