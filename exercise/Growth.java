package exercise;
import java.util.Locale;
import java.util.Scanner;

public class Growth {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != y) {
            if (x > y) {
                System.out.println("A ordem esta decrescente ");
            } 
            else if (x < y) {
                System.out.println("A ordem esta crescente ");
            }

            x = sc.nextInt();
            y = sc.nextInt();

        } 

        sc.close();
    }
}
