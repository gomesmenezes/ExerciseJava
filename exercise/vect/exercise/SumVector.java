package exercise.vect.exercise;

import java.util.Locale;
import java.util.Scanner;

public class SumVector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many digits are you going to enter: ");
        int digits = sc.nextInt();

        double[] vector = new double[digits];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Enter a number: ");
            vector[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
           sum += vector[i];
        }

        double avg = sum / vector.length;

        System.out.print("VALUES = ");

	    for (int i = 0; i < vector.length; i++) {
	    	System.out.printf("%.1f ", vector[i]);
	    } 

        System.out.printf("\nSUM: %.2f \n", sum);
        System.out.printf("AVAREGE: %.2f", avg);

        sc.close();
    }
}
