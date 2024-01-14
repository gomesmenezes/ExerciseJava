package poo.triangle.app;

import java.util.Locale;
import java.util.Scanner;

import poo.triangle.entities.Triangle;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Enter the measures of tiangle X");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.Area(x.a, x.b, x.c, "X");
        double areaY = y.Area(y.a, y.b, y.c, "Y");

        if ( areaX > areaY ) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}
