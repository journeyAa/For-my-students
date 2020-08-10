package day11_NestedIf_Switch;

public class Ternary {
    public static void main(String[] args) {

        int num = 100;
        String result = "";

        if(num % 2 == 0){
            result = "Even";
        }else{
            result = "Odd";
        }

        System.out.println(result);
        System.out.println("====================================================================");

        String result2 = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(result2);

        System.out.println("=====================================================================");

        int num1 = 10;
        int num2 = 20;
        int max1 = 0;

        if(num1 > num2) {
            num1 = max1;
        }else{
            max1 = num2;
        }












    }
}
