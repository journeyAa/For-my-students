package repl.ItAssignments2;

public class Telephone {

    String number;

    public static int quantity;

    public static double total;

    static {
        quantity = 250;
        total = 15658.92;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        Telephone.quantity = quantity;
    }

    public static double getTotal() {
        return total;
    }

    public static void setTotal(double total) {
        Telephone.total = total;
    }
}
