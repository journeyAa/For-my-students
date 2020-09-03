package day47_Encapsulation;

public class Test {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicVariable); // public is visible at everywhere
        AccessModifiers.publicMethod();

        System.out.println(AccessModifiers.defaultVariable); // default is accessible within the same package
        AccessModifiers.defaultMethod();

        //AccessModifiers.privateVariable; //  private is accessible only within the class


        Encapsulation obj1 = new Encapsulation();

        System.out.println(obj1.getSsn());


        obj1.setSsn(7654389);

        System.out.println(obj1.getSsn());



    }
}
