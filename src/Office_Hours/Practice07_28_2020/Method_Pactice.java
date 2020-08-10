package Office_Hours.Practice07_28_2020;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class Method_Pactice {
    // Access Modifier
    public static void main(String[] args) {
        String name = "Alper Bryan";
        System.out.println(reverseStr(name));

        String s = "kayan";
      //  System.out.println(isPalandrome();); it is void so no value
        isPalandrome(s);
        isPalandrome(name);

        System.out.println("====================================================================");

        String[] names = {"Aslan" , "Bilal" , "Erfan" , "Ayhan"};
        ArrayList<String> nameList = new ArrayList<>();

        for (String each : names){
           // System.out.println(reverseStr(each));
          //  isPalandrome(each);
            nameList.add(reverseStr(each));
        }

        System.out.println(nameList);




    }
    public static String reverseStr(String str){
        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result+= str.charAt(i);

        }
        return result;
    }

    public static void isPalandrome(String str){  // ABC
        String reverseStr = reverseStr(str);  // CBA
        boolean palandrome = str.equalsIgnoreCase(reverseStr); // ==


        System.out.println((palandrome) ? "Is palindrome" : "Is not palindrome");

    }

}
