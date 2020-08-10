package Practice_NestedLoop;

public class StartUpCase_EndLowCase {
    public static void main(String[] args) {

       String name = "RainNs";
       char ch1 = name.charAt(0);
       char ch2 = name.charAt(name.length()-1);

       boolean uppCase = ch1 >= 'A' && ch1<='Z';
       boolean lowCase = ch2 >= 'a' && ch2 <='z';

        System.out.println(uppCase&lowCase);
















    }
}
