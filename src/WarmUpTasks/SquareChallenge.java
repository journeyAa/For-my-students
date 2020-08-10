package WarmUpTasks;
/*print the following shape:
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

public class SquareChallenge {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <= 8; i++) {
            System.out.println("*         *");
        }
        for (int i = 1; i <= 6; i++) {
            System.out.print("* ");
        }
    }
}