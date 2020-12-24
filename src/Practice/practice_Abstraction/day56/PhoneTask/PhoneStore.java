package Practice.practice_Abstraction.day56.PhoneTask;

public class PhoneStore {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple", "XS", 1200, "large");
        iphone.faceTime(1234, 4589);
        System.out.println(iphone);

        SamSung samSung = new SamSung("SamSung", "Galaxy", 1000, "large");
        samSung.freezing();
        System.out.println(samSung);








    }
}
