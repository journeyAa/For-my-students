package Practice.Practice_Interview_Questions;

public class Uniques_inStringAr {
    public static void main(String[] args) {
        /*
        1.  Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
            MUST use for each loop

         */
        // Unique means this str showed up only once, so we repeat comparing each
        //element and find the frequency then if the count is 1, it is unique
        String[] arr = {"A", "B", "B", "C", "D"};

        // in order to find if the first element is unique, i need to compare it with
        // every other element in the array, so i need a loop
       for (String a : arr){   // A B B C D // getting each elements

           int count = 0;

           for (String each: arr){// getting the frequency
               if (a.equals(each)) {
                   count++;
               }
           }
           if(count==1){
               System.out.println(a);
           }
       }










































    }
}
