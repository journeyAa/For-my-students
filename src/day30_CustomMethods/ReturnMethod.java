package day30_CustomMethods;

public class ReturnMethod {
    public static void main(String[] args) {
        addition(4, 8);
        int sum = addition2(10,20);
        System.out.println(sum);
    }

    public static void addition(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static int addition2(int a, int b) {
        int sum = a +b;
        return sum;

    }
}


