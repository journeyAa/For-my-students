package day08_LogicalOperators;

public class Practice4 {
    public static void main(String[] args) {
        /* Create a double variable with the value 20
        create a second variable of type double with the value 80
        add both numbers and multiply by 25
        use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        print reamining total is quesl to 20 or less : true or false
        */

        double num1 = 20;
        double num2 = 80;
        double result1= (num1  + num2) * 25;
        System.out.println(result1);
        double remainder = result1 % 40;
        System.out.println(remainder);
        boolean r = remainder == 20 || remainder < 20;
        System.out.println(r);






    }
}
