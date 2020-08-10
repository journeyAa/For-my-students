package day19_SelfPractice;

import java.util.Scanner;

public class domain {
    public static void main(String[] args) {
        /*write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email address");
        String email = scan.nextLine();

        int index1 = email.indexOf("@");
        int index2 = email.lastIndexOf(".");
        String domain = email.substring(index1 + 1, index2);
        System.out.println(domain);







    }
}
