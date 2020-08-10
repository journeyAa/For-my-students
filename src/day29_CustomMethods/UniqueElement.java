package day29_CustomMethods;

public class UniqueElement {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C", "F", "G"};
        unique(arr);

        String[] arr1 = {"a","d","f","a","m"};;
        unique(arr1);



    }

    public static void unique(String[] arr) {
        for (String a : arr) { // gets each of the element
            int count = 0;

            for (String each : arr) {// get the frequnecy of the element
                if (a.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(a + " ");
            }
        }
        System.out.println();


    }
}
