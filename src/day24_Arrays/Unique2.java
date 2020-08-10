package day24_Arrays;

public class Unique2 {
    public static void main(String[] args) {
        String str = "abrsthhaabbccd";
        String unique = "";

        for (int j = 0; j <= str.length()-1; j++) {

            char ch1 = str.charAt(j); // frequence of a
            int count1 = 0;

            for (int i = 0; i <= str.length() - 1; i++) {// used for finding the frequency of ch and assign i
                char each = str.charAt(i);
                if (ch1 == each) {
                    count1 += 1;
                }
            }

            if (count1 == 1) { // if it only occured once
                unique += ch1;

        }





        }













    }
    }