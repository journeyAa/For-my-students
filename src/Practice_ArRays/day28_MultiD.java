package Practice_ArRays;

public class day28_MultiD {
    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3}, {4,5,6,7,8},{9,10,11}};

        for (int[] each: arr2D){ // {123} // {4,5,6,7,8} // {9,10,11}
            for (int nums : each){
                System.out.print(nums + " ");
            }
        }

        System.out.println();
        System.out.println("==================================================");
        String[] group1 = {"A", "B" , "C", "D", "E"};
        String[] group2 = {"F", "G", "H" , "I" , "J"};
        String[] group3 = {"K", "L", "M", "N"};
        String[] group4 = {"O", "P" ,"Q"};

        String[][] letters = {group1, group2, group3, group4};

        for (String[] each : letters){
            //  System.out.println(Arrays.toString(each));
            for (String every : each){
                System.out.print(every + " ");
            }
        }













    }
}
