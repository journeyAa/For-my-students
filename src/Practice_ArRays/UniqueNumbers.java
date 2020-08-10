package Practice_ArRays;
// write a program that can find the unique number from an array of integers
public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,8,9,0,4};

        // this is to check if the first element is unique or not, and to check all the elemebts, i need a loop
        // // only calculate the frequency of the first index
    /*    int n1 = arr[2]; // 1
        int count = 0;
        for (int i = 0; i <= arr.length-1 ; i++) {
            int each = arr[i];   // 1,,2,3,3,4
            if(each==n1){
                count+=1;
            }
        }
        if(count==1){
            System.out.println(n1);
        }

     */
        for (int j = 0; j <= arr.length-1 ; j++) {
            int n1 = arr[j]; // 1
            int count = 0;
            for (int i = 0; i <= arr.length-1 ; i++) {
                int each = arr[i];   // 1,,2,3,3,4
                if(each==n1){
                    count+=1;
                }
            }
            if(count==1){
                System.out.println(n1);
            }
        }













    }
}
