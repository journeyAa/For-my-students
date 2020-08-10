package day32_methodOverloading;
import Library.Util;

import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {

        String firstName = "elKEem";
        String lastName = "emET";

        String fullName =  Util.formatFullName(firstName,lastName);

        System.out.println(fullName);

        String unique = Util.uniques(fullName.toLowerCase());
        System.out.println(unique);

        String reverse = Util.reverse(fullName);
        System.out.println(reverse);

        System.out.println("=======================================================");

        int[] a = {200,400,500,1000,40,50,78,60};
        int n = 2500;

        a = Util.addElement(a, n);

        System.out.println(Arrays.toString(a));


















    }
}
