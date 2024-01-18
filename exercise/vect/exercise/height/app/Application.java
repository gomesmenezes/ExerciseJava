package exercise.vect.exercise.height.app;

import java.util.Locale;
import java.util.Scanner;


import exercise.vect.exercise.height.entities.Entities;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people will be entered? ");
        int count = sc.nextInt();

        Entities[] peoples = new Entities[count];

        for (int i = 0; i < peoples.length; i++) {
            System.out.printf("Data for the %dst person\n", i + 1);
            System.out.println("Name: ");
            sc.nextLine(); // Consume the newline character
            String name = sc.nextLine();
            System.out.println("Age: ");
            int age = sc.nextInt();
            System.out.println("Height: ");
            double height = sc.nextDouble();
            peoples[i] = new Entities(name, age, height);
        }

        double sum = 0;
        int under16Count = 0;

        for (int i = 0; i < peoples.length; i++) {

            sum += peoples[i].getHeight();

            if (peoples[i].getAge() < 16) {
                under16Count++;
                System.out.printf("\n%s is under 16 years old.", peoples[i].getName());
            }
        }

        double avg = sum / peoples.length;
        double percentUnder16 = (double) under16Count / peoples.length * 100;

        System.out.printf("\nAverage heights: %.2f\n", avg);
        System.out.printf("People under 16 years old: %.1f%%\n", percentUnder16);

        sc.close();
    }
}
