package day29_CustomMethods;

public class MaxMin {
    public static void main(String[] args) {
        int[] numbers = {9,50,100,-82,55,968};
        MaxMin(numbers);



    }


    public static void MaxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int each : arr){
            if(each>max){
                max = each;
            }
            if(each<min){
                min = each;
            }
        }
        System.out.println("max is: " + max);
        System.out.println("min is: " + min);
    }
}

