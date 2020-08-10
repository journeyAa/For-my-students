package day24_Arrays;
//2. write a program that asks user how many numbers he wants to enter, and get all the user inputs and store them into an array variable, and then write the program that can return maximum and minimum numbers
//    3. Write a program that can return the average number from an array of integers
//            ex: [1,2,3]
//            average: 2
//            [10, 15, 5, 6]
//            average: 9
//            [4, 5, 6, 7, 8, 10, 20, 30, 0]
//            average: 10
public class ArrayAverageNum {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6};
        double average = 0;
        int sum = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            sum += nums[i];
            average = average / nums.length;

        }

        average = sum / (double) nums.length;

        System.out.println(average);

        for (int i = 0; i < 5; i++) {
            System.out.print("*");

        }
        System.out.println();


        for (int i = 0; i < 3; i++) {
            System.out.println("*   *");
        }


        for (int i = 0; i < 5; i++) {
            System.out.print("*");


        }
    }
}