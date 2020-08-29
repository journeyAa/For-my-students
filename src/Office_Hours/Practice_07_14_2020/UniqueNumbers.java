package Office_Hours.Practice_07_14_2020;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 1};


    /*    int num = arr[3];// then 1 this check the frequenct of char 0, then 1, then 2, so we need loop
        int count = 0; // for the frequency of num in the arr
        for(int each: arr){// for counting the fequency of num
            if(each==num){
                count++;
            }
        }
        System.out.println(count);

        if(count==1){
            System.out.println(num);

        }
        what we did above only checks if the first element is frequent

     */

        for (int b: arr) {
            int num = arr[3];// then 1 this check the frequenct of char 0, then 1, then 2, so we need loop
            int count = 0; // for the frequency of num in the arr
            for(int each: arr){// for counting the fequency of num
                if(each==b){
                    count++;
                }
            }
            System.out.println(count);

            if(count==1){
                System.out.println(b);

            }


        }


















    }
}
