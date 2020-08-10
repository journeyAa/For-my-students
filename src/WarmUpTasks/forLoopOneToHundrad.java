package WarmUpTasks;
// write a program that can print the nums between 1 to 100; if the num is divisible by 3, do not print it

public class forLoopOneToHundrad {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {

            if(i % 3 == 0){
                continue;
            }
            System.out.print(i+ " ");
        }








    }
}
