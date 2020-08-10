package day16_String;

import java.nio.file.attribute.UserPrincipalNotFoundException;

public class practice_replaceMethod {
    public static void main(String[] args) {

        String email ="Cybertek@gmail.com";

        email = email.replace("gmail", "yahoo");

        String sentence = "I like to learn Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, java", "a, C#");
        sentence = sentence.replace("Java ", "Python ");

        System.out.println(sentence);


        String s1 = "I like to stay in Cybertek, Cybertek is a nice place";
        s1 = s1.replace("Cybertek", "MIT");
        System.out.println(s1);

        s1 = s1.replace("MIT", "Cybertek");

        System.out.println(s1);

        String s2 = "I like to leaRn Java, we aRe enjoying Java";
        s2 = s2.replace('R', 'r');
        System.out.println(s2);

        // replaceFirst(oldValue, newValue)
        String s3 = "Java is fun, Java is cool";


        //replace first
        String s4 = "I like to drink tea and tea ";
        s4 = s4.replaceFirst("tea" , "coke");
        System.out.println(s4);

        String s5 = "I like to watch Game of Throne , and The Walking Dead";
       s5 = s5.replace(", and The Walking Dead", ".");

        System.out.println(s5);









    }
}
