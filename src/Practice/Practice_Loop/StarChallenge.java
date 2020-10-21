package Practice.Practice_Loop;

public class StarChallenge {
    public static void main(String[] args) {
     /*print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
    3. print the following shape:
                    * * * * * *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    * * * * * *
            Hint: in the loop body , only place the statements that you need to repeat*/



        for (int v = 1; v <= 8; v++) {
            for (int i = 1; i <= 6; i++) {
                System.out.print("* ");

            }
            System.out.println("*");
        }
        System.out.println();



        for (int i = 1; i <= 6; i++) {
            System.out.print("* ");
        }






























    }
}
