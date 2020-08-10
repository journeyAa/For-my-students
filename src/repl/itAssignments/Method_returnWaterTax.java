package repl.itAssignments;

public class Method_returnWaterTax {
    public static void main(String[] args) {
    //    next3(num);



    }

    public static double waterTax(double units) {
        double bill = 0;
        if (units <= 50) {
            bill += units * 0.6;
            return bill;
        }
        if (units > 50) {
            if (units <= 100) {
                bill += units * 0.9;
                return bill;
            } else if (units > 100 && units <= 150) {
                bill += units * 0.9 + 50;
                return bill;
            } else {
                bill += units * 0.9 + 100;

            }

        }

        return bill;
    }

    public static void next3(int num){
        System.out.println((num+1) + " " + (num+2 ) + " " + (num+3 ));

    }

}