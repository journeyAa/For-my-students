package Office_Hours.Practice_07_08_2020;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

public class minimum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 2147483647; // when loop execute 1st time, min = 5;
        // whatever user enters, it will always be less than this num

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int n = scan.nextInt();

            if(min > n){
                min = n;
            }

        }
        System.out.println("min is: " + min);



















    }
}
