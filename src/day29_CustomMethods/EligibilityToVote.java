package day29_CustomMethods;

public class EligibilityToVote {
    public static void main(String[] args) {
        vote("John", 28, true, "Biden");

        vote("Daniel", 17, true, "Kenya");

        eligibleToBuyAlcohol(true, 21);

        calculator(100,'%',10);

    }

    /*
    * age, citizenship,name
    * */

    public static void vote(String name, int age, boolean citizen, String candidateName){
        boolean eligibleToVote = age >= 18 && citizen == true;
        if(eligibleToVote){
            System.out.println(name + " is eligible to vote for " + candidateName);
        }else{
            System.out.println(name + " is not eligible to vote");
        }

    }

    public static void eligibleToBuyAlcohol(boolean hasID, int age){
        if(hasID && age>= 21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are eligible to buy milk");
        }
    }

    public static void calculator(double num1, char operator, double num2){
        switch (operator){
            case'+':
                System.out.println("Addition: " + (num1 + num2));
                break;
            case'-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case'*':
                System.out.println("Multiplication: " + (num1*num2));
                break;
            case'/':
                System.out.println("Division: " + (num1/num2));
                break;
            case'%':
                System.out.println("Remainder: " + (num1%num2));
                break;
        }



    }



}
