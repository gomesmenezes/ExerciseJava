package poo.rectangle.app;

import java.util.Locale;
import java.util.Scanner;

import poo.rectangle.Entities.Rectangle;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        rectangle.area(rectangle.width, rectangle.height);
        rectangle.perimeter(rectangle.width, rectangle.height);
        rectangle.diagonal(rectangle.width, rectangle.height);
        sc.close();
    }
}
