package repl.itAssignments;

public class PrintVowels_alpha_separator {
    public static void main(String[] args) {

       String word1 = "howdyho";
       String wordAfter = "";
        for (int i = 0; i <= word1.length()-1 ; i++) {
            char ch = word1.charAt(i);
            if(!(ch=='a'|| ch=='o'||ch=='u'||ch=='i'|| ch=='e')){
                continue;

            }
            wordAfter+="" + ch;
        }
        System.out.println(wordAfter);

        char start = 'A';
        char end = 'S';

        for (char i = start; i <= end; i++) {
            System.out.println(i);

        }

        String word = "Word";
        String separator = "X";
        int count = 3;
        String result = "";


        // word, x, 3
        // word +x word+x word
        for (int i = 1; i < count ; i++) {
            result+=word+separator;
        }
        result+=word;
        System.out.println(result);










    }
}
