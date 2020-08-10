package day26_MultiDimentionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class multi_DArray_Practice1 {
    public static void main(String[] args) {
      String[] testers = {"Lillia", "Odilia", "Lily", "Elkem"};
      String[] developers = {"Ahmed", "Erfan", "Roza", "Mikri"};
      String[] SM = {"Mahira"};
      String[] PO = {"Alex"};
      String[] BA = {"Brian"};

        String[] testers2 = {"Irene", "Aslan", "Nazar"};
      String[][] scrumTeam = {testers, developers, SM, PO, BA};
                    //          0          1       2    3   4

        scrumTeam[4][0]= "Adam";
        scrumTeam[1][2] = "Emine";
        scrumTeam[0]=testers2;
        scrumTeam[3][0] = "Alper";

        System.out.println(Arrays.deepToString(scrumTeam));

        for(String[] each : scrumTeam){// to iterate the single D array, we need another loop
            for(String name : each)
            System.out.println(Arrays.toString(each));
        }

        int[][] scores = {{10,20,30,40},{50,60,75,100},{98,105,46,22}};
        // print out the nums that are divisible by 3 or 5
        for(int[] each1DArray : scores){
            for(int eachElement : each1DArray){
                if(eachElement % 3 ==0 || eachElement % 5 ==0){
                    System.out.print(eachElement + " ");
                }
            }
        }

        System.out.println("===================================================================");
        int[][] a1 = {{1,2}, {3,4,5}};
        int[][] a2 = {{6,7}, {8,9,10}};

        int[][][] arr3D = {{{1,2}, {6,7}, {8,9,10}}};









    }
}
