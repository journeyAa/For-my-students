package day25_Practices_Arrays;

public class LongestString {
    public static void main(String[] args) {// find the max length
        String[] arr = {"Adam", "Nicolasii", "Demi", "Nurmememt"};
        int maxLength = arr[0].length();
        for (String each : arr) {
            if(each.length() > maxLength){
                maxLength = each.length();
            }
        }
        System.out.println(maxLength);

        for (String each : arr) {// used for printing out the string that has max length
            if(each.length()==maxLength){
                System.out.println(each);
            }

        }
















    }
}
