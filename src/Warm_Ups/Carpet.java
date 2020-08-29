package Warm_Ups;
/*
 3. create a custom class for the carpet class
                instance variables:
                        width, length, unitPrice, isPersian
                instance methods:






 */
public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

    }

    // calcCost(): should be able to caculate the total cost of the carpet and return it as double
    //total price of carpet= (width+length)*unitprice
// if the carpet is persian  carpet, add 200$ to the totalPrice
    public double calCost() {
        double totalPrice = (width + length) * unitPrice;
        if (isPersian == true) {
            return totalPrice += 200;
        }
        return totalPrice;
    }

    // toString(): should be able to display all the info of the carpet
    // including the total cost of the carpet as calculated by calcCost()
    public String toString() {
        return "width = " + width + "length = " + length + "unitPrice = " + unitPrice + "Total Price: " + calCost();
    }
}
