package day_62;

public class GarbageCollection {
    public static void main(String[] args) {

        String s1 = new String("John"); // no longer referenced by any var, eligible for GC
        String s2 = new String("Aaron");

        s1 = s2;
        System.out.println(s2);






    }
}
