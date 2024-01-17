package exercise.vect.exercise.product.app;

import java.util.Locale;
import java.util.Scanner;

import exercise.vect.exercise.product.entities.Product;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Nome do produto: ");
            String name = sc.nextLine();
            System.out.println("Valor do produto: ");
            double value = sc.nextDouble();
            vect[i] = new Product(name, value);
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("AVAREGE PRICE: %.2f%n", avg);



        sc.close();
    }
}
