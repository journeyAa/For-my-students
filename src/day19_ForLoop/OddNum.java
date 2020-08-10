package day19_ForLoop;

public class OddNum {
    public static void main(String[] args) {
// print odd numbers between 1 to 50;
// print even numbers between 1 to 50
        String odd = "The odd numbers between 0 to 50 are: ";
        String even = "The even numbers between 0 to 50 are: ";

        for(int oddN = 0; oddN <= 50; oddN ++)
        {
            if(oddN % 2 == 0){
                continue;
            }
            String result = odd;
            System.out.print(oddN + " ");
        }
        System.out.println();
        System.out.println("==============================================================");

        for(int evenN = 0; evenN <= 50; evenN++){
            if(evenN % 2 != 0){
                continue;
            }
            System.out.print(evenN + " ");
        }
























    }
}
