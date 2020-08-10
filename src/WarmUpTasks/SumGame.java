package WarmUpTasks;

public class SumGame {
    public static void main(String[] args) {

        int sumOdd = 0;
        int sumEven = 0;
        int totalSum = 0;

        for(int i = 0; i <= 100; i++){
            totalSum += i;
            if(i % 2 ==0){
                sumEven += i;  // 2 4 6 8
                System.out.print(" "+ i);
            }else if(i % 2 ==0){
                sumOdd += i;
            }
        }

        System.out.println(totalSum);
        System.out.println(sumEven);
        System.out.println(sumOdd);



















    }
}
