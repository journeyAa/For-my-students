package day19_ForLoop;

public class SumOfEvenOdd {
    public static void main(String[] args) {
// 1. write a program that can calculate the sum of all even numbers

        int sumOfEven = 0;
        /*
        sum += 2;
        sum += 4;
        */

        for (int i = 0; i <= 100; i += 2){
            sumOfEven += i;  // sum of all the even numbers
        }
        System.out.println(sumOfEven);



        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0) {
                sumOfEven += i;
            }
        }
        System.out.println(sumOfEven);

        System.out.println();
        System.out.println("==========================================================");

        // taks 4
        // 1 3 5 7 9 ..........99
        int sumOfOdd = 0;

        for(int i = 1; i <= 99; i += 2 ){
            sumOfOdd += i;
        }
        System.out.println(sumOfOdd);


        System.out.println("=================================================================");


        for(int i = 0; i <= 100; i++){
            if(i % 2 != 0){
                sumOfOdd += i;
            }
        }
        System.out.println(sumOfOdd);























    }

}
