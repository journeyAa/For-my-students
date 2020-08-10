package repl.itAssignments;

import java.util.Arrays;

public class Method_cleanString {
    public static void main(String[] args) {
        String s = "abcdefgggg";
        String b5 = "g";

        System.out.println(cleanMethod(s,b5));

        String s5 = "abcd";
        int l = 2;

        System.out.println( limit(s5,l));

        String a5 = "ABCGHI";
        String a1 = "DEF";
        System.out.println(at3(a5,a1));

        String a = "apple";
        String b = "orange";


        String st = "zabc";
        System.out.println(removeFirst(st));




    }
    public static String cleanMethod(String text, String badWord){
        text = text.replace(badWord,"");
        return text;
    }

    public static String limit(String text, int maxLengh){
        text = text.substring(0,maxLengh);
        return text;
    }

    public static String at3(String target, String word){
        String s1 = target.substring(0,3);
        String s2 = target.substring(3);
        target = s1 + word + s2;
        return target;

   }

   public static String biggerS(String a, String b){
       if(a.length()>b.length()){
           return a;
       }else{
           return b;
       }



  }

  public static String removeFirst(String target){
        target = target.replaceFirst(target.substring(0,1),"");
        return target;
  }









}




