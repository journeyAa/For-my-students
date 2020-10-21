package Practice.Practice_Method_OverLoading;

public class Unique {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 8, 6, 1, 2, 1, 2, 3};
        uniques(arr);

        double[] arr1 = {1.1, 5.5, 9.2, 8.9, 6.5, 1.1, 2.5, 1.9, 2.7, 3.5};
        uniques(arr1);

        String[] arr2 = {"a", "d", "a", "c", "f" , "M", "M"};
        uniques(arr2);

        char[] ch = {'A' , 'C' , 'C' , 'd' , 'd', 'f'};
        uniques(ch);



    }

    public static void uniques(int[] arr) {
        for (int every : arr) {

            int count = 0;

            for (int each : arr) {
                if (every == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(every + " ");
            }
        }
        System.out.println();
    }

    public static void uniques(String[] arr) {
        for (String every : arr) {

            int count = 0;

            for (String each : arr) {
                if (every.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(every + " ");
            }
        }
        System.out.println();


    }

    public static void uniques(char[] arr) {
        for (char every : arr) {

            int count = 0;

            for (int each : arr) {
                if (every == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(every + " ");
            }
        }
        System.out.println();
    }

    public static void uniques(double[] arr) {
        for (double every : arr) {

            int count = 0;

            for (double each : arr) {
                if (every == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(every + " ");
            }
        }
        System.out.println();

    }
}