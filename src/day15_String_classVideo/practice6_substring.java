package day15_String_classVideo;

public class practice6_substring {
    public static void main(String[] args) {

        // 1. substring (beginning index, ending index) exlude the ending index

        String sentence = "Java is fun";
        //                 012345678910
        String word = sentence.substring(0, 4);
        System.out.println(word);

        String word1 = sentence.substring(8, 11);
        System.out.println(word1);

        String sentence1 = "I enjoy spending time with the family";
        String word2 = sentence1.substring(2, 7);
        System.out.println(word2);

        String firstName = "AALIA";
        String firstCharacter = firstName.substring(0, 1);
        String rest = firstName.substring(1, firstName.length());//last index + 1
        System.out.println(rest);

        firstName = firstCharacter.toUpperCase() + rest.toLowerCase();
        System.out.println(firstName);


        // 2. substring (beg) creates sub-string from the beg to end

    }






    }
