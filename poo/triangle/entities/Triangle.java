package poo.triangle.entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double Area(double a, double b, double c, String yOrX) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.printf("Triangle %s area: %.4f\n", yOrX, area);
        return area;
    }

}