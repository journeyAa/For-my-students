package Library;

import day50_Inheritance_Overriding.AccessModifiers;
import day50_Inheritance_Overriding.Test;

import java.nio.channels.AcceptPendingException;

public class InheritanceTest extends AccessModifiers {
    public static void main(String[] args) {

        System.out.println(InheritanceTest.publicData);// public is visible outside package
        System.out.println(InheritanceTest.protectedData);//protected is visible always
      //  System.out.println(InheritanceTest.default);//default is not visible outside package







    }

}
