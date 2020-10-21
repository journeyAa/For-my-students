package Practice.Practice_Constructor.day45;

public class Item {
    String name;
    double unitPrice;
    int quantity;
    int Inum = 10;

    public Item(String name, double unitPrice, int quantity){
        this.name=name;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
    }

    public double totalCost(){
        return quantity*unitPrice;
    }

    public String toString(){
        return "Name: "+name+", Unit Price"+ unitPrice+ ", Quantity: "+quantity+ ", Total Cost: "+totalCost();
    }











}
