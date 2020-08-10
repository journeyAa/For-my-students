package Office_Hours.Practice_07_13_2020;
// frequency of character
// "java" == J1A2V1            "DDEEEFFFF"===== D2E3F4
public class Frequency {
    public static void main(String[] args) {
        String str = "OOPQQ";
        String result = "";
        String nonDup = " ";
        // to remove the duplicate, we used the loop
        for (int j = 0; j <=nonDup.length()-1 ; j++) {
            char ch1 = nonDup.charAt(j);
            int count = 0;
            for (int i = 0; i <str.length()-1 ; i++) {
                char ch = str.charAt(i);
                if(ch == ch1){
                    count++;
                }
            }
           result += "" + ch1 +count;



        }
        System.out.println(result);
/*
        for (int i = 0; i <= str.length()-1 ; i++) {
            String each = " " + str.charAt(i); // O O P Q Q
            if(!nonDup.contains(each)){
                nonDup+=each;

            }
        }
        System.out.println(nonDup);


        char ch1 = nonDup.charAt(0);
        String result = "";
        int count = 0;
        for (int i = 0; i <str.length()-1 ; i++) {
            char ch = str.charAt(i);
            if(ch == ch1){
                count++;
            }
        }
        System.out.println(count);

        result+="" + ch1+count;



 */
























    }
}
