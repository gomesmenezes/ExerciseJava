package exercise;

import java.util.Locale;
import java.util.Scanner;

public class Major {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("MINOR: " + a);
        }
        else if (b < c && b < a) {
            System.out.println("MINOR: " + b);
        } else {
            System.out.println("MINOR: " + c);
        }

        sc.close();
    }
}
