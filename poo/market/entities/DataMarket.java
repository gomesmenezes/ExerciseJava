package poo.market.entities;

public class DataMarket {
    public String name;
    public double price;
    public int quantity;

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
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
