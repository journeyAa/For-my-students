package Office_Hours.Practice_09_09_2020;

import Warm_Ups.PHONE.Samsung;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("8 plus", 850);
        iphone.call(911);

        System.out.println(iphone);

        SamSung samsung = new SamSung("Galaxy Note20",799.99);

        System.out.println(samsung);
        samsung.call(12346);
        samsung.text(123457);

        Nokia nokia = new Nokia("Brick", 100);
        nokia.call(75486);
        nokia.text(78456175);
        System.out.println(nokia);














    }
}
