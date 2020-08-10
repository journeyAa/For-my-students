package WarmUpTasks;
/* 2.  print the following shape:
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * */

public class StarChallenge {
    public static void main(String[] args) {
        for(int v = 0; v < 8; v++){
            for(int i = 0; i <6 ; i++){
                System.out.print("* ");

            }
            System.out.println();
        }


        System.out.println("==========================================================================");

        for (int j = 1; j <= 8; j++){
            for (int i = 1; i <= j; i++)  {
                System.out.print("* ");
            }
            System.out.println();
        }

           }

        }






