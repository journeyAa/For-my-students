package Practice_ArRays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {1,50,900,54,32,-80};
        int max = arr[0];
        int min =arr[0];

        for (int i = 0; i <= arr.length-1 ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println("The max number in this array is: " + max);
        System.out.println("The min number is this array is: " + min);







    }
}
