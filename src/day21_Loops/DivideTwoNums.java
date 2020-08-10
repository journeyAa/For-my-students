package day21_Loops;
//  3. write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
//            ex:
//                input:  10
//                        3
//                0utput: 3 with a remainder of 1
public class DivideTwoNums {
    public static void main(String[] args) {

        int a = 20;
        int b = 0;
        int count = 0;

        if(b == 0){
            System.out.println("Invalid Input");
            System.exit(0);
        }

        while(a >= b){
            a -= b;
            count++;
        }

        System.out.println(count + " with a remainder of "+ a);


        boolean result = false;

        while (result){
            System.out.println("Hello");
        }
        System.out.println("============================================");





















    }
}
