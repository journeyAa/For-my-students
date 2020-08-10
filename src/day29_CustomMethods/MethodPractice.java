package day29_CustomMethods;
// create a method that can print odd nums between 1- 100 in a same line seprated by spcae
// create a method that can print even nums between 1- 100
public class MethodPractice {
    public static void main(String[] args) {
        oddNumbers();
        evenNums();















    }
    public static void oddNumbers(){
        for (int i = 1; i <= 100; i+=2) {
            System.out.print(i + " ");

        }
        System.out.println();
    }
    public static void evenNums(){
        for (int i = 1; i <= 100 ; i++) {
            if(i%2==0){
                System.out.print(i+ " ");
            }

        }
    }

}
