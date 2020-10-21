package Practice.Practice_CustomMethods;

import Library.Util;

// day30

public class Return_Method {
    public static void main(String[] args) {
       String s = "ABABBBBB";
       char c = 'B';
       int count = 0;
       for (char each : s.toCharArray()){
           if(each==c){
               count++;
           }
       }
        System.out.println(count);


       String s1 = "ABCDABCDDDDFK";
       char c1 = 'D';
        System.out.println( frequency(s1,c1));

         /*
     2. use the above method to create another called uniques that
    accepts a string paramter and returns it's unique characters as String
            Ex:
                uniques("ABBC");       ==> "AC"
                uniques("Cybertek");   ==> "cybrtk"
                please copy paste the method to the util class
     */



        String unique = "";

        for (int i = 0; i <= s1.length()-1; i++) {
            char ch = s1.charAt(i);
            int count1 = frequency(s1,ch);
            if(count1==1){
                unique+=ch;
            }

        }
        System.out.println(unique);

        // finds the characters that are unique

        String s2 = "abbcddeefklg";
        System.out.println(uniques(s2));


        String s3 = "AABBBCCD";   // A2B3C2D1
        System.out.println( frequencyOfChars(s3));













    }
    /*

       1.  write a return method called frequency that accepts
        two parameters: string str and char ch, the method returns the
        frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop
            please copy paste the method to the util class


     */
    public static int frequency(String str, char ch){ // frequncy of ch in the string
        int frequency = 0;

        for (int i = 0; i <= str.length()-1; i++) {
            char each = str.charAt(i);
            if(each==ch){
                frequency++;
            }

        }
       return frequency;

    }

         /*
     2. use the above method to create another called uniques that
    accepts a string paramter and returns it's unique characters as String
            Ex:
                uniques("ABBC");       ==> "AC"
                uniques("Cybertek");   ==> "cybrtk"
                please copy paste the method to the util class
     */

    public static String uniques(String str){ // if the frequency is one, it is the unique
        String unique = "";
        for (char each: str.toCharArray()){
            int count = frequency(str, each);
            if(count==1){
                unique+=each;
            }
        }
        return unique;


    }


    /*
 3. use the methods removeDup and frequency in util class to create
     a thrid method called frequencyOfChars that can find the frequency
     of all characters from a string
        Ex:
            frequencyOfChars("AAABBBBCCCC");  ===> A3B4C4
            frequencyOfChars("DDEFJJJ"); ===> D2E1F1J3
            please copy paste the method to the util class
     */

    public static String frequencyOfChars(String str){
        String result = "";
        String nonDup = Util.removeDup(str);

        for (char each: nonDup.toCharArray()){
            int count = Util.frequency(str, each);
            result+= "" + each+count;
            }
        return result;
    }

















}
