package day11_NestedIf_Switch;

public class Ternary_Practice1 {
    public static void main(String[] args) {

        // can vote or can not
        // check if 2 numbers are equal

        int age = 24;
        String citizen = "USA";
        String result = "";

        if(age >= 18 && citizen == "USA"){
            result = "Can vote";
        }else{
            result = "Can not vote";
        }

        System.out.println(result);

        String result2 = (age >= 18 && citizen == "USA") ? "Can vote": "Can not vote";

        System.out.println(result2);

        int n1 = 200;
        int n2 = 200;

        String r = (n1 == n2) ? "Equal" : "not Equal";

        System.out.println(r);

        int num = 100;
        String resultN = "";

        if(num > 0){
            resultN = "Positive";
        }else if(num < 0){
            resultN = "Negative";
        }else{
            resultN = "Zero";
        }

        String result3 = (num > 0) ? "Positive" : (num < 0) ? "Negative" :  "Zero";

        System.out.println(result3);





    }
}
