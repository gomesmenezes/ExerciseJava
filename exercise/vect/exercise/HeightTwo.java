package exercise.vect.exercise;

import java.util.Locale;
import java.util.Scanner;

public class HeightTwo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people will be enter? ");
        int people = sc.nextInt();

        String[] name = new String[people];
        Integer[] age = new Integer[people];
        double[] height = new double[people];

            for (int i = 0; i < people; i++) {

            System.out.printf("Data for the %dst person: ", (i + 1) );
            System.out.println("Nome: ");
            name[i] = sc.next();
            System.out.println("Age: ");
            age[i] = sc.nextInt();
            System.out.println("Height: ");
            height[i] = sc.nextDouble();
        }

        Double sum = 0.0;
        for (int i = 0; i < people; i++) {
            sum += height[i];
        }

        int count = 0;
        for (int i = 0; i < people; i++) {
            if (age[i] < 16) {
                count += 1;
            }
        }

        double avg = sum / people;
        double porcent = count * 100 / people;

        System.out.println();
        System.out.printf("Avarege height of person: %.2f%n", avg);
        System.out.printf("Person under 16: %.1f%%%n", porcent);
        
        for (int i = 0; i < people; i++) {
            if (age[i] < 16) {
                System.out.println(name[i]);;
            }
        }


        sc.close();
        }
}
