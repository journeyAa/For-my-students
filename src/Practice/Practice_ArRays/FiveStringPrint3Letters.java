package Practice.Practice_ArRays;

//Write a program that will take five strings and save them into an array called arr. and use for loop to ptint out the
// first three letters of each letter of each element of arr, one per like
// you can assume that every element of arr is at least 3 letters long
// example : arr ==> {"apple" "banana" == print app ban
public class FiveStringPrint3Letters {
    public static void main(String[] args) {
        String[] arr = {"apples", "banana", "pears", "grapes"};
        for (int i = 0; i <= arr.length-1 ; i++) {
            String str = arr[i];
            str = str.substring(0,3);
            System.out.println(str + " ");
        }
        System.out.println("====================================================");
        for(String each: arr){
            String str = each.substring(0,4);
            System.out.println(str);
        }











    }
}
