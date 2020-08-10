package WarmUpTasks;
//Write a program that can count the even and odd number from an array of integers
public class ArrayCountEvenOdd {
    public static void main(String[] args) {

        int[] arr = {45, 89, 34, 1738, 485, 758};
        int evenNum = 0;
        int oddNum = 0;

        for (int i = 0; i <= arr.length-1; i++) {
            if(arr[i]%2==0){
                evenNum+=1;
            }else{
                oddNum+=1;
            }

        }

        System.out.println("the number of even numbers are: "+ evenNum);
        System.out.println("the number of odd numbers are: " + oddNum);

    }
}
