package Warm_Ups.PHONE;
/*
 5. create a class called phone objects:
                         create three objects of each phone and test everything out
 */
public class PhoneObject {
    public static void main(String[] args) {

        iPhone iPhone1 = new iPhone("iPhone 8", 850, "big");
        System.out.println(iPhone1);
        iPhone1.faceTime();
        iPhone1.text(647-547-6984);
        System.out.println("=========================================================");

        Samsung samsung1 = new Samsung("Galaxy 11", 1200, "huge");
        System.out.println(samsung1);
        samsung1.freeze();
        System.out.println("==========================================================");

        Nokia nokia1 = new Nokia("5700", 450, "small");
        System.out.println(nokia1);
        nokia1.breakTheFloor();












    }
}
