package Practice_ArRays;
// write a program that can return the average num from an array of integers
// [10,15,5,6] == average = 9
public class FindingAverageInArrays {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for (int i = 0; i <= arr.length-1 ; i++) {
            sum+=arr[i];// we want the element, not the index num, so not i but arr[i]
        }
        System.out.println(sum);
        double average =(double) sum/arr.length;
        System.out.println(average);














    }
}
