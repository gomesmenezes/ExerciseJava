package poo.school.app;

import java.util.Locale;
import java.util.Scanner;

import poo.school.rulesStudent.Student;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Student student = new Student();

        System.out.println("Name: ");
        student.name = sc.nextLine();
        
        System.out.println("First Quarter: ");
        student.firstQuarter = sc.nextDouble();

        System.out.println("Second Quarter: ");
         student.secondQuarter = sc.nextDouble();

        System.out.println("Third Quarter: ");
        student.thirdQuarter = sc.nextDouble();

        double note = student.firstQuarter + student.secondQuarter + student.thirdQuarter;
        
        if (note > 60) {
            System.out.printf("Final Grade: %.2f\n PASS", note);
        } else {
            double missing = 60 - note;
            System.out.printf("Final Grade: %.2f\n FAILED\n MISSING %.2f Points", note, missing);
        }

        sc.close();
    }
}
