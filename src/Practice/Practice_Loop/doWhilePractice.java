package Practice.Practice_Loop;

public class doWhilePractice {
    public static void main(String[] args) {
// print out 1-20; A-Z
       int num = 1;
        while(num<=20){
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        char ch = 'A';
        while(ch <= 'Z'){
            System.out.print(ch + " ");
            ch++;
        }
        System.out.println();

        int number = 1;

        do{
            System.out.print(number + " ");
            number++;
        }while(number<=20);

        System.out.println();




        char ch1 = 'z';
        do{
            System.out.print(ch1 + " ");
            ch1--;
        }while(ch1>='a');






    }
}
