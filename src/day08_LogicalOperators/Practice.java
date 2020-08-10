package day08_LogicalOperators;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Practice {
    public static void main(String[] args) {

        int age = 19;
        String citizenship = "China";

        boolean eligibleToVote = age >= 18 && citizenship == "USA";

        System.out.println(eligibleToVote);

        String firstName = "Aalia";
        String lastName = "Alper";
        int Age = 34;
        citizenship = "Canada";
        String fullName = firstName + " " + lastName;

        boolean EligibleToVote = Age >= 10 && citizenship == "Canada";

        System.out.println(fullName + " is eligible to vote: " + EligibleToVote);






    }
}
