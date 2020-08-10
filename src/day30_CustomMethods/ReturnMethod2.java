package day30_CustomMethods;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import com.sun.org.apache.bcel.internal.generic.DRETURN;

public class ReturnMethod2 {
    public static void main(String[] args) {
        String name = "level";
        revStr(name);

        //   System.out.println(name.equals(revStr();));

        String reverseName = revStr(name);
        System.out.println(name.equals(reverseName));


    }

    /*  public static void revStr(String str){
          String result = "";
          for (int i = str.length()-1; i >= 0 ; i--) {
              result+=str.charAt(i);

          }
          System.out.println(result);
      }

     */
    public static String revStr(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        return result;
    }
}
