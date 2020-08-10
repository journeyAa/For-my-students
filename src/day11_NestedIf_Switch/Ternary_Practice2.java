package day11_NestedIf_Switch;

public class Ternary_Practice2 {
    public static void main(String[] args) {

        int num = 100;
        String result = "";

        if(num > 0){
            result = "Positive";
        }else if(num < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }

        int a = 30;
        int b = 20;

        String result1 = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        String result2 = (b > a) ? "b is greater" : (a > b) ? a + " is greater" : (a == b) ? "a is equal to b": "Zero";

        System.out.println(result1);
        System.out.println(result2);
    }
}
