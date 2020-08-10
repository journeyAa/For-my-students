package Practice_ArRays;
// write a program that can count the even and odd numbers from an array of integers
public class CountOddEven {
    public static void main(String[] args) {
        int[] numbers = {3, 50, 12, 6, 85, 102, 36, 71, 33};
        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i <= numbers.length - 1; i++) {
            if (i % 2 == 0) {
                countEven++;
            }
            if (i % 2 == 1) {
                countOdd++;
            }

        }
        System.out.println(countEven);
        System.out.println(countOdd);

        System.out.println("===============================================================");
        int[] nums = {9, 12, 56, 100, 259, 1456, 9856, 214, 65, 214, 78};
        String odd = " ";
        String even = " ";

        for (int each : nums) {
            if (each % 2 == 0) {
                countEven++;
                even += each+ " ";
            } else {
                countOdd++;
                odd += each+ " ";
            }

        }
        System.out.println("Even numbers: " + even);
        System.out.println(countEven);
        System.out.println("Odd numbers: " + odd);
        System.out.println(countOdd);

    }
}
