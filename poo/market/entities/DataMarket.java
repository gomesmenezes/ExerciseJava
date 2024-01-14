package poo.market.entities;

public class DataMarket {
    public String name;
    public double price;
    public int quantity;

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

    public double totalValueInStock() {
        double valueInStock = getPrice() * getQuantity();
        return valueInStock;
    }

    public void addProduct(int numberAdd) {
        int quantity = getQuantity() + numberAdd;
        this.quantity = quantity;
    }

    public void removeProduct(int numberRemove) {
        int quantity = getQuantity() - numberRemove;
        this.quantity = quantity;
    } 
}
