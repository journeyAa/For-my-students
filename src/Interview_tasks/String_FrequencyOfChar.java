package Interview_tasks;

public class String_FrequencyOfChar {
    /*
    Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {

        System.out.println(frequency("AAABBCDD"));

    }


    public static String frequency(String str){
        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            String eachChar = (str.charAt(i)+"");
            if(!nonDup.contains(eachChar)){
                nonDup+=eachChar;
            }
        }

        String result = "";
        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if((str.charAt(i)) ==nonDup.charAt(i)){
                    count++;
                }

                result += nonDup.charAt(j) + ""+count;

            }


        }



        return result;
    }



}
