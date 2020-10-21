package Practice.Practice_ArRays;

public class UniqueOmni {
    public static void main(String[] args) {
        String str = "aabcc";

        String expected = "";

    /*    // this loop is to see how many times the first char appeared in the str and add it to count
        char ch1 = str.charAt(2); // a
        int count = 0;
        for (int i = 0; i <= str.length()-1 ; i++) {
            char each = str.charAt(i); // a a b c c
            if(ch1==each){
                count+=1;
            }
        // this if statement meaning is that if it occured only once(if the frequency is one, it is added to the expected
        }
        if(count==1){
            expected += ch1;
        }
        System.out.println(count);
        System.out.println(expected);

     */




        for (int j = 0; j <= str.length()-1 ; j++) {// this loops is to find out every single character that is unique
            char ch1 = str.charAt(j); // a b c d
            int count = 0;
            for (int i = 0; i <= str.length()-1 ; i++) {
                char each = str.charAt(i); // a a b c c
                if(ch1==each){
                    count+=1;
                }
                // this if statement meaning is that if it occured only once(if the frequency is one, it is added to the expected
            }
            if(count==1){
                expected += ch1;
            }

        }

        System.out.println(expected);


























    }
}
