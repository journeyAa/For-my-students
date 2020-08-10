package Practice_NestedLoop;

public class Practice1 {
    public static void main(String[] args) {

        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("===============================================================");



        for (int l = 1; l<=10; l++) {
            for (int s = 1; s <=6; s++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println("============================================================");

        for (int j = 1; j <= 7; j++) {  // 1, 2, 3, 4, 5, 6, 7// when it is one, one star // 2 stars

            for (int k = 1; k <= j ; k++) {  // max decides by l value which should be uniform with outer loop, one line// two lines
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int s = 1; s <= 7; s++) {  // starting point
            for (int n = s; n <= 7; n++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println();

        for (int p = 7; p>=1 ; p--) {  // ending point
            for (int s = p; s>=1 ; s--) {
                System.out.print("#");
            }
            System.out.println();
        }


























    }
}
