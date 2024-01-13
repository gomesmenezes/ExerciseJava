package exercise;

import java.util.Locale;
import java.util.Scanner;

public class StudentAvarege {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("First note of Quarter: ");
        double firstNoteOfQuarter = sc.nextDouble();

        System.out.println("Second note of Quarter: ");
        double secondNoteOfQuarter = sc.nextDouble();

        double avarege = firstNoteOfQuarter + secondNoteOfQuarter;

        if (avarege < 60) {
            System.out.println("NOTE SCORE: " + avarege);
            System.out.println("Failed!");
        } 
        else {
            System.out.println("NOTE SCORE: " + avarege);
        }

        sc.close();
    }
}
