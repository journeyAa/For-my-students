package Practice_Loop;

public class OddEvenNums {
    public static void main(String[] args) {
        // print all the ODD nums between 0--100 that can be divisible by 3 and 5

        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 1){
                if(i % 3 == 0 && i % 5 ==0)
                    System.out.print(i + " ");
            }

        }
        System.out.println();
        System.out.println("======================================================================");

        // print even nums can be divisible by 3 and 5

        for (int i = 0; i<=100; i+=2) {
            if(i%3 == 0 && i%5==0){
                System.out.print(i + " ");
            }
        }

        // calculate the sum of all the even numbers between 1 to 100;
        System.out.println("sum of even numbers");
        for (int e = 0; e <= 100; e++) {
            e++;

        }






       // print letters from A to Z
        System.out.println();
        System.out.println("letters==============================================" );

        for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
            System.out.print(ch1 + " ");
        }
        System.out.println();

        for (char ch2 = 'z'; ch2 >= 'a'; ch2--) {
            System.out.print(ch2 + " ");
        }


















    }
}
