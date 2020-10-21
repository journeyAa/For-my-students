package Practice.Practice_ArRays;

public class day27_Practice2 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        for (int each: arr){
            System.out.print(each + " ");
        }
        System.out.println();

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("===============================================");

        int[] scores = {10,20,30,40,50,60,70,80,90,100};
        for (int each: scores){
            if(each%3!=0){
                continue;
            }
            System.out.print(each + " ");
        }

        System.out.println();
        System.out.println("==============================================================");

        String[] names = {"AB", "ABC", "AB", "ABCD"}; // print out if contains c

        for (String each : names){
            if(!each.contains("C")){
                continue;
            }
            System.out.println(each);
        }

        int[] score = {80,90,100,50,25};

        int max = score[0];
        int min = score[0];

        for (int each: score){
            if(each>max){  // 80.90.100   // 80
                max=each;
            }
            if(each<min){
                min = each;
            }
        }
        System.out.println("The max score in the array is " + max);
        System.out.println("The min score in the array is " + min);

















    }
}
