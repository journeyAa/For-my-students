package day24_Arrays;
// find the unique wordfs from an array of string
public class UniqueWords {
    public static void main(String[] args) {

        String[] words = {"C#", "C#" , "JAVA", "Python", "C++", "C#"};
        /*
        //this only check the frequency of 0 so we need loops
        String s = words[0];
        int count = 0; // to assign the frequency of s

        // in order to find the frquency need to compare evey single elment with words // s and words
        for (int i = 0; i <= words.length-1 ; i++) {//
            String each = words[i];// each value changes each time
            if(s.equals(each)){
                count+=1;
            }
        }

        if(count==1){
            System.out.println(s);
        }

         */

        for (int j = 0; j <= words.length-1 ; j++) {
            String s = words[j];
            int count = 0;
            for (int i = 0; i <= words.length-1 ; i++) {
                String each = words[i];
                if (s.equals(each)) {
                    count++;
                }
            }
            if(count==1){
                System.out.println(s);
            }

        }

        // iteration order statrting form 0 to last index, we can use for each loop

        boolean a = true;
        boolean b = true;
        boolean c = true;

        boolean threeLocks = (a&&b)||c;

        System.out.println(threeLocks);
































    }
}
