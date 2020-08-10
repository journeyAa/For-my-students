package day25_Practices_Arrays;
/* Write a program that will take five Strings and save them into an array called arr.
and  Use for loop to print out the first three letter of each element of arr, one per line.
            You can assume that every element of arr is at least 3 letters long.
                Example: arr -> ["apple", "banana"]
                        prints:  appban

 */
public class First3Chars {
    public static void main(String[] args) {
        String[] words = {"Apples", "Bananas", "Strawberry", "Java", "Python"};

      /*  System.out.println(words[0].substring(0, 2+1));
        System.out.println(words[1].substring(0, 2+1));
        System.out.println(words[2].substring(0, 2+1));
        this step we need to repeat so we use loops
       */

        for (int i = 0; i <= words.length-1 ; i++) {
            System.out.print(words[i].substring(0, 2+1));

        }
        System.out.println();

        System.out.println("=============================================================================");
        for(String each : words){
            System.out.print(each.substring(0, 2+1));
        }


























    }
}
