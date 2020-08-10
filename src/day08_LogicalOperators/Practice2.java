package day08_LogicalOperators;

public class Practice2 {

    public static void main(String[] args) {

        int age = 21;
        String citizen1 = "USA";
        String citizen2 = "France";

        boolean eligibleAge = age >= 18;
        //                     12 >= 18 ==> false

        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";
        //


        boolean eligibleToVote = eligibleAge && usCitizen ;

        System.out.println(eligibleToVote);






    }



}
