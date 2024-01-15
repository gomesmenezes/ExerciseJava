package poo.market.app;

import java.util.Locale;
import java.util.Scanner;

import poo.market.entities.Products;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Price: ");
        Double price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        Integer quantity = sc.nextInt();

        Products products = new Products(name, price, quantity);
        
        System.out.printf("Product data: %s, $ %.2f, %d units, Total: %.2f\n", products.getName(), products.getPrice(), products.getQuantity(), products.totalValueInStock());

        System.out.println("Enter number of products to be added in stock: ");
        int addStock = sc.nextInt();
        products.addProduct(addStock);

        System.out.printf("Update data: %s, $ %.2f, %d units, Total: %.2f\n", products.getName(), products.getPrice(), products.getQuantity(), products.totalValueInStock());

        System.out.println("Enter number of products to be remove in stock: ");
        int removeNumber = sc.nextInt();
        products.removeProduct(removeNumber);

        System.out.printf("Update data: %s, $ %.2f, %d units, Total: %.2f\n", products.getName(), products.getPrice(), products.getQuantity(), products.totalValueInStock());

        sc.close();
    }
}
