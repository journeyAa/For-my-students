package day16_String;

public class checkWords {
    public static void main(String[] args) {
        /* 3. write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than 3 characters, print the string itself
*/

        String str = "I like java";
        // last index = length -1
        // second last index = length -1 -1
        //third last index = length -3

        if(str.length()==0){
            System.out.println("empty string");
        }else if(str.length() > 3){
            System.out.println(str.substring(str.length()-3));//creating substring from str starting from last thid index
        }else{
            System.out.println(str);
        }

        String result = (str.length()==0) ? "empty string" :
                         (str.length() > 3) ? str.substring(str.length()-3) : str;

        System.out.println(result);

        System.out.println("=================================================================");

        String str1 = "abcdddd";
        String str2 = "asf";
        String str3 = "kfj";

        boolean allSame = str1.length()==str2.length() && str1.length() == str3.length();
        boolean allDifferent = str1.length() != str2.length() && str1.length() != str3.length()
                && str2.length() != str3.length();

        if(allSame){
            System.out.println("All words are same length");
        }else if(allDifferent){
            System.out.println("All words are different length");
        }else{
            System.out.println("All different length");
        }






    }
}
