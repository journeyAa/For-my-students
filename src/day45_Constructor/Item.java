package day45_Constructor;

public class Item {
    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity){
        this.name=name;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
    }

    public double calCost(){
        return quantity*unitPrice;
    }

    public String toString(){
        return "Name: " + name + ", Unit Price: " + unitPrice + ", Quantity: " + quantity + "Total price: $" +calCost();
    }




}
