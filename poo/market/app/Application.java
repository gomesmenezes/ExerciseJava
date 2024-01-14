package poo.market.app;

import java.util.Locale;
import java.util.Scanner;

import poo.market.entities.Products;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Products product = new Products();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();

        System.out.println("Price: ");
        product.price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();
        
        System.out.printf("Product data: %s, $ %.2f, %d units, Total: %.2f\n", product.name, product.price, product.quantity, product.totalValueInStock());

        System.out.println("Enter number of products to be added in stock: ");
        int addStock = sc.nextInt();
        product.addProduct(addStock);

        System.out.printf("Update data: %s, $ %.2f, %d units, Total: %.2f\n", product.name, product.price, product.quantity, product.totalValueInStock());

        System.out.println("Enter number of products to be remove in stock: ");
        int removeNumber = sc.nextInt();
        product.removeProduct(removeNumber);

        System.out.printf("Update data: %s, $ %.2f, %d units, Total: %.2f", product.name, product.price, product.quantity, product.totalValueInStock());

        sc.close();
    }
}
