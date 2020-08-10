package day09_IfStatement;

public class ifElseStatement {
    public static void main(String[] args) {

        int age = 15;
        boolean usCitizen = true;

        if(age >= 18 && usCitizen) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("can't vote");
        }

        age = 18;

        if (age >= 21) {
            System.out.println("You can get alcohol");
        } else {
            System.out.println("You can NOT get alcohol");
        }



    }
}
