package day17_String_review;

public class String_Methods {
    public static void main(String[] args) {

        String str = "Cybertek";
        //            0123456789

        char ch1 = str.charAt(7);
        System.out.println(ch1);

        String st2 = "Cybertek;";
        st2 = st2.concat(st2);
        System.out.println(st2);

        // length();
        String str3 = "Cybertek";
        int l = str3.length();
        System.out.println(l);

        // lastIndex: length - 1;

        char ch2 = str3.charAt(l-1);
        System.out.println(ch2);

        // upperCase & lowerCase
        String str4 = "cybertek";
        str4 = str4.toUpperCase();
        System.out.println(str4);

        String str5 = "JAVA";
        str5 = str5.toLowerCase();
        System.out.println(str5);

        // trim
       // String str6 =

        String str7 = "I like Java Language";

//        str7 = str7.substring(7,10+1);
//       // String word = str7.substring(7,11);
//        System.out.println(str7);
//       // System.out.println(word);
//
//        String word2 = str7.substring(12,str7.length());
//        String word3 = str7.substring(12);
//
//        System.out.println(word2);
//        System.out.println(word3);
//
//        String wordLike = str7.substring(2,5+1);
//        System.out.println(wordLike);
//        // ending index is excluded so need to add 1 to it

        //indexOf & lastIndexOf ===>

        String str8 = "Hello Batch 20, have a wonderful day";
        int i1 = str8.indexOf("W");
        System.out.println();

        System.out.println(str8.charAt(i1));

        int i2 = str8.indexOf(", W") + 2;
        System.out.println(i2);

        String str9 = "JAVA JAVA JAVA";
        int i4 = str9.lastIndexOf("J");
        int i5 = str9.indexOf("J");


        int i6 = str9.indexOf(" Java ") + 1;
        int i7 = str9.lastIndexOf("Java ");

        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i7);

        String s2 = "I like java, Java is a programing language";
        s2 = s2.replaceFirst("Jav", "#");

        System.out.println(s2);

        String s3 = "I like Java, Java is a programing language";
        s3 = s3.replace("Java is", "c# is");

        System.out.println(s3);







    }
}
