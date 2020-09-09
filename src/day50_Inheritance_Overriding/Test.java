package day50_Inheritance_Overriding;

public class Test extends AccessModifiers {
    public static void main(String[] args) {

        // 3 instances are created as it inherits from super class

        System.out.println(Test.publicData);
        System.out.println(Test.protectedData);// visible only to the sub class
        System.out.println(Test.defaultData);
//        System.out.println(Test.privateData);







    }
}
