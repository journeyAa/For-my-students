package day25_Practices_Arrays;

public class shortestString2 {
    public static void main(String[] args) {
        String[] arr = {"Adam", "Nicolas", "Demi", "Nurmememt"};
        int minLength = arr[0].length();// will contain the min length

        for (String each: arr) {
            // int l = each.length();
            if(each.length()<minLength){
                minLength=each.length();
                System.out.println(minLength);
            }
        }
        for (String each: arr) {
            if(each.length()==minLength){
                System.out.println(each);
            }
        }


















    }
}
