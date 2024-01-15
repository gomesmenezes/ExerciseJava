package poo.market.entities;

public class Products {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Products(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        double valueInStock = getPrice() * getQuantity();
        return valueInStock;
    }

    public void addProduct(int numberAdd) {
        this.quantity += numberAdd;
    }

    public void removeProduct(int numberRemove) {
        this.quantity -= numberRemove;

    } 
}
