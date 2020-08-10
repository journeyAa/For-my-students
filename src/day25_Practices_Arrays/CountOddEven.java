package day25_Practices_Arrays;

public class CountOddEven {
    public static void main(String[] args) {
        int[] nums = {1,2,3,14,7,9,6,5,12,};
        int countEven = 0;
        int countOdd = 0;

        String even = "";
        String odd = "";

        for(int each : nums){
            if(each%2==0){
                countEven+=1;
                even+=each+ " ";
            }else{
                countOdd+=1;
                odd+=each + " ";
            }
        }
        System.out.println("There are " + countEven + " among those  Even numbers." + even);
        System.out.println("There are " + countOdd + " among those  Odd numbers." + odd);
























    }
}
