package WarmUpTasks;
//        3. Create an int array called numbers that has length of 100 and
//        Assign 1-100 to each index of the array.
//        then print out all the even numbers. MUST use continue statement
public class ArrayNums {
    public static void main(String[] args) {
        int[]numbers = new int[100];

//        numbers[1] = 1;
//        numbers[2]= 2;
//        numbers[n] = n;
        for (int i = 0; i<= numbers.length; i++) {
            numbers[i]=i;
            if(i%2==1){
                continue;
            }
            System.out.println(numbers[i]);
        }




    }
}
