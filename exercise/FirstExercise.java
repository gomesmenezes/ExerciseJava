package exercise;
import java.util.Locale;
import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura do terreno: ");
        Float firstNumber = sc.nextFloat();
        System.out.println("Digite o comprimento do terrono: ");
        Float secondNumber = sc.nextFloat();
        System.out.println("Digite o valor do metro quadrado: ");
        Float squareMeter = sc.nextFloat();

        Float area = firstNumber * secondNumber;
        Float price = area * squareMeter;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO: = %.2f%n",price);

        sc.close();
    }
}