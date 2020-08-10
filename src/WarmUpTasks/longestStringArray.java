package WarmUpTasks;
//1. Write a program that can return the longest string of text from a String array
public class longestStringArray {
    public static void main(String[] args) {

        String arr[]={"spaghetti", "meatball", "steak", "roasted lamb"};
        //                0           1          2             3
        int longestS = arr[0].length();
        int longestIndex = 0;
        for (int i = 0; i <= arr.length-1 ; i++) {
            if(arr[i].length()>longestS){
                i = longestIndex;
        }

        }
        System.out.println(arr[longestIndex]);


















    }
}
