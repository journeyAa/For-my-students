package repl.itAssignments;

public class ForLoopVowel {
    public static void main(String[] args) {

       String vowel = "";//oiaoe
       String word = "song lyrics galore";

        for (int i = 0; i <= word.length()-1; i++) {
            char ch = word.charAt(i);
            boolean vow = (ch=='a')|| (ch=='o')||(ch=='u')||(ch=='i')||(ch=='e');
           if(vow){
               vowel+=ch;
           }

        }
        System.out.println(vowel);










    }
}
