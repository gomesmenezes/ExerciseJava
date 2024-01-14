package poo.market.app;

import java.util.Locale;
import java.util.Scanner;

import poo.market.entities.DataMarket;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DataMarket data = new DataMarket();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        data.name = sc.nextLine();

        System.out.println("Price: ");
        data.price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        data.quantity = sc.nextInt();
        
        System.out.printf("Product data: %s, $ %.2f, %d units, Total: %.2f\n", data.name, data.price, data.quantity, data.totalValueInStock());

        System.out.println("Enter number of products to be added in stock: ");
        int addStock = sc.nextInt();
        data.addProduct(addStock);

        System.out.printf("Update data: %s, $ %.2f, %d units, Total: %.2f\n", data.name, data.price, data.quantity, data.totalValueInStock());

        System.out.println("Enter number of products to be remove in stock: ");
        int removeNumber = sc.nextInt();
        data.removeProduct(removeNumber);

        System.out.printf("Update data: %s, $ %.2f, %d units, Total: %.2f", data.name, data.price, data.quantity, data.totalValueInStock());

        sc.close();
    }
}
