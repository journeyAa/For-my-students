package day10_ifStatement;

public class MultiBranch {
    public static void main(String[] args) {

        int number = -55;

        if(number > 0) {
            System.out.println(number + " is positve");
        } else if(number < 0) {
            System.out.println(number + " is negative");
        } else if(number == 0) {
            System.out.println( number + " is zero");
        }
    }
}
