package Practice.Practice_Loop;

public class PrintOddEvenNum {
    public static void main(String[] args) {
        System.out.print("the odd numbers from 0 to 50 are: ");

        for (int i = 1; i < 50; i++) {
            if(i%2 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("======================================================================");
        System.out.print("the even numbers between 0 and 50 are: ");
        for (int i = 0; i <= 50; i++) {
            if(i % 2 == 1){
                continue;
            }
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("===============================================================");

        int num = 80;
        while (num>=20){

            if(num%2==0){
                System.out.print(num + " ");
            }

            num--;
        }
        System.out.println();

        int i = 81;
        while (i >= 20){
            i--;
            if (i % 2==1){
                continue;
            }
            System.out.print(i + " ");
        }
























    }
}
