package poo.rectangle.Entities;

public class Rectangle {
    public double width, height;

    public double area(double width, double height) {
        double area = width * height;
        System.out.printf("AREA: %.2f\n", area);
        return area;
    }

    public double perimeter(double width, double height) {
        double perimeter = 2 * (width + height);
        System.out.printf("PERIMETER: %.2f\n", perimeter);
        return perimeter;
    }

    public double diagonal(double width, double height) {
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        System.out.printf("DIAGONAL: %.2f", diagonal);
        return diagonal;
    }
}
