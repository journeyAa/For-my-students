package day23_Arrays;
//     2. Write a program that can return the shortest string of text from a String array
public class    longestStringArray {
    public static void main(String[] args) {

        String arr[] = {"lamb kebab", "kofte", "ramen", "masala chickpeas"};
        int longestS = arr[0].length();
        for (int i = 0; i <= arr.length-1 ; i++) {
            if(arr[i].length()>longestS){
                longestS=i;
            }

        }
        System.out.println(arr[longestS]);

        int shortestS = arr[0].length();
        for (int i = 0; i <= arr[0].length()-1 ; i++) {
            if(arr[i].length() > shortestS){
                shortestS=i;
            }

        }
        System.out.println(arr[shortestS-1]);












    }
}
