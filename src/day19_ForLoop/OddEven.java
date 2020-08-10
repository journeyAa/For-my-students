package day19_ForLoop;
/*Wrtie a program that can print all the ODD nums between 0--100 that can be divisible by 3 & 5;
2. Write a program that can print all the EVEN numbers between 0--100  that can be divisible by 3 & 5*/
public class OddEven {
    public static void main(String[] args) {
        // 1 3 5 7 9 ..99//

        for (int i = 1; i <= 99; i += 2) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.print(i + " ");
                }

            }
        }

        System.out.println();
        System.out.println("===================================================================");

        // taks 02
        // 0 2 4 6 8 10.............100

        for (int i = 0; i <= 100; i +=2) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for(int i = 0; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.print(i + " ");
            }
        }













    }

}