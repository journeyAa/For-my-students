package day33_LocalDataTime;

public class Uniques {
    public static void main(String[] args) {

        int[] arr = {2,2,1,4,4};

        for (int element : arr){
            int count = 0;
            for (int b : arr) {
                if(element==b){
                    count++;
                }
            }
            if(count==1){
                System.out.println(element);
            }
     }

        System.out.println("================================================");

    /*    int element = arr[0]; // 2
        int count = 0;
        for (int b : arr) {
            if(element==b){
                count++;
            }

        }
        if(count==1){
            System.out.println(element);
        }

     */
        System.out.println("===========================================================");

        int[] n1 = {10,20,30,40,50,60,70,80,100,100};
        UniqueElements(n1);
        System.out.println("=================================================================");

        double[] n2 = {10,20,20, 40, 50, 50};
        UniqueElements(n2);
        System.out.println("=================================================");

        String[] n3 = {"A", "A", "B", "C", "D", "D"};
        UniqueElements(n3);
        System.out.println("===============================================");

        char[] ch = {'A','B', 'B', 'C'};
        UniqueElements(ch);



    }
    public static void UniqueElements(int[] arr){
        for (int element : arr){
            int count = 0;
            for (int b : arr) {
                if(element==b){
                    count++;
                }

            }
            if(count==1){
                System.out.println(element);
            }
        }
        System.out.println();

    }
    public static void UniqueElements(char[]arr){
        for(char element : arr) {
            int count = 0;
            for (char b : arr) {
                if (element == b) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");
            }

        }
        System.out.println();
    }

    public static void UniqueElements(double[]arr){
        for(double element : arr){
            int count = 0;
            for (double b: arr){
                if(element==b){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+ " ");
            }
        }
        System.out.println();
    }
    public static void UniqueElements(String[] arr){
        for (String element : arr){
            int count = 0;
            for (String b: arr){
                if(element.equals(b)){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+ " ");
            }
        }
        System.out.println();
    }





}
