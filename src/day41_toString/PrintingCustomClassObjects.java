package day41_toString;

public class PrintingCustomClassObjects {
    public static void main(String[] args) {

        String str = new String("Cybertek");
        System.out.println(str.toString()); // object name
        System.out.println(new String ("School"));
        // used when we print the object of object name
        // must be called
        System.out.println("=========================================================");

        Carpet c1 = new Carpet();
        c1.customOrder(7,5,10,true);
        System.out.println(c1);















    }
}
