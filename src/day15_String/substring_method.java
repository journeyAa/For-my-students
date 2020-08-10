package day15_String;

public class substring_method {
    public static void main(String[] args) {

        String sentence = "Java is fun";
        // index no.       0123456789..

        // substring (beginning index . ending index)
        String word1 = sentence.substring(0 , 4);
        System.out.println(word1);

        String word2 = sentence.substring(8 , 11);
        System.out.println(word2);

        System.out.println("=================================================================");

        String sentence2 = "I like Movies and TV series";
        //                  123456789101112131415161718

        String word3 = sentence2.substring(7, 13);
        System.out.println(word3);

        String firstName = "MUHTAR";
        String firstCharacter = firstName.substring(0,1);
        String rest = firstName.substring(1,firstName.length()); //last index +1

        firstName = firstCharacter.toUpperCase() + rest.toLowerCase();

        System.out.println((firstCharacter));
        System.out.println(rest);

        String firstName1 = "ABDUKERIMHAJIMAMAT";
        String firstCharacter1 = firstName1.substring(0,1);
        String rest2 = firstName1.substring(1, firstName1.length());

        firstName1 = firstCharacter1.toUpperCase() + rest2.toLowerCase();
        System.out.println(firstCharacter1);
        System.out.println(rest2);

        // substring (beginning index): creates substring from the given beginning
        // index till end of String

        String lastName3 = "cYNTHIA";
        String firstChar = lastName3.substring(0,1);  //s
        String remaining = lastName3.substring(1);    //chool

        lastName3= firstChar.toUpperCase() + remaining.toLowerCase();

        System.out.println(firstChar);
        System.out.println(remaining);

        String s= "I like Game of Thrones";

        String series = s.substring(7);

        System.out.println(series);

        String s2 = "I like Java Programing Language";
        //           01234567...
        String language = s2.substring(7);

        System.out.println(language);






    }
}
