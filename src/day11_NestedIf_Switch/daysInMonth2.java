package day11_NestedIf_Switch;

public class daysInMonth2 {
    public static void main(String[] args) {
        // write a program that can find the number of days in a months

        int month = 13;
        boolean validNumber = month >= 1 && month <= 12;
        boolean day28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;

        String result = "";

        if (validNumber) { // for 28 , 30, 31 days
            if (day28) {
                result = "28 days";
            } else if (days30) {
                result = "30 days";
            } else {
                result = "31days";
            }

        } else { // invalid  Month
        }

        System.out.println(result);

        String result1 = (day28) ? "Twenty eigtht days" : (days30) ? "30 days" : "31 days";

        System.out.println(result1);

    }
}
