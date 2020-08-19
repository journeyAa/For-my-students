package day43_Static;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import day42_Static.Tester;

public class StaticBlock2 {
    static int a;
    static String b;
    static Tester tester1;
    static Tester tester2;

    static {
        a = 100;
        b = "Cybertek";

        tester1 = new Tester();
        tester1.setInfo("Muhtar", 'M', 13354L, "Boss", 125000);

        tester2 = new Tester();
        tester2.setInfo("Murat", 'M', 54678L, "QA", 154000);
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(tester1);
        System.out.println(tester2);

    }
}
