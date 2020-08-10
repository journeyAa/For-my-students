package Practice_Loop;
// write a program that calculates the sum of all the EVEN nums between 0 -- 100;
//....................................................ODD.......................;
public class SumOfOddEven {
    public static void main(String[] args) {
        int sumEven=0;
        int sumOdd=0;

        for (int i = 0; i <= 100; i+=2) {
          sumEven+=i;
        }
        System.out.println("Sum of all the even numbers is: " + sumEven);

        for (int i = 0; i <= 100; i++) {
            if(i%2 != 0){
                sumOdd += i;
            }
        }
        System.out.println("Sum of all the odd numbers is: " + sumOdd);


        




















    }
}
