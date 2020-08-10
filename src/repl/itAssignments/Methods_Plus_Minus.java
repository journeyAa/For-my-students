package repl.itAssignments;

public class Methods_Plus_Minus {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 55, -9, -2, 0};
        plus_minus(arr1);

        int[] arr = {4,1,-1,-1,2};
        isPos(arr);



    }

    public static void plus_minus(int[] arr) {
        int size = 6;
        int positves = 0;
        int negatives = 0;
        int zero = 0;

        for( int each: arr){
            if(each==0){
                zero++;
            }else if(each>0){
                positves++;
            }else{
                negatives++;
            }
        }


        System.out.println(zero);
        System.out.println(positves);
        System.out.println(negatives);


    }

    public static void isPos(int[] num) {
        for (int each : num){
            if(each>0){
                System.out.println("positive");
            }else{
                System.out.println("not positive");
            }

        }




    }


}
