package exercise.vect.exercise;

import java.util.Locale;
import java.util.Scanner;

public class Negatively {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many digits are you going to enter (1-10): ");
        int n = sc.nextInt();

        while (n > 10 || n < 0) {
            System.out.println("Invalid number, please enter another number ");
            n = sc.nextInt();
        }

        double vector[] = new double[n]; 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a number: ");
            vector[i] = sc.nextDouble();
        }

        System.out.println("Number negative: ");
        for (int i = 0; i < n; i++) {
            if (vector[i] < 0) {
                System.out.println(vector[i]);
            }
        }



        sc.close();
    }
}
