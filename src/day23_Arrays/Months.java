package day23_Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        String month[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov","Dec"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num between 1 to 12");
        int n = scan.nextInt();

        System.out.println(month[n-1]);















    }
}
