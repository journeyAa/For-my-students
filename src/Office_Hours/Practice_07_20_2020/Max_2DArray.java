package Office_Hours.Practice_07_20_2020;
/*write a program that can find the max num from any given two dimensional array
 */
public class Max_2DArray {
    public static void main(String[] args) {
//                        0 1 2    0 1 2 3   0 1 2  3   4
        int[][] arr2D = {{1,2,3}, {4,5,6,7},{8,9,10,11,12}};
  //                      0          1            2
        int max = arr2D[0][0];

      //  int max = eachArray[0];
        //

        for (int j = 0; j <= arr2D.length-1; j++) { // j: index num of arrays
            int[] eachArray = arr2D[j];
            for (int i = 0; i <=eachArray.length-1; i++) { // index of each element
                int eachNum = eachArray[i];
                if(eachNum>max){
                    max =eachNum;
                }

            }

        }
        System.out.println(max);
     /*
        // this loop is comparing only the first array with other arrays
        int[] eachArray = arr2D[0];
       for (int i = 0; i <=eachArray.length-1; i++) {
            int eachNum = eachArray[i];
            if(eachNum>max){
                max =eachNum;
            }

        }

       */


























    }
}
