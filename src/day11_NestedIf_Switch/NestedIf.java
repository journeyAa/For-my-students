package day11_NestedIf_Switch;

public class NestedIf {
    public static void main(String[] args) {

        int score = 100;
        String result = "";

        if (score >= 0 && score <= 100) { // valid score

            if (score >= 90) {
                result = "A";
            } else if (score >= 80) { // score < 90
                result = "B";
            } else if (score >= 70) {// score < 80
                result = "C";
            } else if (score >= 60) { //score < 70
                result = "D";
            } else {
                result = "F";
            }

        } else { // invalid score
            result = "invalid";
        }


        int days = 3;
        String name = "";

        if (days >= 1 && days <= 7) {
            if (days == 1) {
                name = "Monday";
            } else if (days == 2) {
                name = "Tuesday";
            } else if (days == 3) {
                name = "Wednesday";
            } else if (days == 4) {
                name = "Thursday";
            } else if (days == 5) {
                name = "Friday";
            } else if (days == 6) {
                name = "Saturday";
            } else {
                name = "Sunday";
            }

        } else {
            name = "invalid";
        }

        int day = 5;
        if (day >= 1 && day <= 7) {

//            String resultD = (days == 1) ? "Monday" : (days == 2) ? "Tuesday" : (days == 3) ? "Wednesday" :
//                    (days == 4) ? "Thursday" : (days ==5) ? "Friday" :
//                            (days == 6) ? "Saturday" :  "Sunday" ;
            result = (day == 7) ? "Sunday" : (day == 6) ? "Saturday" : (day == 5) ? "Friday" :
                    (day == 4) ? "Thursday" : (day == 3) ? "Wednesday" : (day == 2) ? "Tuesday" : "Monday";

        } else {
            result = "invalid";

            System.out.println(result);


            double salaray = 120000;
            int jobHistory = 5;

            if (salaray >= 30000) {

                if (jobHistory >= 2) {
                    System.out.println("You are qualified");
                } else { // job history is less than 2
                    System.out.println("You must have been working for at least 2 years");
                }

            } else {
                System.out.println("You must earn at least 30K");
            }


        }


    }
}
