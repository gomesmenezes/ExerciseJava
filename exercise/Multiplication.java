package exercise;

import java.util.Locale;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 140;

        for (int i = 1; i <= 10; i++) {
            int value = i * n;
            System.out.println(i + " x " + n + " = " + value);
        }

        sc.close();
    }
}
