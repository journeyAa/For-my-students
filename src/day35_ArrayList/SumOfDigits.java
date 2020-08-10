package day35_ArrayList;
/*
    2. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
            HINT: on ascii table, the characters between #48 ~ #57 are digits
 */
public class SumOfDigits {
    public static void main(String[] args) {

        String str = "a1b2c3";
        int sum = 0;

        for (int i = 0; i <= str.length() - 1; i++) {
            char each = str.charAt(i);  // a 1 b 2 c 3
            if (each >= 48 && each <= 57) { // in this range, it is a digit
                sum += Integer.parseInt("" + each);

            }

        }
        System.out.println(sum);
    }
}